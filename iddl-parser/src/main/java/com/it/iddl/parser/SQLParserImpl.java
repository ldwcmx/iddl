/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-parser
 */
package com.it.iddl.parser;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenRewriteStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.it.iddl.parser.sql.objecttree.DMLCommon;
import com.taobao.tddl.common.util.NagiosUtils;
import com.taobao.tddl.parser.AntlrStringStream;
import com.taobao.tddl.parser.ParserCache;
import com.taobao.tddl.parser.mysql.MySQLParserLexer;
import com.taobao.tddl.parser.mysql.MySQLParserParser;
import com.taobao.tddl.parser.mysql.MySQLWalker;
import com.taobao.tddl.parser.oracle.OracleParserLexer;
import com.taobao.tddl.parser.oracle.OracleParserParser;
import com.taobao.tddl.parser.oracle.OracleWalker;
import com.taobao.tddl.sqlobjecttree.mysql.function.MySQLConsistStringRegister;
import com.taobao.tddl.sqlobjecttree.mysql.function.MySQLFunctionRegister;
import com.taobao.tddl.sqlobjecttree.oracle.function.OracleConsistStringRegister;
import com.taobao.tddl.sqlobjecttree.oracle.function.OracleFunctionRegister;
import com.taobao.tddl.sqlobjecttree.oracle.function.OracleHintRegister;


/**
 * SQL Parser
 * @author sihai
 *
 */
public class SQLParserImpl {

	private static final Log logger = LogFactory.getLog(SQLParserImpl.class);
	
	private final ParserCache globalCache = ParserCache.instance();			// cache
	
	/**
	 * 尝试从cache中取该sql,如果未取到，则分析该sql并初始化。
	 * 
	 * 最坏情况是多次初始化，但因为key一致，同一条sql分析并初始化以后的结果是一致的
	 * 
	 * 但有可能因为乱序发生put在init之前的问题,因此整个加锁。
	 * @param sql
	 */
	public DMLCommon parseSQL(String sql) {
		return nestedParseSql(sql,true);
	}
	
	public DMLCommon parseSQL(String sql,boolean isMysql){
		 return nestedParseSql(sql, isMysql);
	}
	
	private DMLCommon nestedParseSql(final String sql,final boolean isMysql) {
		if (sql == null) {
			throw new IllegalArgumentException("sql must not be null");
		}
		//为了防止多次重复初始化，所以使用了future task来确保初始化只进行一次
		FutureTask<DMLCommon> future = globalCache.getFutureTask(sql);
		if (future == null) {
			Callable<DMLCommon> handle = new Callable<DMLCommon>() {
				public DMLCommon call() throws Exception {
					final DMLCommon com = getDMLCommonObject(sql, isMysql);
					com.init();
					log.info("successfully parse a sql");
					log.info("original sql:"+sql);
					StringBuilder sb = new StringBuilder();
					com.appendSQL(sb);
					log.info("parsed sql:"+sb.toString());
					return com;
				}


			};
			future = new FutureTask<DMLCommon>(handle);
			future = globalCache.setFutureTaskIfAbsent(sql,future);
			future.run();
		}
		//确保抛出异常
		DMLCommon dmlcommon = null;
		try {
			dmlcommon = future.get();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return dmlcommon;
	}
	
	/**
	 * Antlr分析sql，返回用java对象表示的SQL。
	 * 
	 * @param sql
	 * @param isMysql
	 * @return
	 */
	private DMLCommon getDMLCommonObject(String sql,
			final boolean isMysql) {
		final DMLCommon com;
		try {
			AntlrStringStream st = new AntlrStringStream(sql);
			if (isMysql) {
				MySQLWalker.beg_return ret = null;
				MySQLParserLexer pl = new MySQLParserLexer(
						st);
				TokenRewriteStream tokens = new TokenRewriteStream(
						pl);
				MySQLParserParser pa = new MySQLParserParser(
						tokens);

				pa.setFunc(MySQLFunctionRegister.reg);
				pa
						.setConsist(MySQLConsistStringRegister.reg);
				MySQLParserParser.beg_return beg = null;
				beg = pa.beg();
				CommonTree tree = (CommonTree) beg
						.getTree();
				log.debug(tree.toStringTree());
				CommonTreeNodeStream nodes = new CommonTreeNodeStream(
						tree);
				nodes.setTokenStream(tokens);
				MySQLWalker walker = new MySQLWalker(nodes);
				walker.setFunc(MySQLFunctionRegister.reg);
				walker
						.setConsist(MySQLConsistStringRegister.reg);
				ret = walker.beg();
				com = ret.obj;
			} else {
				OracleWalker.beg_return ret = null;
				OracleParserLexer pl = new OracleParserLexer(
						st);
				TokenRewriteStream tokens = new TokenRewriteStream(
						pl);
				OracleParserParser pa = new OracleParserParser(
						tokens);

				pa.setFunc(OracleFunctionRegister.reg);
				pa.setOracleHint(OracleHintRegister.reg);
				pa
						.setConsist(OracleConsistStringRegister.reg);

				OracleParserParser.beg_return beg = null;
				beg = pa.beg();
				CommonTree tree = (CommonTree) beg
						.getTree();
				log.debug(tree.toStringTree());
				CommonTreeNodeStream nodes = new CommonTreeNodeStream(
						tree);
				nodes.setTokenStream(tokens);
				OracleWalker walker = new OracleWalker(
						nodes);
				walker.setFunc(OracleFunctionRegister.reg);
				walker
						.setConsist(OracleConsistStringRegister.reg);
				walker
						.setOracleHint(OracleHintRegister.reg);
				ret = walker.beg();
				com = ret.obj;
			}
		} catch (RecognitionException e) {
			NagiosUtils.addNagiosLog(NagiosUtils.KEY_SQL_PARSE_FAIL, 1);
			throw new RuntimeException("分析sql错误，错误的sql是:"
					+ sql, e);
		}
		return com;
	}
}
