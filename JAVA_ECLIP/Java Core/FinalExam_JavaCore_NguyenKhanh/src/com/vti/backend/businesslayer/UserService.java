package com.vti.backend.businesslayer;

import com.vti.backend.datalayer.IUserRepository;
import com.vti.backend.datalayer.UserRepository;
import com.vti.entity.Employee;
import com.vti.entity.Manager;
import com.vti.entity.User;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

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
	public List<Manager> getListManagerByProjectId(int projectId) throws ClassNotFoundException, SQLException {
		return userRepository.getListManagerByProject(projectId);
	}	
	
	@Override
	public List<Manager> getListManagerInAllProject() throws ClassNotFoundException, SQLException {
		return userRepository.getListManagerInAllProject();
	}	
	
	@Override
	public List<Employee> getListEmployeeInAllProject() throws ClassNotFoundException, SQLException {
		return userRepository.getListEmployeeInAllProject();
	}	
	
	@Override
	public void deleteAccount(int ID) throws SQLException, ClassNotFoundException {
		userRepository.deleteAccount(ID);
	}	
	
	@Override
	public void createAccount(String fullName, String email) throws ClassNotFoundException, SQLException {
		userRepository.createAccount(fullName, email);
		
	}
}
