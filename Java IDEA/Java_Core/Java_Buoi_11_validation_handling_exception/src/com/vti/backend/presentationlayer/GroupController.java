package com.vti.backend.presentationlayer;

import java.sql.SQLException;
import java.util.List;

import com.vti.backend.businesslayer.GroupService;
import com.vti.backend.businesslayer.IGroupService;
import com.vti.entiy.Group;

public class GroupController {

	private IGroupService groupService;

	public GroupController() {
		groupService = new GroupService();
	}

	public List<Group> getListGroups() throws ClassNotFoundException,
			SQLException {
		return groupService.getListGroups();
	}

	public void createGroup(String name) throws Exception {

		// validation
		if (name == null || name.length() > 20 || name.length() < 6) {
			throw new Exception(
					"Group Name must be greater than 6 characters and less than 20 characters");
		}

		groupService.createGroup(name);
	}
}
