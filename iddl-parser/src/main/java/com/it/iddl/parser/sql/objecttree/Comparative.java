/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-parser
 */
package com.it.iddl.parser.sql.objecttree;

import java.util.List;
import java.util.Map;

/**
 * 可比较的类 实际上是是两个东西的结合
 * 
 * 符号+值
 * 
 * 例如 [> 1] , [< 1] , [= 1]
 * 
 * @author sihai
 * 
 */
public class Comparative implements Comparable, Cloneable {

	public static final int GREATER_THAN = 1;
	public static final int GREATER_THAN_OR_EQUAL = 2;
	public static final int EQUIVALENT = 3;
	public static final int LIKE = 4;
	public static final int NOT_LIKE = 5;
	public static final int NOT_EQUIVALENT = 6;
	public static final int LESS_THAN = 7;
	public static final int LESS_THAN_OR_EQUAL = 8;

	private Comparable value; // 这有可能又是个Comparative，从而实质上表示一课树（比较树）
	private int comparison;

	/**
	 * 表达式取反
	 * 
	 * @param function
	 * @return
	 */
	public static int reverseComparison(int function) {
		return 9 - function;
	}

	/**
	 * 表达式前后位置调换的时候
	 * 
	 * @param function
	 * @return
	 */
	public static int exchangeComparison(int function) {
		if (function == GREATER_THAN) {
			return LESS_THAN;
		} else if (function == GREATER_THAN_OR_EQUAL) {
			return LESS_THAN_OR_EQUAL;
		} else if (function == LESS_THAN) {
			return GREATER_THAN;
		}
		if (function == LESS_THAN_OR_EQUAL) {
			return GREATER_THAN_OR_EQUAL;
		} else {
			return function;
		}
	}

	protected Comparative() {
	}

	public Comparative(int function, Comparable value) {
		this.comparison = function;
		this.value = value;
	}

	public Comparable getValue() {
		return value;
	}

	public void setComparison(int function) {
		this.comparison = function;
	}

	public static String getComparisonName(int function) {
		if (function == EQUIVALENT) {
			return "=";
		} else if (function == GREATER_THAN) {
			return ">";
		} else if (function == GREATER_THAN_OR_EQUAL) {
			return ">=";
		} else if (function == LESS_THAN_OR_EQUAL) {
			return "<=";
		} else if (function == LESS_THAN) {
			return "<";
		} else if (function == NOT_EQUIVALENT) {
			return "<>";
		} else if (function == LIKE) {
			return "LIKE";
		} else if (function == NOT_LIKE) {
			return "NOT LIKE";
		} else {
			return null;
		}
	}

	public static int getComparisonByIdent(String ident) {
		if ("=".equals(ident)) {
			return EQUIVALENT;
		} else if (">".equals(ident)) {
			return GREATER_THAN;
		} else if (">=".equals(ident)) {
			return GREATER_THAN_OR_EQUAL;
		} else if ("<=".equals(ident)) {
			return LESS_THAN_OR_EQUAL;
		} else if ("<".equals(ident)) {
			return LESS_THAN;
		} else if ("!=".equals(ident)) {
			return NOT_EQUIVALENT;
		} else if ("<>".equals(ident)) {
			return NOT_EQUIVALENT;
		} else if ("like".equalsIgnoreCase(ident)) {
			return LIKE;
		} else {
			return -1;
		}
	}

	/**
	 * contains顺序按字符从多到少排列，否则逻辑不对，这里 先这样处理。
	 * 
	 * @param completeStr
	 * @return
	 */
	public static int getComparisonByCompleteString(String completeStr) {
		if (completeStr != null) {
			String ident = completeStr.toLowerCase();
			if (ident.contains(">=")) {
				return GREATER_THAN_OR_EQUAL;
			} else if (ident.contains("<=")) {
				return LESS_THAN_OR_EQUAL;
			} else if (ident.contains("!=")) {
				return NOT_EQUIVALENT;
			} else if (ident.contains("<>")) {
				return NOT_EQUIVALENT;
			} else if (ident.contains("=")) {
				return EQUIVALENT;
			} else if (ident.contains(">")) {
				return GREATER_THAN;
			} else if (ident.contains("<")) {
				return LESS_THAN;
			} else if (ident.contains("like")) {
				return LIKE;
			} else {
				return -1;
			}
		} else {
			return -1;
		}
	}

	public int getComparison() {
		return comparison;
	}

	public void setValue(Comparable value) {
		this.value = value;
	}

	public int compareTo(Object o) {
		if (o instanceof Comparative) {
			Comparative other = (Comparative) o;
			return this.getValue().compareTo(other.getValue());
		} else if (o instanceof Comparable) {
			return this.getValue().compareTo(o);
		}
		return -1;
	}

	public String toString() {
		if (value != null) {
			StringBuilder sb = new StringBuilder();
			sb.append("(").append(getComparisonName(comparison));
			sb.append(value.toString()).append(")");
			return sb.toString();
		} else {
			return null;
		}
	}

	/**
	 * 将变量绑定到当前持有的Comparable(Comparative)中。
	 * 
	 * @param arguments
	 * @param aliasMap
	 * @return
	 */
	public Comparative getVal(List<Object> arguments,
			Map<String, SQLFragment> aliasMap) {
		Comparable<?> comp = null;
		if (value instanceof Value) {
			if (value instanceof SubQueryValue) {
				((SubQueryValue) value).setAliasMap(aliasMap);
				comp = ((Value) value).getValue(arguments);
				// 引擎不支持在Comparative包装内的ComparativeOR,因此在a.id=b.id这种映射中要显示的做一个hack.
				if (comp instanceof ComparativeOR) {
					return (ComparativeOR) comp;
				}
			}

			comp = ((Value) value).getValue(arguments);

		} else if (value instanceof Comparative) {
			comp = new Comparative(((Comparative) value).getComparison(),
					((Comparative) value).getVal(arguments, aliasMap));
		} else {
			comp = value;
		}
		return new Comparative(this.comparison, comp);
	}

	public Object clone() {
		return new Comparative(this.comparison, this.value);
	}
}
