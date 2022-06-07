package com.vti.backend.presentationlayer;

import com.vti.backend.businesslayer.UserService;
import com.vti.entity.Employee;
import com.vti.entity.Manager;
import com.vti.entity.User;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class UserController {
	private UserService userService;
	
	
	public UserController() throws FileNotFoundException, IOException {
		userService = new UserService();
	}
	
	public User getUser(String email, String password) throws ClassNotFoundException, SQLException {
		return userService.getUser(email, password);
	}

	public List<Employee> getListEmployeeByProjectId(int projectId) throws ClassNotFoundException, SQLException {
		return userService.getListEmployeeByProjectId(projectId);
	}

	public List<Manager> getListManagerByProjectId(int projectId) throws ClassNotFoundException, SQLException {
		return userService.getListManagerByProjectId(projectId);
	}
	
	public List<Employee> getListEmployeeInAllProject() throws ClassNotFoundException, SQLException {
		return userService.getListEmployeeInAllProject();
	}
	
	public List<Manager> getListManagerInAllProject() throws ClassNotFoundException, SQLException {
		return userService.getListManagerInAllProject();
	}

	public void deleteAccount(int ID) throws SQLException, ClassNotFoundException {	
		userService.deleteAccount(ID);
	}

	
	public void createAccount(String fullName, String email) throws SQLException, ClassNotFoundException {
		userService.createAccount(fullName, email);
	}
}


