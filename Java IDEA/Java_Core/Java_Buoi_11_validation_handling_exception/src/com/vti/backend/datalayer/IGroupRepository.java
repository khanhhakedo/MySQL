package com.vti.backend.datalayer;

import java.sql.SQLException;
import java.util.List;

import com.vti.entiy.Group;

public interface IGroupRepository {
	List<Group> getListGroups() throws ClassNotFoundException, SQLException;

	void createGroup(String name) throws ClassNotFoundException, SQLException;
}
