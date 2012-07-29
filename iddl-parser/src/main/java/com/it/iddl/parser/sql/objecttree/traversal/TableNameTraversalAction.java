/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-rule
 */
package com.it.iddl.parser.sql.objecttree.traversal;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.it.iddl.parser.sql.objecttree.TableName;
import com.it.iddl.parser.sql.objecttree.impl.TableNameImpl;

/**
 * 
 * @author sihai
 *
 */
public class TableNameTraversalAction implements TraversalSQLAction {

	private Set<String> snap=new HashSet<String>(1);
	
	public void actionProformed(TraversalSQLEvent event) {
		List<TableName> tbNames=event.getCurrStatement().getTbNames();
		for (TableName tbName : tbNames) {
			if(tbName instanceof TableNameImpl){
				snap.addAll(tbName.getTableName());
			}
		}
	}
	public Set<String> getTableName(){
		return snap;
	}
}
