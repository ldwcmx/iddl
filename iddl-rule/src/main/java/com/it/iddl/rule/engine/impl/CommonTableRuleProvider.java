/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-rule
 */
package com.it.iddl.rule.engine.impl;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.it.iddl.common.Config;
import com.it.iddl.common.exception.checked.IDDLCheckedException;
import com.it.iddl.common.exception.checked.ParseSQLJEPException;
import com.it.iddl.common.exception.runtime.CantFindTargetTableRuleTypeException;
import com.it.iddl.common.exception.runtime.NotSupportedException;
import com.it.iddl.parser.sql.objecttree.Comparative;
import com.it.iddl.parser.sql.objecttree.ComparativeAND;
import com.it.iddl.parser.sql.objecttree.ComparativeBaseList;
import com.it.iddl.parser.sql.objecttree.ComparativeOR;
import com.it.iddl.rule.TableRuleType;
import com.it.iddl.rule.engine.TableRuleProvider;
import com.it.iddl.rule.engine.entry.TableRule;
import com.it.iddl.rule.type.TableNameTypeHandler;
import com.it.iddl.rule.type.TableNameTypeRegister;
import com.it.iddl.rule.util.NestThreadLocalMap;

/**
 * 
 * @author sihai
 *
 */
public abstract class CommonTableRuleProvider implements TableRuleProvider {

	protected final static String CALENDAR = "CALENDAR";
	private static final Log logger = LogFactory.getLog(CommonTableRuleProvider.class);
	protected final static int LESS_GREAT = 1;
	protected final static int LESS_OR_EQUAL_GREAT_OR_EQUAL = 0;
	
	/**
	 * 复写此方法的子类可直接调用对应calendar里面的常量；
	 * 
	 * @return
	 */
	protected  int getCalendarType(){
		return -1000;
	}
	
	/**
	 * 
	 */
	public Set<String> getTables(Map<String, Comparative> map, TableRule table, String tabName, Config config) throws IDDLCheckedException {
		validTableRule(table);

		Comparable<?> comparable= null;
		comparable = map.get(table.getParameter());
		return parseTableNameObj(table, tabName, comparable,config);
	}
	
	protected Set<String> parseTableNameObj(TableRule tab, String vTabName,
			Comparable<?> comparable,Config config) throws ParseSQLJEPException {
		if (comparable instanceof Comparative) {
			//if current input is a subType of Comparative
			return analyzeComparative(tab, vTabName, comparable,config);

		} else if (comparable == null) {
			//if comparable is null,return DefaultTable()
			Set<String> temp = getDefaultTabSet(tab);
			return temp;
		} else {
			throw new NotSupportedException("不支持除了Comparative类型和其子类型的其他情况");
		}
	}
	
	protected Set<String> getDefaultTabSet(TableRule table) {
		Set<String> temp = new HashSet<String>();
		temp.addAll(getDefaultTabCollection(table));
		return temp;
	}

	protected Collection<String> getDefaultTabCollection(TableRule table) {
		return Collections.emptySet();
	}
	
	/**
	 * analyze a instance of Comparative .temporary we now only support 
	 * @param tab
	 * @param vTabName
	 * @param comparable
	 * @return
	 * @throws ParseSQLJEPException
	 */
	private Set<String> analyzeComparative(TableRule tab, String vTabName,
			Comparable<?> comparable,Config config) throws ParseSQLJEPException {
		Comparative comparative;
		comparative = (Comparative) comparable;
		if (comparative instanceof ComparativeAND) {
			logger.debug("comparative is a instance of and ");
			// and中最简单的单独区间内，能直接搞定
			ComparativeAND and = (ComparativeAND) comparative;
			List<Comparative> list = and.getList();
			Set<String> temp = new HashSet<String>();
			getXxxfixedByAndRange(temp,list, tab,vTabName);
			return temp;
		} else if (comparative.getComparison() == Comparative.EQUIVALENT) {
			Set<String> temp = addAEqComparabToXXXFix(tab, vTabName,
					comparative,tab.getOffset(), config);
			return temp;
		} else if (comparative instanceof ComparativeOR) {
			ComparativeOR or=(ComparativeOR)comparative;

			Set<String> temp = new HashSet<String>();
			
			List<Comparative> list=or.getList();
			for(Comparative comp:list){
				temp.addAll(analyzeComparative(tab, vTabName, comp,config));
			}
			logger.info("ComparativeOR的情况");
			return temp;
		}else if(comparative.getValue() instanceof Comparative){
			return parseTableNameObj(tab, vTabName,comparative.getValue(), config);
		}else {
			Set<String> temp = getDefaultTabSet(tab);
			return temp;
		}
	}

