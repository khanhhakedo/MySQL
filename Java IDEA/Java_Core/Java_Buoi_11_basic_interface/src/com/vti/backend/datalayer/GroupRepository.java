package com.vti.backend.datalayer;

import java.sql.Connection;
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

		jdbcUtils.disconnect();

		return groups;
	}
}
