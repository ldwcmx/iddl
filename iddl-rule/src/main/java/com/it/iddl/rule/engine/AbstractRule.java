/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-rule
 */
package com.it.iddl.rule.engine;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.it.iddl.rule.AdvancedParameter;

/**
 * 
 * 规则的总抽象 规则由参数和表达式组成
 * 
 * @author sihai
 *
 */
public abstract class AbstractRule {

	protected static final Log logger = LogFactory.getLog(AbstractRule.class);
	
	protected String expression;			// 表达式
	protected String extralPackagesString;	// 用户自定义jar包package
	protected Set<AdvancedParameter> parameters;
	
	/**
	 * 子类初始化
	 */
	protected abstract void internalInit();
	
	/**
	 * 
	 */
	public void init() {
		internalInit();
	}
	
	/**
	 * 
	 * @param parameters
	 */
	public void setParameters(Set<String> parameters) {
		if (this.parameters == null) {
			this.parameters = new HashSet<AdvancedParameter>();
		}
		for (String str : parameters) {
			AdvancedParameter advancedParameter = AdvancedParameter.getAdvancedParamByParamTokenNew(str,false);
			this.parameters.add(advancedParameter);
		}
	}
	
	/**
	 * 
	 * @param parameters
	 */
	public void setAdvancedParameter(Set<AdvancedParameter> parameters) {
		if (this.parameters == null) {
			this.parameters = new HashSet<AdvancedParameter>();
		}
		for (AdvancedParameter keyAndAtomIncValue : parameters) {
			this.parameters.add(keyAndAtomIncValue);
		}
	}
	
	/**
	 * spring注入一个
	 * 
	 * @param parameter
	 */
	public void setAdvancedParameter(AdvancedParameter parameter) {
		if (this.parameters == null) {
			this.parameters = new HashSet<AdvancedParameter>();
		}
		this.parameters.add(parameter);
	}
	
	public Set<AdvancedParameter> getParameters() {
		return parameters;
	}

	public String getExpression() {
		return expression;
	}

	public void setExpression(String expression) {
		if (expression != null)
			this.expression = expression;
	}

	public void setExtralPackagesString(String extralPackagesString) {
		this.extralPackagesString = extralPackagesString;
	}

	/**
	 * col,1,7|col1,1,7....
	 * 
	 * @param parameterArray
	 */
	public void setParameter(String parameterArray) {
		if (parameterArray != null && parameterArray.length() != 0) {
			String[] paramArray = parameterArray.split("\\|");
			Set<String> paramSet = new HashSet<String>(Arrays
					.asList(paramArray));
			this.setParameters(paramSet);
		}
	}
}