	/**
	 * 重写此方法时要注意offset的处理
	 * @param table
	 * @param vTabName
	 * @param comparative
	 * @param offset
	 * @param config 
	 * @return
	 */
	protected Set<String> addAEqComparabToXXXFix(TableRule table,
			String vTabName, Comparative comparative,int offset, Config config) {
		// =的情况也能搞定
		Date date = getDateFromComparative(comparative);
		Integer calType = getCalendarType();
		if (calType == null) {
			throw new CantFindTargetTableRuleTypeException(table
					.getExpFunction());
		}
//		//为了提高性能，做了一个map缓存Calendar
//		Calendar cal=(Calendar)NestThreadLocalMap.get("CTRP_Calendar");
//		if(cal==null){
//			cal = Calendar.getInstance();
//			NestThreadLocalMap.put("CTRP_Calendar", cal);
//		}
		Calendar cal = getCalendarInThreadLocalMap();
		cal.setTime(date);
		int retInt = getReturnInt(cal, calType);
		
		Set<String> temp = new HashSet<String>();
		String n=processOne(retInt+offset, table, vTabName);
		if(n!=null){
			temp.add(n);
		}
		return temp;
	}

	protected Date getDateFromComparative(Comparative comparative) {
		Date date = null;
		Comparable<?> comp = comparative.getValue();
		// FIXME:依然写死的了，这里需要为了满足更多的条件进行重构
//		if (comp instanceof CompableBindValue) {
//			CompableBindValue var = (CompableBindValue) comp;
//			date = (Date) var.getBindVal();
//		} else {
			date = (Date) comp;
//		}
		return date;
	}

	protected void validTableRule(TableRule tab) {
		if (tab.getTableType() == null) {
			throw new IllegalArgumentException(
					"不能找到tableRule的tableType属性，这个属性是必填的");
		}
	}

	protected String processOne(Object xxxfix,TableRule tab,String logicTab){
		String vTab = logicTab;
		String physicsTab = null;
		TableRuleType tableType = tab.getTableType();
		TableNameTypeHandler handler = TableNameTypeRegister.getTableNameHandler(tableType);

		physicsTab = handler.buildOnePhsicTable(xxxfix, tab, vTab);

		return physicsTab;
	}
	protected void processes( Set<String> tabs,List<Object> xxxfixes, TableRule tab,
			String logicTab) {
		String vTab = logicTab;
		List<String> physicsTab = null;
		TableRuleType tableType = tab.getTableType();
		TableNameTypeHandler handler = TableNameTypeRegister.getTableNameHandler(tableType);

		physicsTab = handler.buildPhysicTable(xxxfixes, tab, vTab);
		tabs.addAll(physicsTab);
	}

	/**
	 * 只支持有一个大于或大于等于，有一个小于或小于等于的这种情况。 xxxfix=suffix or prefix.
	 * 
	 * @param comps
	 * @return
	 */
	@SuppressWarnings("unchecked")
	private void getXxxfixedByAndRange(Set<String> temp,List<Comparative> comps,
			TableRule tab,String vTabName) throws ParseSQLJEPException {
		Comparative start = null;
		Comparative end = null;
		long time = 0;
		if (logger.isDebugEnabled()) {
			time = System.currentTimeMillis();
		}
		// 分析start和end
		if (comps.size() == 2) {
			
			for (Comparative c : comps) {
				if(c instanceof ComparativeBaseList){
					throw new IllegalArgumentException("不允许连续and超过3个，或者and ( or )这样的条件作为分表条件");
				}
				if (c.getComparison() == Comparative.GREATER_THAN
						|| c.getComparison() == Comparative.GREATER_THAN_OR_EQUAL) {
					if (start == null) {

						start = c;
					} else {
						temp.addAll(getDefaultTabCollection(tab));
						// 如果都是大于或大于等于则Default
						logger.info("都大于或大于等于这种开区间情况");
						return ;
					}
				} else if (c.getComparison() == Comparative.LESS_THAN
						|| c.getComparison() == Comparative.LESS_THAN_OR_EQUAL) {
					if (end == null) {

						end = c;
					} else {
						temp.addAll(getDefaultTabCollection(tab));
						//如果是小于或小于等于的情況，則default
						logger.info("都小于或小于等于这种开区间的情况");
						return ;
					}
				} else {
					throw new NotSupportedException("and 条件是两个，但至少有一个条件为等于。");
				}
			}
		} else {
			throw new NotSupportedException("and条件多于两个");
		}
		Comparable st = start.getValue();

		Comparable ed = end.getValue();
//		if (st instanceof CompableBindValue) {
//			st = ((CompableBindValue) st).getBindVal();
//		}
//		if (ed instanceof CompableBindValue) {
//			ed = ((CompableBindValue) ed).getBindVal();
//		}
		openRangeCheck(tab,st, ed);
		logger.debug("start:" + start.getValue() + " comparative signal:"
				+ start.getComparison() + " end: " + end.getValue()
				+ " comparative signal:" + start.getComparison());
		List<Object> retInt=getXxxfixlist(start, end,tab.getOffset(), tab);
		processes(temp, retInt, tab, vTabName);
		if (logger.isDebugEnabled()) {
			logger.debug("calculation xxxfix finish,elapsed time:"
					+ (System.currentTimeMillis() - time));
			logger.debug("ret xxxfix tabSize" + temp.size());
		}
		return ;

	}

