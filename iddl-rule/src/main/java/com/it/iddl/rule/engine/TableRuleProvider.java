/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-rule
 */
package com.it.iddl.rule.engine;

import java.util.Map;
import java.util.Set;

import com.it.iddl.common.Config;
import com.it.iddl.common.exception.checked.IDDLCheckedException;
import com.it.iddl.parser.sql.objecttree.Comparative;
import com.it.iddl.rule.engine.entry.TableRule;

/**
 * 
 * @author sihai
 *
 */
public interface TableRuleProvider {

	/**
	 * 获取表名列表 
	 * 目前不支持的情况如下：
	 * and关系只支持两个组合在一起。目前不支持的关系有这样4类：
	 * <p>1.多个and连续组成的条件</p>
	 * <p>如：假设一个column为id.
	 * id > x and id < y and id > z ……这样的连续id组成的条件队列</p>
	 * <p>return:会抛出异常</p>
	 * <p>2.不同的column组成的条件 </p>
	 * <p>return:本身都不支持。</p>
	 * <p>3.or有优先级的条件组合。</p>
	 * <p>如：假设一个column为id.
	 * id > x and ( id = y or id =z )</p>
	 * <p>return :抛出异常。</p>
	 * <p>4.and关系中是两个关系，但是是这样的关系：
	 * id > x and id=x.</p>
	 * <p>return:抛出异常：“and有两个，但至少有一个条件为等于”。</p>
	 * @param map 参数key value对
	 * @param tableRule 表规则
	 * @param vTabName 虚拟表名
	 * @param config pk配置文件
	 * @return
	 * @throws TDLCheckedExcption
	 */
	Set<String> getTables(Map<String, Comparative> map, TableRule tableRule, String vTabName, Config config) throws IDDLCheckedException;
}
