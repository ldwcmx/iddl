/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-parser
 */
package com.it.iddl.parser.sql.objecttree;

/**
 * 
 * @author sihai
 *
 */
public class UnknowValueObject implements  Comparable<Object> {

	public static final UnknowValueObject valObj=new UnknowValueObject();
	
	/**
	 * 
	 * @return
	 */
	public static Comparable<?> getUnknowValueObject(){
		return valObj;
	}
	
	/**
	 * 
	 */
    public int compareTo(Object arg0) {
        throw new UnsupportedOperationException("还不支持使用这个函数作为分库条件字段");
    }
}
