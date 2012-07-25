/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-group-datasource
 */
package com.it.iddl.group.config;

import java.util.HashMap;
import java.util.Map;

import com.it.iddl.common.weight.Weight;

/**
 * 
 * @author sihai
 *
 */
public class GroupDataSourceConfig {
	
	private String groupConf;
	private Map<String /*Atom datasource key*/, Weight> weightMap;
	
	public GroupDataSourceConfig(String groupConf, Map<String, Weight> weightMap) {
		this.groupConf = groupConf;
		this.weightMap = weightMap;
	}

	public String getGroupConf() {
		return groupConf;
	}

	public void setGroupConf(String groupConf) {
		this.groupConf = groupConf;
	}

	public Map<String, Weight> getWeightMap() {
		return weightMap;
	}

	public void setWeightMap(Map<String, Weight> weightMap) {
		this.weightMap = weightMap;
	}
	
	public int getGroupSize() {
		return weightMap.size();
	}
	/**
	 * 非线程安全
	 * @param atomDsKey
	 * @param weight
	 */
	public void add(String atomDsKey, Weight weight) {
		if(null == weightMap) {
			weightMap = new HashMap<String, Weight>();
		}
		weightMap.put(atomDsKey, weight);
	}
}
