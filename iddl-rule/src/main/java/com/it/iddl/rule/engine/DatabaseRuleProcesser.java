/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-rule
 */
package com.it.iddl.rule.engine;

import java.util.List;
import java.util.Map;

import com.it.iddl.parser.sql.objecttree.Comparative;
import com.it.iddl.rule.TargetDB;

/**
 * 
 * @author sihai
 *
 */
public interface DatabaseRuleProcesser {

	/**
	 * 根据虚拟表名，sql中分库分表信息字段，以及配置文件，获取分库的源信息
	 * @param virtualTableName
	 * @param columnMap
	 * @param logTabs
	 * @return
	 */
	public List<TargetDB> process(String virtualTableName, Map<String, Comparative> columnMap, LogicTabMatrix logTabs);
}
