/**
 * iddl
 * 
 * Intelligent Distributed Data Layer
 * 
 * iddl-common
 */
package com.it.iddl.common.pipeline;

import java.sql.SQLException;

/**
 * 
 * @author sihai
 *
 */
public interface Handler {

	/**
	 * 从dataBus取得所需数据进行处理，将处理结果放回dataBus, 并流向下一个处理器
	 * @param dataBus
	 * @throws SQLException
	 */
	void handleDown(DataBus dataBus) throws SQLException;
}
