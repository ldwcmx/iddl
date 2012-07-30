/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-parser
 */
package com.it.iddl.parser;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import junit.framework.TestCase;

import org.antlr.runtime.TokenRewriteStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.junit.Test;

import com.it.iddl.parser.oracle.OracleParserLexer;
import com.it.iddl.parser.oracle.OracleParserParser;
import com.it.iddl.parser.oracle.OracleWalker;
import com.it.iddl.parser.sql.objecttree.SQLAndTableAtParser;
import com.it.iddl.parser.sql.objecttree.oracle.function.OracleConsistStringRegister;
import com.it.iddl.parser.sql.objecttree.oracle.function.OracleFunctionRegister;
import com.it.iddl.parser.sql.objecttree.oracle.function.OracleHintRegister;
import com.it.iddl.parser.sql.objecttree.output.handler.impl.HandlerContainer;

/**
 * 
 * @author sihai
 * 
 */
public class SQLParserImplTest extends TestCase {

	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	@Test
	public void test() {
		String sql = "select  /*+ index(ff,IDX_AUC_FEED_SUSPEND_auction_feedbacks) */ "
				+ "* FROM  auction_feedbacks ff "
				+ "WHERE ff.SUSPENDED=? AND "
				+ "(ff.MODIFY_FROM IS NULL OR (ff.MODIFY_FROM=0 OR ff.MODIFY_FROM=3)) "
				+ "AND ff.TRADE_FINISHED_DATE<=SYSDATE and ROWNUM <?";
		Date d = new Date();
		SQLParserImpl pa = new SQLParserImpl();

		long time = System.currentTimeMillis();
		pa.parseSQL(sql, false);
		System.out.println(System.currentTimeMillis() - time);
		List<Object> param = new ArrayList<Object>();
		param.add(2);
		// param.add(d);
		param.add(4);
		assertEquals(-1000, pa.getLimitFrom(sql, param));
		assertEquals(3, pa.getLimitTo(sql, param));
		Set<Map<String, String>> tables = new HashSet<Map<String, String>>();
		Map<String, String> tab = new HashMap<String, String>(1);
		tab.put("auction_feedbacks", "tab1");
		tables.add(tab);
		HandlerContainer hand = new HandlerContainer();
		hand.changeTable();
		hand.changeRange(100, 120);
		hand.changeIndex();
		List<SQLAndTableAtParser> str = pa.getSQLReadyToRun(sql, tables, param,
				hand);
		assertEquals(
				"SELECT /*+ INDEX(ff,IDX_AUC_FEED_SUSPEND_tab1) */ "
						+ "* FROM tab1 ff  "
						+ "WHERE ff.SUSPENDED = ? and "
						+ "(ff.MODIFY_FROM is null or ff.MODIFY_FROM = 0 or ff.MODIFY_FROM = 3) "
						+ "and ff.TRADE_FINISHED_DATE <= SYSDATE and ROWNUM < ?",
				str.get(0).sql);
	}

	@Test
	public void t1() throws Exception {
		String sql = "select  /*+ index(ff IDX_AUC_FEED_SUSPEND_auction_feedbacks) */ "
				+ "* FROM  auction_feedbacks ff "
				+ "WHERE ff.SUSPENDED=? AND "
				+ "(ff.MODIFY_FROM IS NULL OR (ff.MODIFY_FROM=0 OR ff.MODIFY_FROM=3)) "
				+ "AND ff.TRADE_FINISHED_DATE<=SYSDATE and ROWNUM <?";
		Date d = new Date();
		SQLParserImpl pa = new SQLParserImpl();

		long time = System.currentTimeMillis();
		pa.parseSQL(sql, false);
		System.out.println(System.currentTimeMillis() - time);
		List<Object> param = new ArrayList<Object>();
		param.add(2);
		// param.add(d);
		param.add(4);
		assertEquals(-1000, pa.getLimitFrom(sql, param));
		assertEquals(3, pa.getLimitTo(sql, param));
		Set<Map<String, String>> tables = new HashSet<Map<String, String>>();
		Map<String, String> tab = new HashMap<String, String>(1);
		tab.put("auction_feedbacks", "tab1");
		tables.add(tab);

		HandlerContainer hand = new HandlerContainer();
		hand.changeTable();
		hand.changeRange(100, 120);
		hand.changeIndex();
		List<SQLAndTableAtParser> str = pa.getSQLReadyToRun(sql, tables, param,
				hand);
		assertEquals(
				"SELECT /*+ INDEX(ff,IDX_AUC_FEED_SUSPEND_tab1) */ "
						+ "* FROM tab1 ff  "
						+ "WHERE ff.SUSPENDED = ? and "
						+ "(ff.MODIFY_FROM is null or ff.MODIFY_FROM = 0 or ff.MODIFY_FROM = 3) "
						+ "and ff.TRADE_FINISHED_DATE <= SYSDATE and ROWNUM < ?",
				str.get(0).sql);
	}

