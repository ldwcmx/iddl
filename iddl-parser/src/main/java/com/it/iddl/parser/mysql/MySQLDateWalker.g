tree grammar MySQLDateWalker;
options {
tokenVocab=MySQLDateParser; // reuse token types
ASTLabelType=CommonTree; // $label will have type CommonTree
language=Java;
output=AST;
}
@header
{
 package  com.it.iddl.parser.mysql; 

import com.it.iddl.parser.sql.objecttree.Column;
import com.it.iddl.parser.sql.objecttree.*;

import com.it.iddl.parser.sql.function.*;

import com.it.iddl.parser.sql.objecttree.mysql.*;

import com.it.iddl.parser.sql.objecttree.mysql.function.*;

import com.it.iddl.parser.sql.objecttree.mysql.function.date.MySQLDateStringWrapperFunction;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


}
@members{


		public boolean mismatchIsMissingToken(IntStream arg0, BitSet follow) {
		if ( follow==null ) {
		throw new IllegalArgumentException("can't know what's wrong...");
		}
		throw new IllegalArgumentException("LT(1)=="+((TokenStream)input).LT(1)+" is consistent with what follows; inserting...viable tokens="+follow.toString(getTokenNames())+"LT(1)="+((TokenStream)input).LT(1));
	}
	public boolean mismatchIsUnwantedToken(IntStream input, int ttype) {
    		throw new IllegalArgumentException(""+ttype);
    	}
}
quoted_string returns[Object aText]
	: timedate_str {$aText = $timedate_str.aText;}
	|quo
	;
quo
	:^(QUOTA ID){}
	;
timedate_str returns[Object aText]
@init{
//StringBuilder sb=new StringBuilder();
String date="";
String time="";}
	:^(TIMESTRING 
	date_string{
	if(null!=$date_string.aText &&! $date_string.aText.equals("")){
	date=$date_string.aText;}}
	(time_string
	{ 
	if(null!=$time_string.aText &&! $time_string.aText.equals("")){time=$time_string.aText;}
	})?
	)
	{
		$aText=new MySQLDateStringWrapperFunction(date+" "+time);
	}	
	;

time_string returns[String aText]
@init{
	StringBuilder sb=new StringBuilder();
	boolean firstElement=true;
	}
	:(time_one{
		if(firstElement){
			firstElement=false;
			sb.append($time_one.s);
		}else{
			sb.append(":");
			sb.append($time_one.s);
		}
	})+
	{
		$aText=sb.toString();
	}
	;
time_one returns[String s]
	:^(TIME NS)
	{
		$s=$NS.text;
	};
date_string  returns[String aText]
@init{
	StringBuilder sb=new StringBuilder();
	boolean firstElement=true;
	}
	:(date_one{
		if(firstElement){
			firstElement=false;
			sb.append($date_one.s);
		}else{
			sb.append("-");
			sb.append($date_one.s);
		}
	})+
	{
		$aText=sb.toString();
	}
	;
date_one returns[String s]
	:^(DATE NS)
	{
		$s=$NS.text;
	};