/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-rule
 */
package com.it.iddl.rule.enumerator;

import com.it.iddl.parser.sql.objecttree.Comparative;

/**
 * 
 * @author sihai
 *
 */
public class EnumerationInterruptException extends RuntimeException {

	private transient  Comparative comparative;
	
	public EnumerationInterruptException(Comparative comparative){
		this.comparative = comparative;
	}
	
	public EnumerationInterruptException(){
	}
	
	public Comparative getComparative() {
		return comparative;
	}
	
	public void setComparative(Comparative comparative) {
		this.comparative = comparative;
	}
}