	@Test
	public void t2() throws Exception {
		String sql = "select /*+ index (t,IDX_AUC_FEED_RATER_auction_feedbacks) */ "
				+ "sum(rate) "
				+ "from auction_feedbacks t where rater_user_id=? "
				+ "and rated_user_id=? and suspended=0 "
				+ "and validscore=1 and rater_type=? "
				+ "and trade_closingdate>=trunc(?,'mm') "
				+ "and trade_closingdate<trunc(last_day(?))+1 " + "and id<>?";
		SQLParserImpl pa = new SQLParserImpl();
		pa.parseSQL(sql, false);
		List<Object> param = new ArrayList<Object>();
		param.add(2);
		param.add(2);
		param.add(3);
		param.add(2);
		param.add(2);
		param.add(3);
		assertEquals(-1000, pa.getLimitFrom(sql, param));
		assertEquals(-1000, pa.getLimitTo(sql, param));
		Set<Map<String, String>> tables = new HashSet<Map<String, String>>();
		Map<String, String> tab = new HashMap<String, String>(1);
		tab.put("auction_feedbacks", "tab1");
		tables.add(tab);

		HandlerContainer hand = new HandlerContainer();
		hand.changeTable();
		hand.changeRange(100, 120);
		hand.changeIndex();
		List<SQLAndTableAtParser> str = pa.getSQLReadyToRun(sql, tables, param,
				hand);
		assertEquals("SELECT /*+ INDEX(t,IDX_AUC_FEED_RATER_tab1) */ "
				+ "SUM(rate) " + "FROM tab1 t  WHERE rater_user_id = ? "
				+ "and rated_user_id = ? and suspended = 0 "
				+ "and validscore = 1 and rater_type = ? "
				+ "and trade_closingdate >= TRUNC(?,'mm') "
				+ "and trade_closingdate < (TRUNC(LAST_DAY(?)) + 1) "
				+ "and id <> ?", str.get(0).sql);
	}

	@Test
	public void t3() throws Exception {
		String sql = "select /*+ ordered use_nl(t,ff) */ "
				+ "ff.id,ff.RATER_UID,ff.AUC_NUM_ID "
				+ "FROM "
				+ "(SELECT rid FROM "
				+ "(SELECT rid, rownum as rn FROM "
				+ "(SELECT rowid rid FROM auction_feedbacks "
				+ "WHERE (nvl(anony,0)=0 or rater_type = 0) ORDER BY feedbackdate DESC) "
				+ "WHERE rownum <= ?) t WHERE rn >= ?) t, "
				+ "auction_feedbacks ff " + "WHERE t.rid = ff.rowid";
		SQLParserImpl pa = new SQLParserImpl();

		long time = System.currentTimeMillis();
		pa.parseSQL(sql, false);
		System.out.println((System.currentTimeMillis()) - time);
		List<Object> param = new ArrayList<Object>();
		param.add(24);
		param.add(20);
		assertEquals(19, pa.getLimitFrom(sql, param));
		assertEquals(24, pa.getLimitTo(sql, param));
		Set<Map<String, String>> tables = new HashSet<Map<String, String>>();
		Map<String, String> tab = new HashMap<String, String>(1);
		tab.put("auction_feedbacks", "tab1");
		tables.add(tab);

		HandlerContainer hand = new HandlerContainer();
		hand.changeTable();
		hand.changeRange(100, 120);
		// in = 以往的测试。
		List<SQLAndTableAtParser> str = pa.getSQLReadyToRun(sql, tables, param,
				hand);
		assertEquals(
				"SELECT /*+ ORDERED USE_NL(t,ff) */ "
						+ "ff.id,ff.RATER_UID,ff.AUC_NUM_ID "
						+ "FROM "
						+ "(SELECT rid FROM "
						+ "(SELECT rid,rownum as rn FROM "
						+ "(SELECT rowid as rid FROM tab1  "
						+ "WHERE NVL(anony,0) = 0 or rater_type = 0 ORDER BY feedbackdate DESC )  "
						+ "WHERE rownum <= ?) t  WHERE rn >= ?) t,"
						+ "tab1 ff  WHERE t.rid = ff.rowid", str.get(0).sql);
	}

