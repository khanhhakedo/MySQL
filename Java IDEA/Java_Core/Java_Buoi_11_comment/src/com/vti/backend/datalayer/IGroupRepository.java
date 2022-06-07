package com.vti.backend.datalayer;

import java.sql.SQLException;
import java.util.List;

import com.vti.entiy.Group;

/**
 * This class is .
 * 
 * @Description: .
 * @author: NNDuy
 * @create_date: May 24, 2020
 * @version: 1.0
 * @modifer: NNDuy
 * @modifer_date: May 24, 2020
 */
public interface IGroupRepository {

	/**
	 * This method is .
	 * 
	 * @Description: .
	 * @author: NNDuy
	 * @create_date: May 24, 2020
	 * @version: 1.0
	 * @modifer: NNDuy
	 * @modifer_date: May 24, 2020
	 * @return
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	List<Group> getListGroups() throws ClassNotFoundException, SQLException;

	/**
	 * This method is .
	 * 
	 * @Description: .
	 * @author: NNDuy
	 * @create_date: May 24, 2020
	 * @version: 1.0
	 * @modifer: NNDuy
	 * @modifer_date: May 24, 2020
	 * @param name
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	void createGroup(String name) throws ClassNotFoundException, SQLException;

	/**
	 * This method is .
	 * 
	 * @Description: .
	 * @author: NNDuy
	 * @create_date: May 24, 2020
	 * @version: 1.0
	 * @modifer: NNDuy
	 * @modifer_date: May 24, 2020
	 * @param name
	 * @return
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	boolean isGroupExists(String name) throws ClassNotFoundException,
			SQLException;
}
