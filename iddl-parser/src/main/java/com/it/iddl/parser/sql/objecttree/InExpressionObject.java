/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-parser
 */
package com.it.iddl.parser.sql.objecttree;

import java.util.List;

/**
 * 
 * @author sihai
 *
 */
public class InExpressionObject {

	public final String columnName;				//
    public final String alias;					//
    public final List<Integer>  bindVarIndexs;	//
    //statement case,like: id in(1,2,3,4)		
    public final List<Object> bindVarValues;	//
    public final String  inString;				//
    
    public InExpressionObject(String columnName, String alias, List<Integer> bindVarIndexs, List<Object> bindVarValues, String inString){
		this.columnName = columnName;
		this.alias = alias;
		this.bindVarIndexs = bindVarIndexs;
		this.bindVarValues = bindVarValues;
		this.inString = inString;
    }
}
