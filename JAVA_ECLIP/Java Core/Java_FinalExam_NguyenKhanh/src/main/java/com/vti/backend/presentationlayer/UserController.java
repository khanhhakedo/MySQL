package com.vti.backend.presentationlayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.backend.businesslayer.UserService;
import com.vti.entity.Employee;
import com.vti.entity.Manager;
import com.vti.entity.User;

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

	public List<Manager> getListManagerInAllProject() throws ClassNotFoundException, SQLException {
		return userService.getListManagerInAllProject();
	}
}