	@SuppressWarnings("unchecked")
	protected void openRangeCheck(TableRule TableRule,Comparable st, Comparable ed) {
		if (st.compareTo(ed) > 0) {
			logger.info("大于最大值，小于最小值的开区间的情况");
			return ;
		}
	}

	/**
	 * 可通过重写此方法支持更多的基于start一个值，end一个值的尾缀添加逻辑，重写此方法需要注意对offset的处理
	 * @param start
	 * @param end
	 * @param tab TODO
	 * @param temp
	 */
	protected List<Object> getXxxfixlist(Comparative start, Comparative end,int offset, TableRule tab) {

		TreeSet<Integer> ret = new TreeSet<Integer>();
		Calendar cal = getCalendarInThreadLocalMap();
		int startType = getType(start);
		int endType = getType(end);
		// 这里也做了修复。不是很好看
		Date endDate = getDateFromComparative(end);
		int calType = getCalendarType();
		Date st = getDateFromComparative(start);
		int compRes=st.compareTo(endDate);
		if(compRes==0){
			if(startType==LESS_OR_EQUAL_GREAT_OR_EQUAL&&endType==LESS_OR_EQUAL_GREAT_OR_EQUAL){
				//闭区间的情况下，有交集
				List<Object> li=new ArrayList<Object>(1);
				cal.setTime(st);
				li.add(getReturnInt(cal, calType)+offset);
				return li;
			}else{
				//开闭，开开，无交集
				return Collections.emptyList();
			}
		}else if(compRes>0){
			return Collections.emptyList();
		}
		cal.setTime(st);
	
		//添加stDate
		ret.add(getReturnInt(cal, calType)+offset);
		//计算添加后的时间
		Calendar anotherCal=(Calendar)cal.clone();
		//获取当前时间日期的整天数.基准天
		anotherCal.clear();
		anotherCal.set(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.get(Calendar.DATE));
		
		int max = cal.getMaximum(calType)+1;
		// 用calendar获取时间表
		for (int i = 0; i < max; i++) {
			anotherCal.add(calType, 1);
			//如果自增1天的时间>当前时间
			int compResult=anotherCal.getTime().compareTo(endDate);
			if (compResult>0) {
					//设置end值
					cal.setTime(endDate);
					//利用TreeSet保证数值的唯一性。
					ret.add(getReturnInt(cal, calType)+offset);
					break;
			}else if(compResult == 0 ){
				if(endType == LESS_OR_EQUAL_GREAT_OR_EQUAL){
					//基准值等于end值,添加end值进去
					cal.setTime(endDate);
					ret.add(getReturnInt(cal, calType)+offset);
				}
//				else{
//					endDate小于基准时间，同时基准时间是一天的新开始。所以不添加这个新的一天。	
//				}
				
				break;
			}else{
				//自增天小于当前时间
				ret.add(getReturnInt(anotherCal, calType)+offset);
			}
		}
		List<Object> temp=new ArrayList<Object>(ret.size());
		for (Integer i : ret) {
			temp.add(i);
		}
		return temp;
	}
	
	protected int getReturnInt(Calendar cal,int calType){
		int ret = cal.get(calType);
		return ret;
	}
	
	protected Calendar getCalendarInThreadLocalMap() {
		Calendar cal;
		cal = (Calendar)NestThreadLocalMap.get(CALENDAR);
		if(cal==null){
			cal = Calendar.getInstance();
			NestThreadLocalMap.put(CALENDAR, cal);
		}
		return cal;
	}

	/**
	 * 1为>或< 0为>=或<=
	 * 
	 * @param compDate
	 * @return
	 */
	protected int getType(Comparative compDate) {
		int type = -100;
		if (compDate.getComparison() == Comparative.GREATER_THAN_OR_EQUAL
				|| compDate.getComparison() == Comparative.LESS_THAN_OR_EQUAL) {
			type = LESS_OR_EQUAL_GREAT_OR_EQUAL;
		} else {
			type = LESS_GREAT;
		}
		return type;
	}
}
