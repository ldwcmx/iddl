/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-parser
 */
package com.it.iddl.parser.sql.objecttree;

import java.util.List;
import java.util.Set;

/**
 * 
 * @author sihai
 *
 */
public class BindVar implements Value {

	private final int index;
	
	public BindVar(int index) {
		this.index=index;
	}
	
	public int getIndex(){
		return this.index;
	}
	
	public void appendSQL(StringBuilder sb) {
		sb.append("?");
		
	}
	
	public Comparable<?> eval(List<Object> args) {
			Object arg=args.get(index);
			if(arg instanceof Comparable<?>){
				return (Comparable<?>)arg;
			}else{
				return UnknowValueObject.getUnknowValueObject();
			}
			
	}
	
	public String getNestedColName() {
		return null;
	}
	
	public StringBuilder regTableModifiable(Set<String> oraTabName, List<Object> list,
			StringBuilder sb) {
		sb.append("?");
		return sb;
	}
	
	public final Comparable<?> eval() {
		return this;
	}
	
	public Comparable<?> getValue(List<Object> args) {
		Object arg=args.get(index);
		if(arg instanceof Comparable<?>){
			return (Comparable<?>)arg;
		}else{
			return UnknowValueObject.getUnknowValueObject();
		}
	}
	
	@Override
	public String toString() {
		return "[Bind value,index="+index+"]";
	}
	
	public int compareTo(Object o) {
		throw new IllegalStateException("should not be here");
	}
}
