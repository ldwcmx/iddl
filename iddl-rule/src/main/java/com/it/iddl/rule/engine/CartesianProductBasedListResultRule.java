/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-rule
 */
package com.it.iddl.rule.engine;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.taobao.tddl.interact.rule.enumerator.Enumerator;
import com.taobao.tddl.interact.rule.enumerator.EnumeratorImp;


/**
 * 结果集是一列数的规则
 * 
 * @author sihai
 *
 */
public abstract class CartesianProductBasedListResultRule extends ListAbstractResultRule {

	private final Log logger = LogFactory.getLog(CartesianProductBasedListResultRule.class);
	Enumerator enumerator = new EnumeratorImp();
}
