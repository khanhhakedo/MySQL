package com.vti.backend.businesslayer;

import java.sql.SQLException;
import java.util.List;

import com.vti.backend.datalayer.GroupRepository;
import com.vti.backend.datalayer.IGroupRepository;
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
public class GroupService implements IGroupService {

	private IGroupRepository repository;

	/**
	 * Constructor for class GroupService.
	 * 
	 * @Description: .
	 * @author: NNDuy
	 * @create_date: May 24, 2020
	 * @version: 1.0
	 * @modifer: NNDuy
	 * @modifer_date: May 24, 2020
	 */
	public GroupService() {
		repository = new GroupRepository();
	}

	/*
	 * @see com.vti.backend.businesslayer.IGroupService#getListGroups()
	 */
	@Override
	public List<Group> getListGroups() throws ClassNotFoundException,
			SQLException {
		// logic service
		return repository.getListGroups();
	}

	/*
	 * @see
	 * com.vti.backend.businesslayer.IGroupService#isGroupExists(java.lang.String
	 * )
	 */
	@Override
	public boolean isGroupExists(String name) throws ClassNotFoundException,
			SQLException {
		return repository.isGroupExists(name);
	}

	/*
	 * @see
	 * com.vti.backend.businesslayer.IGroupService#createGroup(java.lang.String)
	 */
	@Override
	public void createGroup(String name) throws Exception {
		repository.createGroup(name);
	}
}
