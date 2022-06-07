package com.vti.backend.presentationlayer;

import java.sql.SQLException;
import java.util.List;

import com.vti.backend.businesslayer.GroupService;
import com.vti.entiy.Group;

public class GroupController {

	private GroupService groupService;

	public GroupController() {
		groupService = new GroupService();
	}

	public List<Group> getListGroups() throws ClassNotFoundException,
			SQLException {
		// validation TODO
		return groupService.getListGroups();
	}
}