	@Test
	public void testa() throws Exception {
		String sql = "select  /*+ index(ff,IDX_AUC_FEED_SUSPEND_auction_feedbacks) */ "
				+ "* FROM  auction_feedbacks ff "
				+ "WHERE ff.SUSPENDED=? AND "
				+ "(ff.MODIFY_FROM IS NULL OR (ff.MODIFY_FROM=0 OR ff.MODIFY_FROM=3)) "
				+ "AND ff.TRADE_FINISHED_DATE<=SYSDATE and ROWNUM <?";
		long time = System.currentTimeMillis();
		test(sql);
		System.out.println((System.currentTimeMillis()) - time);

		sql = "SELECT seq_auction_feedbacks_id.NEXTVAL FROM DUAL";
		time = System.currentTimeMillis();
		test(sql);
		System.out.println((System.currentTimeMillis()) - time);
		sql = "select /*+ ordered use_nl(t,ff) */ "
				+ "ff.id,ff.RATER_UID,ff.AUC_NUM_ID "
				+ "FROM "
				+ "(SELECT rid FROM "
				+ "(SELECT rid, rownum as rn FROM "
				+ "(SELECT rowid rid FROM auction_feedbacks "
				+ "WHERE (nvl(anony,0)=0 or rater_type = 0) ORDER BY feedbackdate DESC) "
				+ "WHERE rownum <= ?) t WHERE rn >= ?) t, "
				+ "auction_feedbacks ff " + "WHERE t.rid = ff.rowid";
		time = System.currentTimeMillis();
		test(sql);
		System.out.println((System.currentTimeMillis()) - time);
		sql = "select * from auction_feedbacks t where t.id=3000001889";
		time = System.currentTimeMillis();
		test(sql);
		System.out.println((System.currentTimeMillis()) - time);
	}

