tree grammar OracleWalker;
options {
tokenVocab=OracleParser; // reuse token types
ASTLabelType=CommonTree; // $label will have type CommonTree
language=Java;
output=AST;
}
@header
{
package  com.it.iddl.parser.oracle; 

import static com.it.iddl.parser.util.Utils.*;

import com.it.iddl.parser.sql.function.*;
import com.it.iddl.parser.sql.objecttree.*;
import com.it.iddl.parser.sql.objecttree.impl.*;
import com.it.iddl.parser.sql.objecttree.oracle.*;
import com.it.iddl.parser.sql.objecttree.oracle.function.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

}
@members{

		protected OracleConsistStringRegister consistStringRegister;
		protected OracleHintRegister hintRegister;
		protected OracleFunctionRegister functionRegister;
		
		public OracleConsistStringRegister getConsistStringRegister(){
			return consistStringRegister;
		}
		
		public void setConsistStringRegister(OracleConsistStringRegister consist){
			this.consistStringRegister=consist;
		}

    	public OracleFunctionRegister getFunctionRegister() {
			return functionRegister;
		}
		
		public void setFunctionRegister(OracleFunctionRegister functionRegister) {
			this.functionRegister = functionRegister;
		}
		
		public void setOracleHint(OracleHintRegister hintreg){
			this.hintRegister=hintreg;
		}
		
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
beg	returns[DMLCommon obj]:
start_rule{$obj=$start_rule.obj;} 	
	;
	
start_rule returns[DMLCommon obj]
	:select_command[null]{$obj=$select_command.select;}
	|insert_command{$obj=$insert_command.ins;}
	|update_command{$obj=$update_command.update;}
	|delete_command{$obj=$delete_command.del;}
	;

setclause[Update update]
	:^(SET updateColumnSpecs[$update]+)	
	;
updateColumnSpecs[Update update]
	:^(SET_ELE updateColumnSpec[$update])	
	;
updateColumnSpec[Update update]
	:^(EQ table_alias? identifier expr[$update.getIndexHolder()])
	{
	$update.addSetElement($identifier.text,$table_alias.aText,$expr.valueObj);
	}
	;


values[Insert ins]	:^(INSERT_VAL (expr[$ins.getIndexHolder()]{ins.addValue($expr.valueObj);})*)
	;
column_specs[Insert ins]
	:^(COLUMNS column_spec[$ins]+)
	;
column_spec[Insert ins]
	:^(COLUMN identifier table_name?)
	{
		$ins.addColumnTandC($table_name.text,$identifier.text);
	}
	;



whereClause[WhereCondition where]
	:^(WHERE sqlCondition[$where])
	;
	
groupByClause[WhereCondition where]
	:^(GROUPBY groupAfterWhere){
		$where.setGroupByColumnList($groupAfterWhere.ret);
	}
	;
orderByClause[WhereCondition where]
	:^(ORDERBY columnNamesAfterWhere){
		$where.setOrderByColumnList($columnNamesAfterWhere.ret);
	}
	;
columnNamesAfterWhere returns[List<OrderByElement> ret]
@init{
	$ret = new ArrayList<OrderByElement>();
}
	:(columnNameAfterWhere[$ret])+
	;
columnNameAfterWhere[List<OrderByElement> orderByEles]
	:^(ASC  identifier table_alias?){
		$orderByEles.add(new OrderByElement($table_alias.aText,$identifier.text,true));
	}
	|^(DESC  identifier table_alias?){
		$orderByEles.add(new OrderByElement($table_alias.aText,$identifier.text,false));
	}
	;
	
groupAfterWhere returns[List<GroupByElement> ret]
@init{
	$ret = new ArrayList<GroupByElement>();
}
	:(afterWhere[$ret])+
	;
afterWhere[List<GroupByElement> groupByElementList]
	:^(ASC  identifier table_alias?){
		$groupByElementList.add(new GroupByElement($table_alias.aText,$identifier.text,true));
	}
	|^(DESC  identifier table_alias?){
		$groupByElementList.add(new GroupByElement($table_alias.aText,$identifier.text,false));
	}
	;

sqlCondition[WhereCondition where]
	
	:^(CONDITION_OR_NOT condition[where.getHolder(),where.getExpGroup(),false])
	|^(CONDITION_OR condition[where.getHolder(),where.getExpGroup(),false])
	;

condition[BindIndexHolder where,ExpressionGroup eg,boolean isPriority]	



	:
	{
		ORExpressionGroup orExp=new ORExpressionGroup();
		$eg.addExpressionGroup(orExp);
	}^('OR' s1=condition[where,orExp,$isPriority]+)
	| 
	{
		ExpressionGroup andExp=new ExpressionGroup();
		$eg.addExpressionGroup(andExp);
	}^('AND' condition[where,andExp,$isPriority]+)




	|condition_PAREN[where,$eg]
	|^(PRIORITY condition[where,$eg,true])
	;

/*condition_and[ORExpressionGroup orGroup] returns[ExpressionGroup andExpGrp]
	:
	{
		$andExpGrp=new ExpressionGroup();
	}
	 ^('AND' condition_PAREN[$andExpGrp]+)
	 
	|condition_PAREN[$orGroup]
	
	|^('OR' s1=condition_and[orExp] s2=condition_and[orExp])
	
	{
	where.addAndExpression($s1.andExpGrp);
	where.addAndExpression($s2.andExpGrp);
	}
	;
	*/
condition_PAREN[BindIndexHolder where,ExpressionGroup exp]
	:condition_expr[$where,$exp]+
	;
condition_expr[BindIndexHolder where,ExpressionGroup exp]
	: comparisonCondition[$where,$exp]
	| inCondition[$where,$exp] 
	| isCondition [$where,$exp]
	| likeCondition[$where,$exp]
//	| betweenCondition^
	;
betweenCondition
	:^(NOT_BETWEEN between_and)
	|^(BETWEEN between_and)
	;
between_and
	:	
	;
likeCondition[BindIndexHolder where,ExpressionGroup exp]
	:^(NOT_LIKE expr[$where] left_cond[$where]){
			NotLike notlike=new NotLike();
		notlike.setLeft($left_cond.ret);
		notlike.setRight($expr.valueObj);
		$exp.addExpression(notlike);
	}
	|^(LIKE expr[$where] left_cond[$where]){
		Like like=new Like();
		like.setLeft($left_cond.ret);
		like.setRight($expr.valueObj);
		$exp.addExpression(like);
	}
	;
	
isCondition[BindIndexHolder where,ExpressionGroup exp]
	:^(ISNOT NULL left_cond[$where]){
		IsNot arg=new IsNot();
		arg.setLeft($left_cond.ret);
		arg.setRight(null);
		$exp.addExpression(arg);
	}
	|^(IS NULL left_cond[$where]){
		Is arg=new Is();
		arg.setLeft($left_cond.ret);
		arg.setRight(null);
		$exp.addExpression(arg);
	}	
	;


comparisonCondition[BindIndexHolder where,ExpressionGroup exp]
	:^(EQ expr[$where] left_cond[$where])
	{
		Equivalent arg=new Equivalent();
		arg.setLeft($left_cond.ret);
		arg.setRight($expr.valueObj);
		$exp.addExpression(arg);
	}
	|^(NOT_EQ expr[$where] left_cond[$where])
	{
		NotEquivalent arg=new NotEquivalent();
		arg.setLeft($left_cond.ret);
		arg.setRight($expr.valueObj);
		$exp.addExpression(arg);
	}
	|^(LTH expr[$where] left_cond[$where])
	{
		LessThan arg=new LessThan();
		arg.setLeft($left_cond.ret);
		arg.setRight($expr.valueObj);
		$exp.addExpression(arg);
	}
	|^(GTH expr[$where] left_cond[$where])
	{
		GreaterThan arg=new GreaterThan();
		arg.setLeft($left_cond.ret);
		arg.setRight($expr.valueObj);
		$exp.addExpression(arg);
	}
	|^(LEQ expr[$where] left_cond[$where])
	{
		LessThanOrEquivalent arg=new LessThanOrEquivalent();
		arg.setLeft($left_cond.ret);
		arg.setRight($expr.valueObj);
		$exp.addExpression(arg);
	}
	|^(GEQ expr[$where] left_cond[$where])
	{
		GreaterThanOrEquivalent arg=new GreaterThanOrEquivalent();
		arg.setLeft($left_cond.ret);
		arg.setRight($expr.valueObj);
		$exp.addExpression(arg);
	}

	;
left_cond[BindIndexHolder where] returns[Object ret]

	:^(CONDITION_LEFT expr[$where])
	{
		$ret=$expr.valueObj;
	}
	;
in_list[BindIndexHolder where] returns[List list]
	:^(IN_LISTS inCondition_expr_adds[$where])
	{
		$list=$inCondition_expr_adds.list;
	}	
	;
inCondition [BindIndexHolder where,ExpressionGroup exp]
	:^(IN not='NOT'? subquery[$where]? in_list[$where]?  left_cond[$where])
		{
		if($not.text!=null){
			if($subquery.subselect!=null){
				NotInExpression arg=new NotInExpression();
				arg.setLeft($left_cond.ret);
				arg.setRight($subquery.subselect);
				$exp.addExpression(arg);
			}
			else if($in_list.list!=null){
					NotInExpression arg=new NotInExpression();
					arg.setLeft($left_cond.ret);
					arg.setRight($in_list.list);
					$exp.addExpression(arg);
			}
		}else{
			if($subquery.subselect!=null){
				InExpression arg=new InExpression();
				arg.setLeft($left_cond.ret);
				arg.setRight($subquery.subselect);
				$exp.addExpression(arg);}
			else if($in_list.list!=null){
					InExpression arg=new InExpression();
					arg.setLeft($left_cond.ret);
					arg.setRight($in_list.list);
					$exp.addExpression(arg);
			}
		}
		;
		}
		
	;



	
inCondition_expr_adds[BindIndexHolder where] returns [List list]
	@init{$list=new ArrayList();}:
	(expr_add[$where]
	{
		$list.add($expr_add.valueObjExpr);
	})+

	;
	
expr[BindIndexHolder where] returns [Object valueObj]	
	:(expr_add[$where] {$valueObj=$expr_add.valueObjExpr;}
	|subquery[$where] {$valueObj=$subquery.subselect;}
	
	)	
	;
expr_add[BindIndexHolder where]  returns[Object valueObjExpr]
@init{
List<Object> list=new ArrayList<Object>(2);
}
	:^(NEGATIVE s1=expr_add[$where]) {
	$valueObjExpr=((BigDecimal)$s1.valueObjExpr).negate();
	}
	|^(POSITIVE s1=expr_add[$where]) {
	$valueObjExpr=$s1.valueObjExpr;
	}
	|^(PLUS s1=expr_add[$where] s2=expr_add[$where]) {
	Function func=new Add();
	list.add($s1.valueObjExpr);
	list.add($s2.valueObjExpr);
	func.setValue(list);
	$valueObjExpr=func;
	}
	|^(MINUS s1=expr_add[$where] s2=expr_add[$where]){
		Function func=new Subtract();
	list.add($s1.valueObjExpr);
	list.add($s2.valueObjExpr);
	func.setValue(list);
	$valueObjExpr=func;
	}
	|^(BITOR s1=expr_add[$where] s2=expr_add[$where]){
		Function func=new BitOr();
	list.add($s1.valueObjExpr);
	list.add($s2.valueObjExpr);
	func.setValue(list);
	$valueObjExpr=func;
	}
	|^(BITAND s1=expr_add[$where] s2=expr_add[$where]){
		Function func=new BitAnd();
	list.add($s1.valueObjExpr);
	list.add($s2.valueObjExpr);
	func.setValue(list);
	$valueObjExpr=func;
	}
	|^(BITXOR s1=expr_add[$where] s2=expr_add[$where]){
	Function func=new BitXOr();
	list.add($s1.valueObjExpr);
	list.add($s2.valueObjExpr);
	func.setValue(list);
	$valueObjExpr=func;
	}
	|^(SHIFTLEFT s1=expr_add[$where] s2=expr_add[$where]){
	Function func=new ShiftLeft();
	list.add($s1.valueObjExpr);
	list.add($s2.valueObjExpr);
	func.setValue(list);
	$valueObjExpr=func;
	}
	|^(SHIFTRIGHT s1=expr_add[$where] s2=expr_add[$where]){
	Function func=new ShiftRight();
	list.add($s1.valueObjExpr);
	list.add($s2.valueObjExpr);
	func.setValue(list);
	$valueObjExpr=func;
	}
	|^(ASTERISK s1=expr_add[$where] s2=expr_add[$where]){
	Function func=new Multiply();
	list.add($s1.valueObjExpr);
	list.add($s2.valueObjExpr);
	func.setValue(list);
	$valueObjExpr=func;
	}
	|^(DIVIDE s1=expr_add[$where] s2=expr_add[$where]){
	Function func=new Divide();
	list.add($s1.valueObjExpr);
	list.add($s2.valueObjExpr);
	func.setValue(list);
	$valueObjExpr=func;
	}
	|N {$valueObjExpr=new BigDecimal($N.text);}
	|NUMBER{$valueObjExpr=new BigDecimal($NUMBER.text);}
	|boolean_literal//not support true false yet
	|'NULL' {$valueObjExpr=null;}
	|'?'{
	BindVar val=new BindVar(where.selfAddAndGet());
	$valueObjExpr=val;
	}
	|^(QUTED_STR quoted_string){$valueObjExpr=$quoted_string.aText;}
	|^(COLUMN identifier table_name?)
	{
	Column col=new ColumnImpl($table_name.text,$identifier.text,null);
	$valueObjExpr=col;
	}
	|^(COLUMNAST ASTERISK)
	{
	Column col=new ColumnImpl(null,$ASTERISK.text,null);
	$valueObjExpr=col;
	}
	|^(ID 
	(expr[$where]{list.add($expr.valueObj);})*){
	Function func=functionRegister.get(($ID.text).toUpperCase());
	func.setValue(list);
	$valueObjExpr=func;
	}
	|^(CONSIST ID){
	Function func=consistStringRegister.get(($ID.text).toUpperCase());
	$valueObjExpr=func;
	}
	|^(CAST (expr[$where]{list.add($expr.valueObj);})* ID){
	//list.add("vartabletype");
	Cast func= new Cast();
	func.setType($ID.text);
	func.setValue(list);
	$valueObjExpr=func;
	}
	;
value	:
	N
	|NUMBER
	|'?'
	;
boolean_literal returns[Object valueObj]
	:s1='TRUE' {$valueObj=Boolean.parseBoolean($s1.text);}
	| s1='FALSE'{$valueObj=Boolean.parseBoolean($s1.text);}
	;	

	
select_list[Select select]
	:^(SELECT_LIST displayed_column[$select]+)
	;	
fromClause[Select select]
	:^(TABLENAMES table[$select]+)
	;
join_clause[DMLCommon common] returns [JoinClause joinClause]
	:^(JOIN table_name alias? temp1=join_column temp2=join_column join_type?)
	{
		$joinClause = new JoinClause();
		TableNameImpl tableName = new TableNameImpl();
		tableName.setTablename($table_name.text);
		tableName.setAlias($alias.aliText);
		$joinClause.setTableName(tableName);
		$joinClause.setLeftCondition($temp1.col);
		$joinClause.setRightCondition($temp2.col);
		$joinClause.setJoinType($join_type.joinType);
	}
	;

join_type returns [JoinType joinType]
	:INNER
	{
		$joinType = JoinType.INNER;
	} 
	|LEFT outer?
	{
		boolean outter = $outer.outter;
		if(outter){
			$joinType = JoinType.LEFT_OUTER;
		}else{
			$joinType = JoinType.LEFT;
		}
	}
	|RIGHT outer?
	{
		boolean outter = $outer.outter;
		if(outter){
			$joinType = JoinType.RIGHT_OUTER;
		}else{
			$joinType = JoinType.RIGHT;
		}
	}
	|FULL outer?
		{
		boolean outter = $outer.outter;
		if(outter){
			$joinType = JoinType.FULL_OUTER;
		}else{
			$joinType = JoinType.FULL;
		}
	}
	|UNION
	{
		$joinType = JoinType.UNION;
	} 
	|CROSS
	{
		$joinType = JoinType.CROSS;
	} 
	;
outer returns [boolean outter]
	:OUTER
	{
		$outter = true;
	}
	;
join_column returns[Column col]
	:^(COLUMN identifier table_name?)
	    {
		    $col=new ColumnImpl($table_name.text,$identifier.text,null);
			
		}
	;
table[DMLCommon common]
	:^(TABLENAME table_spec[$common] join_clause[$common]?)
	{
		TableName tableName = $table_spec.tableName;
		tableName.setJoinClause($join_clause.joinClause);
		$common.addTable(tableName);
	}
	;
tables[DMLCommon common]
	:^(TABLENAMES table[$common]+)
	;
table_spec[DMLCommon common] returns [TableName tableName]
	@init{
	List<Object> list=new ArrayList<Object>(2);
	}
	:( schema_name)? table_name  alias?
	{
		$tableName = getTableNameAndSchemaName($table_name.text,$schema_name.text,$alias.aliText, true);
	}
	|subquery[$common.getIndexHolder()] alias?
	{
		$tableName = getTableSubQuery($subquery.subselect,$alias.aliText, true);

	}
	|^(ID (expr[$common.getIndexHolder()]{list.add($expr.valueObj);}) ) alias?
	{
		Function func=functionRegister.get(($ID.text).toUpperCase());
		func.setValue(list);
		$tableName = getTableFunction(func,$alias.aliText, true);
	}
	;
	
schema_name
	:identifier
	;
subquery[BindIndexHolder holder] returns [Select subselect]:
	^(SUBQUERY select_command[$holder])
	{
	$subselect=$select_command.select;
	$subselect.setSubSelect(true);
	}	
	;
table_name
	:identifier
	;	
displayed_column[Select select]
@init{
List<Object> list=new ArrayList<Object>(10);
}
	:
	^(ID  (expr[$select.getIndexHolder()]{list.add($expr.valueObj);} alias? )* ){
	Function func=functionRegister.get(($ID.text).toUpperCase());
	func.setValue(list);
	FunctionColumn funcolumn=new FunctionColumn();
	funcolumn.setFunction(func);
	funcolumn.setAlias($alias.aliText);
	$select.addColumn(funcolumn);
	}
	|^(CONSIST ID alias?){
	Function func=consistStringRegister.get(($ID.text).toUpperCase());
	FunctionColumn funcolumn=new FunctionColumn();
	funcolumn.setFunction(func);
	funcolumn.setAlias($alias.aliText);
	$select.addColumn(funcolumn);
	}
	|^(COLUMN table_alias? columnAnt alias?)
	{$select.addColumn($table_alias.aText,$columnAnt.text,$alias.aliText);}

	;    
	
columnAnt returns[String aText]
	:ASTERISK {$aText=$ASTERISK.text;}
	|N {$aText=$N.text;}
	|identifier {$aText=$identifier.text;}
	;

quoted_string returns[String aText]
	: QUOTED_STRING {$aText = $QUOTED_STRING.text.substring(1, $QUOTED_STRING.text.length() - 1);}
	;

identifier
	:ID
   	;
table_alias returns [String aText]
	:^(COL_TAB identifier{$aText=$identifier.text;}	)
	;
	
alias returns [String aliText]
	:^(AS identifier){$aliText=$identifier.text;}
	;
		
/*-------------------------------------------the rules below are Redefined by SubParser 
.For Antlr v3 didn't have any method to reuse rules.So we wrote rules which had been modified by subParser here to make
the refactor easily.-----------------------------*/
selectClause[Select select]
    :^(SELECT indexClause[select]? select_list[$select])
    ;  
	
indexClause[DMLCommon dmlCommon]
	:hints[$dmlCommon]+
	;
	
hints[DMLCommon dmlCommon]
	@init{
	List<String> list=new ArrayList<String>();
	}
	:^(ID  (identifier{list.add(($identifier.text));})*){
	HintSetter hint=hintRegister.get(($ID.text).toUpperCase());
	hint.addHint(list);
	dmlCommon.addHint(hint);
	}
	;

select_command[BindIndexHolder holder] returns[Select select]
@init{
if(holder ==null){
	$select =new OracleSelect();
	}
else{
	$select = new OracleSelect($holder);
}

}
     : selectClause[$select] (fromClause[$select])?  (whereClause[$select.getWhere()])? (groupByClause[$select.getWhere()])? (orderByClause[$select.getWhere()])? (for_update[$select])?
     ;
for_update[Select select]
	@init{
		OracleForUpdate update = new OracleForUpdate();
	}
	:^(FORUPDATE of_statement[update]? wait_statement[update]?)
	{
		$select.addForUpdate(update);
	}	
	;
of_statement[OracleForUpdate update]
	:^(OF expr[null])
	{
		$update.setOfColumn((Column)$expr.valueObj);
	}
	;
wait_statement[OracleForUpdate update]
	:^(NOWAIT N?)
	{
		$update.setWait(0);
	}
	|^(WAIT N)
	{
		$update.setWait(Integer.valueOf($N.text));
	}
	;
delete_command returns[Delete del]
@init{$del=new OracleDelete();}
	:^(DELETE indexClause[$del]? tables[$del] whereClause[$del.getWhere()]? orderByClause[$del.getWhere()]?)
	;
update_command returns[Update update]
@init{$update=new OracleUpdate();}
	:^(UPDATE indexClause[$update]? tables[$update] setclause[$update] whereClause[$update.getWhere()]?
	)
	;
	
insert_command returns[Insert ins]
@init{$ins=new Insert();}
	:^(INSERT indexClause[$ins]? tables[$ins] column_specs[$ins]* values[$ins])
	;
