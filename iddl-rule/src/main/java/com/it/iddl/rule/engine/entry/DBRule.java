/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-rule
 */
package com.it.iddl.rule.engine.entry;

import java.util.HashMap;
import java.util.Map;

/**
 * 对应xml里面的DBRule
 * 
 * @author sihai
 *
 */
public class DBRule {

	private Map<String, Integer> posiMap = new HashMap<String, Integer>();

	/**
	 * 分库参数
	 */
	private String parameters = "";
	/**
	 * 对应表达式
	 */
	private String expression = "";

	/**
	 * 主键id为何
	 */
	private Map<String, Integer> primaryPosiMap = new HashMap<String, Integer>();
	private String primaryKey = "";
	/**
	 * 主键的表达式
	 */
	private String primaryKeyExpression = "";

	/**
	 * 写池
	 */
	private String[] writePool;
	/**
	 * 读池
	 */
	private String[] readPool;
	
	/**
	 * 子表名规则，如果有子表名规则，那么会代替globe表名规则作用于这个DBRule上
	 */

	private TableRule DBSubTabRule;

	public Map<String, Integer> getPosiMap() {
		return posiMap;
	}

	public TableRule getDBSubTabRule() {
		return DBSubTabRule;
	}

	public void setDBSubTabRule(TableRule subTabRule) {
		DBSubTabRule = subTabRule;
	}

	public String getExpression() {
		return expression;
	}

	/**
	 * 
	 * @param expression
	 */
	public void setExpression(String expression) {
		if(expression!=null){
			this.expression = expression.toLowerCase();
		}

	}


	public void setParameters(String parameters) {
		if (parameters != null) {
			this.parameters = parameters.toLowerCase();
			String[] paramsTokens = this.parameters.split(",");
			int i = 0;
			for (String str : paramsTokens) {
				posiMap.put(str, i);
				i++;
			}
		} 

	}

	public String getParameters() {
		return parameters;
	}

	public String[] getWritePool() {
		return writePool;
	}

	public void setWritePool(String[] writePool) {
		this.writePool = writePool;
	}

	public String[] getReadPool() {
		return readPool;
	}

	public void setReadPool(String[] readPool) {
		this.readPool = readPool;
	}

	public String getPrimaryKeyExpression() {
		return primaryKeyExpression;
	}

	public void setPrimaryKeyExpression(String primaryKeyExpression) {
		if(primaryKeyExpression!=null){
			this.primaryKeyExpression = primaryKeyExpression.toLowerCase();
		}
	}

	public String getPrimaryKey() {
		return primaryKey;
	}

	public void setPrimaryKey(String primaryKey) {
		if (primaryKey != null) {
			if (primaryKey.contains(",")) {
				throw new IllegalArgumentException("不能有两个或多个主键");
			}
			this.primaryKey = primaryKey.toLowerCase();
			if (this.primaryKey != null) {
				String[] paramsTokens = this.primaryKey.split(",");
				int i = 0;
				for (String str : paramsTokens) {
					primaryPosiMap.put(str, i);
					i++;
				}
			}
		}
	}

	public Map<String, Integer> getPrimaryPosiMap() {
		return primaryPosiMap;
	}
}
