/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-parser
 */
package com.it.iddl.parser;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.it.iddl.parser.sql.function.GroupFunctionType;
import com.it.iddl.parser.sql.objecttree.GroupByElement;
import com.it.iddl.parser.sql.objecttree.InExpressionObject;
import com.it.iddl.parser.sql.objecttree.OrderByElement;
import com.it.iddl.parser.sql.objecttree.SQLAndTableAtParser;
import com.it.iddl.parser.sql.objecttree.output.handler.impl.HandlerContainer;

/**
 * SQL解析结果
 * @author sihai
 *
 */
public interface SQLParserResult {

	/**
	 * 获取当前表名
	 * @return
	 */
	Set<String> getTableName();
	
	/**
	 * 获取sql的SKIP值如果有的话，没有的情况下会返回DEFAULT值
	 * TODO 考虑把参数去掉。因为在解析这个对象时，已经将param传给过解析器了
	 * @param param
	 * @return
	 */
	int getSkip(List<Object> parameterList);
	
	/**
	 * 获取sql的max值如果有的话，没有的话会返回DEFAULT值
	 * TODO 考虑把参数去掉。因为在解析这个对象时，已经将param传给过解析器了
	 * @param param
	 * @return
	 */
	int getMax(List<Object> parameterList);
	
	/**
	 * 或许当前sql的最外层的group function.如果有且仅有一个group function,那么使用该function
	 * 如果没有group function或者有多个group function.则返回NORMAL
	 * 
	 * @return
	 */
	GroupFunctionType getGroupFunctionType();
	
	/**
	 * 获取order by 的信息
	 * @return
	 */
	List<OrderByElement> getOrderByElementList();
	
	/**
	 * 获取group by 信息
	 * @return
	 */
	List<GroupByElement> getGroupByElementList();
	
	/**
	 * 反向输出的接口
	 * @param tables
	 * @param args
	 * @param skip
	 * @param max
	 * @param outputType
	 * @param modifiedMap
	 * @return
	 */
	public List<SQLAndTableAtParser> getSQLReadyToRun(Collection<Map<String/*虚拟表名*/, String/*真实表名*/>> tables, List<Object> args, HandlerContainer handlerContainer);
	
	 /**
	  * 获取结果集筛选器
	 * @return
	 */
	ComparativeMapChoicer getComparativeMapChoicer();
	
	/**
	 * @tofix 已经将Distinct 当做了一个方法， Distinct 和后面的column，一起作为一个Function column,
	 *        此处继续保留这个Distinct，作为一个冗余，是因为后面的分库分表时的代码需要调用这个属性来进行操作!
	 *        此Distinct只作为冗余，根据Parser结果对象方向输出组成SQL的String时将不再输出此Distinct--add by
	 *        mazhidan.pt
	 *        
	 */
	public List<String> getDistinctColumn();
	
	/**
	 * 判定是否存在having
	 * @return
	 */
	public boolean hasHavingCondition();
	
	/**
	 * 取得in 信息
	 * 实现类保证这个List不会为null
	 * @return
	 */
	public List<InExpressionObject> getInExpressionObjectList();
}
