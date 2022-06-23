package com.vti.backend.bussinesslayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.backend.datalayer.IUserRepository;
import com.vti.backend.datalayer.UserRepository;
import com.vti.entity.Employee;
import com.vti.entity.Manager;
import com.vti.entity.User;

public class UserService implements IUserService{

	private IUserRepository userRepository;
	public UserService() throws FileNotFoundException, IOException {
		userRepository = new UserRepository();
	}
	@Override
	public User getUser(String email, String password) throws ClassNotFoundException, SQLException {
		return userRepository.getUser(email, password);
	}

	@Override
	public List<Employee> getListEmployeeByProjectId(int projectId) throws ClassNotFoundException, SQLException {
		return userRepository.getListEmployeeByProjectId(projectId);
	}

	@Override
	public List<Manager> getListManagerInAllProject() throws ClassNotFoundException, SQLException {
		return userRepository.getListManagerInAllProject();
	}

}
