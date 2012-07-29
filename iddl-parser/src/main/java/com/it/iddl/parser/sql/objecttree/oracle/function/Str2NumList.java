/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-parser
 */
package com.it.iddl.parser.sql.objecttree.oracle.function;

import java.util.List;

import com.it.iddl.parser.sql.function.OneArgFunction;
import com.it.iddl.parser.sql.objecttree.Comparative;
import com.it.iddl.parser.sql.objecttree.ComparativeOR;
import com.it.iddl.parser.util.Utils;

/**
 * 
 * @author sihai
 *
 */
public class Str2NumList extends OneArgFunction {

	@Override
	public String getFunctionName() {
		return "STR2NUMLIST";
	}
	
	@Override
	public Comparable<?> getValue(List<Object> args) {
		Comparable<?> var=Utils.getVal(args, arg1);
		return Str2NumberList(var);
	}
	
	private static Comparable<?> Str2NumberList(Comparable<?> val) {
		String[] argList;
		if(val instanceof String){
			argList=((String)val).split(",");
		}else{
			throw new IllegalArgumentException("不应该出现除string以外其他类型的参数");
		}
		return buildOr(argList);
	}
	
	private static Comparable<?> buildOr(String[] argList) {
		ComparativeOR or=new ComparativeOR();
		for(Comparable<?> arg:argList){
			Long tempint=Long.valueOf((String)arg);
			or.addComparative(new Comparative(Comparative.EQUIVALENT,tempint));
		}
		return or;
	}
}