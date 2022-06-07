package com.vti.backend.datalayer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.vti.entiy.Group;
import com.vti.utils.JDBCUtils;

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
public class GroupRepository implements IGroupRepository {

	private JDBCUtils jdbcUtils;

	/**
	 * Constructor for class GroupRepository.
	 * 
	 * @Description: .
	 * @author: NNDuy
	 * @create_date: May 24, 2020
	 * @version: 1.0
	 * @modifer: NNDuy
	 * @modifer_date: May 24, 2020
	 */
	public GroupRepository() {
		jdbcUtils = new JDBCUtils();
	}

	/*
	 * @see com.vti.backend.datalayer.IGroupRepository#getListGroups()
	 */
	public List<Group> getListGroups() throws ClassNotFoundException,
			SQLException {

		List<Group> groups = new ArrayList<>();

		// get connection
		Connection connection = jdbcUtils.getConnection();

		// Create a statement object
		String sql = "SELECT id, name FROM `Group`";
		Statement statement = connection.createStatement();

		// execute query
		ResultSet resultSet = statement.executeQuery(sql);

		// handling result set
		while (resultSet.next()) {
			Group group = new Group(resultSet.getInt("id"),
					resultSet.getString("name"));

			groups.add(group);

		}

		// disconnect
		jdbcUtils.disconnect();

		return groups;
	}

	/*
	 * @see
	 * com.vti.backend.datalayer.IGroupRepository#createGroup(java.lang.String)
	 */
	@Override
	public void createGroup(String name) throws ClassNotFoundException,
			SQLException {
		// get connection
		Connection connection = jdbcUtils.getConnection();

		String sql = "	INSERT INTO `Group` (`name` ,	`author_ID`	)"
				+ "	VALUE				(	? 	,		1		)";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);

		preparedStatement.setString(1, name);

		// Step 4: execute query
		preparedStatement.executeUpdate();

		// disconnect
		jdbcUtils.disconnect();
	}

	/*
	 * @see
	 * com.vti.backend.datalayer.IGroupRepository#isGroupExists(java.lang.String
	 * )
	 */
	@Override
	public boolean isGroupExists(String name) throws ClassNotFoundException,
			SQLException {
		// get connection
		Connection connection = jdbcUtils.getConnection();

		// Create a statement object
		String sql = "SELECT 1 FROM `Group` WHERE `name` = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);

		preparedStatement.setString(1, name);

		// Step 4: execute query
		ResultSet resultSet = preparedStatement.executeQuery();

		// Step 5: handling result set
		if (resultSet.next()) {
			// disconnect
			jdbcUtils.disconnect();
			return true;
		}

		// disconnect
		jdbcUtils.disconnect();

		return false;

	}
}
