/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-parse
 */
package com.it.iddl.parser.sql.objecttree.traversal;

import java.util.LinkedList;
import java.util.List;

import com.it.iddl.parser.sql.objecttree.OrderByElement;

/**
 * 
 * @author sihai
 *
 */
public class OrderByTraversalAction implements TraversalSQLAction {

	private List<OrderByElement> orderByElementList = new LinkedList<OrderByElement>();

	public void actionProformed(TraversalSQLEvent event) {

		List<OrderByElement> temp = event.getCurrStatement().nestGetOrderByList();
		if (orderByElementList.size()==0) {
			if (temp != null && temp.size() != 0){
				orderByElementList = temp;
			}
		} else {
			if (temp != null&&!temp.isEmpty()){
				//如果list不为null,并且是非空，则表示集合内有数据
				throw new IllegalArgumentException("不允许在嵌套sql中出现多个order by条件");
			}
		}
	}
	public List<OrderByElement> getOrderByElementList(){
		return orderByElementList;
	}
}
