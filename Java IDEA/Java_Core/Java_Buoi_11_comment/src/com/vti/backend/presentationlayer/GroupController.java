package com.vti.backend.presentationlayer;

import java.sql.SQLException;
import java.util.List;

import com.vti.backend.businesslayer.GroupService;
import com.vti.backend.businesslayer.IGroupService;
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
public class GroupController {

	private IGroupService groupService;

	/**
	 * Constructor for class GroupController.
	 * 
	 * @Description: .
	 * @author: NNDuy
	 * @create_date: May 24, 2020
	 * @version: 1.0
	 * @modifer: NNDuy
	 * @modifer_date: May 24, 2020
	 */
	public GroupController() {
		groupService = new GroupService();
	}

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
	public List<Group> getListGroups() throws ClassNotFoundException,
			SQLException {
		return groupService.getListGroups();
	}

	/**
	 * this method used for creating group.
	 * 
	 * @param name
	 *            - name of group
	 * @throws Exception
	 */
	public void createGroup(String name) throws Exception {

		// validation
		if (name == null || name.length() > 20 || name.length() < 6) {
			throw new Exception(
					"Group Name must be greater than 6 characters and less than 20 characters");
		}

		// logic service
		if (groupService.isGroupExists(name)) {
			throw new Exception("Group Name exists!");
		}

		// create
		groupService.createGroup(name);
	}
}
