package com.vti.backend.businesslayer;

import java.sql.SQLException;
import java.util.List;

import com.vti.backend.datalayer.GroupRepository;
import com.vti.entity.Group;


public class GroupService {

	private GroupRepository repository;

	public GroupService() {
		repository = new GroupRepository();
	}

	public List<Group> getListGroups() throws ClassNotFoundException,
			SQLException {
		// logic service
		return repository.getListGroups();
	}
}
