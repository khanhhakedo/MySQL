package com.vti.backend.businesslayer;

import java.sql.SQLException;
import java.util.List;

import com.vti.backend.datalayer.GroupRepository;
import com.vti.backend.datalayer.IGroupRepository;
import com.vti.entiy.Group;

public class GroupService implements IGroupService {

	private IGroupRepository repository;

	public GroupService() {
		repository = new GroupRepository();
	}

	public List<Group> getListGroups() throws ClassNotFoundException,
			SQLException {
		// logic service
		return repository.getListGroups();
	}

	@Override
	public void createGroup(String name) throws ClassNotFoundException,
			SQLException {
		repository.createGroup(name);
	}
}
