package com.vti.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * This class is JDBC utils.
 * 
 * @Description: .
 * @author: NNDuy
 * @create_date: May 24, 2020
 * @version: 1.0
 * @modifer: NNDuy
 * @modifer_date: May 24, 2020
 */
public class JDBCUtils {

	private Connection connection;

	/**
	 * This method is connect to sql.
	 * 
	 * @Description: .
	 * @author: NNDuy
	 * @create_date: May 24, 2020
	 * @version: 1.0
	 * @modifer: NNDuy
	 * @modifer_date: May 24, 2020
	 * @return
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public Connection getConnection() throws ClassNotFoundException,
			SQLException {
		if (connection == null || connection.isClosed()) {
			String url = "jdbc:mysql://localhost:3306/TestingSystem?autoReconnect=true&useSSL=false&characterEncoding=latin1";
			String username = "root";
			String password = "root";

			// Step 1* register the driver class with DriverManager
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Step 2: get a Database Connection

			connection = DriverManager.getConnection(url, username, password);
		}

		return connection;
	}

	/**
	 * This method is disconnect to sql.
	 * 
	 * @Description: .
	 * @author: NNDuy
	 * @create_date: May 24, 2020
	 * @version: 1.0
	 * @modifer: NNDuy
	 * @modifer_date: May 24, 2020
	 * @throws SQLException
	 */
	public void disconnect() throws SQLException {
		if (connection != null && connection.isClosed()) {
			connection.close();
		}
	}
}
