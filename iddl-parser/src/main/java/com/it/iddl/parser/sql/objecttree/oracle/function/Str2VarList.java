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
public class Str2VarList extends OneArgFunction{

	@Override
	public String getFunctionName() {
		return "STR2VARLIST";
	}
	
	@Override
	public Comparable<?> getValue(List<Object> args) {
		Comparable<?> var=Utils.getVal(args, arg1);
		return Str2StrList(var);
	}
	
	private static Comparable<?> Str2StrList(Comparable<?> val) {
		String[] argList;
		if(val instanceof String){
			argList=((String)val).split(",");
		}else{
			throw new IllegalArgumentException("不应该出现除string以外其他类型的参数,当前参数为:"+val);
		}
		return buildOr(argList);
	}
	
	private static Comparable<?> buildOr(String[] argList) {
		ComparativeOR or=new ComparativeOR();
		for(Comparable<?> arg:argList){
			or.addComparative(new Comparative(Comparative.EQUIVALENT,arg));
		}
		return or;
	}
}
