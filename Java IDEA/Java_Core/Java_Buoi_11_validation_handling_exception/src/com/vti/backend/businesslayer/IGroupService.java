package com.vti.backend.businesslayer;

import java.sql.SQLException;
import java.util.List;

import com.vti.entiy.Group;

public interface IGroupService {
	List<Group> getListGroups() throws ClassNotFoundException, SQLException;

	void createGroup(String name) throws ClassNotFoundException, SQLException;
}
