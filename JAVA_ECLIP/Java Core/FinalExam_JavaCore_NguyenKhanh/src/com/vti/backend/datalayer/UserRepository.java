package com.vti.backend.datalayer;

import com.vti.entity.Employee;
import com.vti.entity.Manager;
import com.vti.entity.Role;
import com.vti.entity.User;
import com.vti.ultis.jdbcUltis;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserRepository implements IUserRepository{

	private jdbcUltis jdbcUltis;
	
	
	public UserRepository() throws FileNotFoundException, IOException {
		jdbcUltis = new jdbcUltis();
	}
	
	@Override
	public User getUser(String email, String password) throws ClassNotFoundException, SQLException {
		// chỉ cho phép đăng nhập vào Admin
		String query = "SELECT Id, FullName, Email, `Role` FROM `user` WHERE `Email` = ? AND `Password` = ? AND `Role` = 'ADMIN'";
		PreparedStatement preparedStatement = jdbcUltis.createPrepareStatement(query);
		preparedStatement.setString(1, email);
		preparedStatement.setString(2, password);
		ResultSet resultSet = preparedStatement.executeQuery();
		if(resultSet.next()) {
			User user = new User();
			user.setId(resultSet.getInt("Id"));
			user.setFullName(resultSet.getNString("FullName"));
			user.setEmail(resultSet.getString("Email"));
			user.setRole(Role.valueOf(resultSet.getString("Role")));
			return user;
		}
		else {
			return null;
		}
	}

	@Override
	public List<Employee> getListEmployeeByProjectId(int projectId) throws ClassNotFoundException, SQLException {
		String query = "SELECT Id, FullName, Email, ProSkill, ProjectId FROM `user` WHERE ProjectId = ? AND `Role` = 'EMPLOYEE' ORDER BY Id";
		PreparedStatement preparedStatement = jdbcUltis.createPrepareStatement(query);
		preparedStatement.setInt(1, projectId);
		ResultSet resultSet = preparedStatement.executeQuery();
		List<Employee>employees = new ArrayList<Employee>();
		while(resultSet.next()) {
			Employee employee = new Employee();
			employee.setId(resultSet.getInt("Id"));
			employee.setFullName(resultSet.getNString("FullName"));
			employee.setEmail(resultSet.getString("Email"));
			employee.setProSkill(resultSet.getString("ProSkill"));
			employee.setProjectId(resultSet.getInt("ProjectId"));
			employee.setRole(Role.EMPLOYEE);
			employees.add(employee);
		}
		return employees;
	}

	@Override
	public List<Manager> getListManagerByProject(int projectId) throws ClassNotFoundException, SQLException {

		String query = "SELECT ProjectId, Id, FullName, Email, ExpInYear FROM `user` WHERE ProjectId = ? AND `Role` = 'MANAGER' ORDER BY ProjectId";
		PreparedStatement preparedStatement = jdbcUltis.createPrepareStatement(query);
		preparedStatement.setInt(1, projectId);
		ResultSet resultSet = preparedStatement.executeQuery();

		List<Manager>managers = new ArrayList<Manager>();
		while(resultSet.next()) {
			Manager manager = new Manager();
			manager.setProjectId(resultSet.getInt("ProjectId"));
			manager.setId(resultSet.getInt("Id"));
			manager.setFullName(resultSet.getNString("FullName"));
			manager.setEmail(resultSet.getString("Email"));
			manager.setExpInYear(resultSet.getInt("ExpInYear"));
			managers.add(manager);
		}
		return managers;
	}

	@Override
	public List<Employee> getListEmployeeInAllProject() throws ClassNotFoundException, SQLException {

		String query = "SELECT Id, FullName, Email, ProSkill, ProjectId FROM `user` WHERE `Role` = 'EMPLOYEE' ORDER BY Id";
		ResultSet resultSet = jdbcUltis.executeQuery(query);
		List<Employee>employees = new ArrayList<Employee>();
		while(resultSet.next()) {
			Employee employee = new Employee();
			employee.setId(resultSet.getInt("Id"));
			employee.setFullName(resultSet.getNString("FullName"));
			employee.setEmail(resultSet.getString("Email"));
			employee.setProSkill(resultSet.getString("ProSkill"));
			employee.setProjectId(resultSet.getInt("ProjectId"));
			employee.setRole(Role.EMPLOYEE);
			employees.add(employee);
		}
		return employees;
	}

	@Override
	public List<Manager> getListManagerInAllProject() throws ClassNotFoundException, SQLException {

		String query = "SELECT ProjectId, Id, FullName, Email, ExpInYear FROM `user` WHERE `Role` = 'MANAGER' ORDER BY ProjectId";
		ResultSet resultSet = jdbcUltis.executeQuery(query);
		List<Manager>managers = new ArrayList<Manager>();
		while(resultSet.next()) {
			Manager manager = new Manager();
			manager.setProjectId(resultSet.getInt("ProjectId"));
			manager.setId(resultSet.getInt("Id"));
			manager.setFullName(resultSet.getNString("FullName"));
			manager.setEmail(resultSet.getString("Email"));
			manager.setExpInYear(resultSet.getInt("ExpInYear"));
			managers.add(manager);
		}
		return managers;
	}

	@Override
	public void deleteAccount(int ID) throws SQLException, ClassNotFoundException {

		 String sqlDeleteAccount = "DELETE FROM `User`"+
                 " WHERE  Id = ? AND `Role` != 'ADMIN'";

		 PreparedStatement preparedStatement = jdbcUltis.deletePrepareStatement(sqlDeleteAccount);

		 	preparedStatement.setInt(1,ID);


			preparedStatement.executeUpdate();

	        System.out.println("Delete successfull! " );


			jdbcUltis.disConnection();
	}

	
	
	@Override
	public void createAccount(String fullName, String email) throws ClassNotFoundException, SQLException {


		String sqlCreateAccount = "	INSERT INTO `User` (`FullName` ,	`Email`, `Password`, `ExpInYear`, `ProSkill`,`ProjectId`, `Role` 	)"
				+ "	VALUE				               (	? 	   ,       ?   , '123456'  ,   null     ,    null   ,	null    , 'EMPLOYEE')";
		PreparedStatement preparedStatement = jdbcUltis.createPrepareStatement(sqlCreateAccount);

		preparedStatement.setString(1, fullName);
		
		preparedStatement.setString(2, email);

		// Step 4: execute query
		preparedStatement.executeUpdate();
		
		System.out.println("Create successfull! " );

		// disconnect
		jdbcUltis.disConnection();
	}




}
