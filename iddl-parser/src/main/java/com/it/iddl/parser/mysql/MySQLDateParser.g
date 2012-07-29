grammar MySQLDateParser;
options {
	output=AST;
	language=Java;
	ASTLabelType=CommonTree;
}

tokens{
TIMESTRING;
DATE;
QUOTA;
TIME;
}
@lexer::header{ package  com.it.iddl.parser.mysql; } 
@header{
package com.it.iddl.parser.mysql;

import java.util.Map;
import java.util.HashMap;
import com.it.iddl.parser.sql.function.Function;
import com.it.iddl.parser.sql.objecttree.mysql.function.*;
}
quoted_string
	: time_quoted 
	;
time_quoted
	:('\'' date_string time_string? '\'') => '\'' datetime_string  '\''->datetime_string
	|quo
	;
datetime_string
	: date_string?  time_string? -> ^(TIMESTRING date_string time_string?)
	;
date_string
	: NS SPLIT NS SPLIT NS->^(DATE NS)+
	;
SPLIT
	:'-'
	|'*'
	|'.'
	|'+'
	|'/'
	|'@'
	|':'
	;
time_string
	: NS SPLIT NS SPLIT NS->^(TIME NS)+
	;
NS
   	: '0' .. '9' ( '0' .. '9' )*
	; 

WS  :   (   ' '
		|   '\t'
		|   '\r' '\n' 
		|   '\n'     
		|   '\r'      
		)
		{skip();}  //ignore this token
	;
 ID 
    :	('A' .. 'Z'|'a'..'z') ( 'A' .. 'Z'|'a'..'z' | '0' .. '9' | '_' | '$' | '#' )*
    ;
     

P	:	'%';	

ARROW
	:	'=>'
	;
DOUBLEVERTBAR
	:	'||'
	;
	

RPAREN
	:	')'
	;
LPAREN
	:	'('
	;
	LTH
	:	'<'
	;
	NOT_EQ
	:	'<>' | '!=' | '^='
	;
	LEQ
	:	'<='
	;
	GEQ
	:	'>='
	;
	GTH
	:	'>'
	;
quo	:'\'' .* '\''->^(QUOTA ID)
	;