	@Test
	public void testb() throws Exception {
		Random r = new Random();
		long time = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			int l = r.nextInt(100000);
			String sql = "select /*+ ordered use_nl(t,ff) */ "
					+ "ff.id,ff.RATER_UID,ff.AUC_NUM_ID " + "FROM "
					+ "(SELECT rid FROM " + "(SELECT rid, rownum as rn FROM "
					+ "(SELECT rowid rid FROM auction_feedbacks" + l + " "
					+ "WHERE (nvl(anony,0)=" + l
					+ " or rater_type = 0) ORDER BY feedbackdate DESC) "
					+ "WHERE rownum <= ?) t WHERE rn >= ?) t, "
					+ "auction_feedbacks ff " + "WHERE t.rid = ff.rowid";
			testNew(sql);
		}
		System.out.println((System.currentTimeMillis()) - time);
	}

	OracleParserLexer pl1 = new OracleParserLexer();
	TokenRewriteStream tokens1 = new TokenRewriteStream();

	@Test
	public void testNew(String sql) throws Exception {
		AntlrStringStream st = new AntlrStringStream(sql);
		OracleWalker.beg_return ret = null;
		pl1.setCharStream(st);
		tokens1.setTokenSource(pl1);
		OracleParserParser pa = new OracleParserParser(tokens1);
		pa.setFunctionRegister(OracleFunctionRegister.register);
		pa.setOracleHintRegister(OracleHintRegister.register);
		pa.setConsistStringRegister(OracleConsistStringRegister.register);

		OracleParserParser.beg_return beg = null;
		beg = pa.beg();
		CommonTree tree = (CommonTree) beg.getTree();
		CommonTreeNodeStream nodes = new CommonTreeNodeStream(tree);
		nodes.setTokenStream(tokens1);

		OracleWalker walker = new OracleWalker(nodes);
		walker.setFunctionRegister(OracleFunctionRegister.register);
		walker.setConsistStringRegister(OracleConsistStringRegister.register);
		walker.setOracleHint(OracleHintRegister.register);
		ret = walker.beg();

	}

	@Test
	public void test(String sql) throws Exception {
		long t = System.currentTimeMillis();
		AntlrStringStream st = new AntlrStringStream(sql);
		System.out.println("T1:" + (System.currentTimeMillis() - t));
		t = System.currentTimeMillis();
		OracleWalker.beg_return ret = null;
		OracleParserLexer pl = new OracleParserLexer(st);

		System.out.println("T2:" + (System.currentTimeMillis() - t));
		t = System.currentTimeMillis();
		TokenRewriteStream tokens = new TokenRewriteStream(pl);

		System.out.println("T3:" + (System.currentTimeMillis() - t));
		t = System.currentTimeMillis();
		OracleParserParser pa = new OracleParserParser(tokens);
		pa.setTokenStream(tokens);
		System.out.println("T4:" + (System.currentTimeMillis() - t));
		t = System.currentTimeMillis();
		pa.setFunctionRegister(OracleFunctionRegister.register);
		pa.setOracleHintRegister(OracleHintRegister.register);
		pa.setConsistStringRegister(OracleConsistStringRegister.register);

		OracleParserParser.beg_return beg = null;
		beg = pa.beg();

		System.out.println("T5:" + (System.currentTimeMillis() - t));
		t = System.currentTimeMillis();
		CommonTree tree = (CommonTree) beg.getTree();
		CommonTreeNodeStream nodes = new CommonTreeNodeStream(tree);
		nodes.setTokenStream(tokens);

		System.out.println("T6:" + (System.currentTimeMillis() - t));
		t = System.currentTimeMillis();
		OracleWalker walker = new OracleWalker(nodes);
		walker.setFunctionRegister(OracleFunctionRegister.register);
		walker.setConsistStringRegister(OracleConsistStringRegister.register);
		walker.setOracleHint(OracleHintRegister.register);
		ret = walker.beg();

		System.out.println("T6:" + (System.currentTimeMillis() - t));
		t = System.currentTimeMillis();
	}

	@Test
	public void t4() throws Exception {
		String sql = "SELECT seq_auction_feedbacks_id.NEXTVAL FROM DUAL";
		SQLParserImpl pa = new SQLParserImpl();
		pa.parseSQL(sql, false);
		List<Object> param = new ArrayList<Object>();
		Set<Map<String, String>> tables = new HashSet<Map<String, String>>();
		Map<String, String> tab = new HashMap<String, String>(1);
		tab.put("auction_feedbacks", "tab1");
		tables.add(tab);

		HandlerContainer hand = new HandlerContainer();
		hand.changeTable();
		hand.changeRange(100, 120);
		// in = 以往的测试。

		List<SQLAndTableAtParser> str = pa.getSQLReadyToRun(sql, tables, param,
				hand);
		assertEquals("SELECT seq_auction_feedbacks_id.NEXTVAL FROM DUAL ", str
				.get(0).sql);
	}

	@Test
	public void t5() throws Exception {
		String sql = "select * from auction_feedbacks t where t.id=3000001889";
		SQLParserImpl pa = new SQLParserImpl();
		long time = System.currentTimeMillis();
		pa.parseSQL(sql, false);
		System.out.println(System.currentTimeMillis() - time);
		List<Object> param = new ArrayList<Object>();
		Set<Map<String, String>> tables = new HashSet<Map<String, String>>();
		Map<String, String> tab = new HashMap<String, String>(1);
		tab.put("auction_feedbacks", "tab1");
		tables.add(tab);

		HandlerContainer hand = new HandlerContainer();
		hand.changeRange(100, 120);
		// in = 以往的测试。

		List<SQLAndTableAtParser> str = pa.getSQLReadyToRun(sql, tables, param,
				hand);
		assertEquals(
				"SELECT * FROM auction_feedbacks t  WHERE t.id = 3000001889",
				str.get(0).sql);
	}
}
