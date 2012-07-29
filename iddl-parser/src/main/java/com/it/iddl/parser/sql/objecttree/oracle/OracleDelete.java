/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-parser
 */
package com.it.iddl.parser.sql.objecttree.oracle;

import static com.it.iddl.parser.sql.objecttree.oracle.SkipMaxUtils.buildRownumGroup;
import static com.it.iddl.parser.sql.objecttree.oracle.SkipMaxUtils.getRowNumMaxToInt;
import static com.it.iddl.parser.sql.objecttree.oracle.SkipMaxUtils.getRowNumSkipToInt;

import java.util.List;
import java.util.Set;

import com.it.iddl.parser.sql.objecttree.Comparative;
import com.it.iddl.parser.sql.objecttree.WhereCondition;
import com.it.iddl.parser.sql.objecttree.impl.Delete;

/**
 * 
 * @author sihai
 *
 */
public class OracleDelete extends Delete {

	private Comparative rownumComparative = null;
	public OracleDelete() {
		super();
	}
	@Override
	protected WhereCondition getWhereCondition() {
		return new OracleWhereCondition();
	}

	public StringBuilder regTableModifiable(Set<String> oraTabName,
			List<Object> list, StringBuilder sb) {
		super.appendDelete(sb);
		
		sb = HintUtils.appendHint(oraTabName, list, sb, hintList);
		
		sb = super.appendDelBody(oraTabName, list, sb);
		
		return sb;
	}

	@Override
	public void init() {
		initAliasAndComparableMap(aliasToSQLFragementMap,repListMap);

		//���ExpressionGroup���ڴ��sql�����е�rownum Expression.Ĭ�϶�Ϊand��ϵ��������ʵ��and����orû��ϵ��
		//��Ϊ�����������ϵ�����顣
		rownumComparative =	buildRownumGroup(where.getExpGroup(),tbNames,aliasToSQLFragementMap);
		
		registerTraversalActionAndGet();
		
		registerUnmodifiableSqlOutputFragement();
	}


	public int getSkip(List<Object> param) {
		/*
		 * ���getSkip�ķ���ʵ���ϻᱻǶ�׵��á�
		 */
		// rownum>0 and rownum<10 row>0 nested rownum<10 ;rownum= bigdecimal
		// long int
		int temp = DEFAULT_SKIP_MAX;
		temp = getRowNumSkipToInt(rownumComparative.getVal(param, null));
		return temp;

	}

	protected int getRangeOrMax(List<Object> param) {
		throw new IllegalArgumentException("should not be here");
	}

	@Override
	public int getMax(List<Object> param) {
		int temp = DEFAULT_SKIP_MAX;
		temp = getRowNumMaxToInt(rownumComparative.getVal(param, null));
		return temp;
	}
}
