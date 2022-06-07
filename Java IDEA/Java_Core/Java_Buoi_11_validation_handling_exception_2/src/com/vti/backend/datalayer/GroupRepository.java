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

public class GroupRepository implements IGroupRepository {

	private JDBCUtils jdbcUtils;

	public GroupRepository() {
		jdbcUtils = new JDBCUtils();
	}

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
