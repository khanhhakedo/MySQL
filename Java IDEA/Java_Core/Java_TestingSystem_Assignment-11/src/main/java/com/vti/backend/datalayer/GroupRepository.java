package com.vti.backend.datalayer;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.vti.entity.Group;
import com.vti.ultis.JDBCUtils;


public class GroupRepository {

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
		String sql = "SELECT GroupID, GroupName FROM `Group`";
		Statement statement = connection.createStatement();

		// execute query
		ResultSet resultSet = statement.executeQuery(sql);

		// handling result set
		while (resultSet.next()) {
			Group group = new Group(resultSet.getInt("GroupID"),
					resultSet.getString("GroupName"));

			groups.add(group);

		}

		jdbcUtils.disconnect();

		return groups;
	}
}
