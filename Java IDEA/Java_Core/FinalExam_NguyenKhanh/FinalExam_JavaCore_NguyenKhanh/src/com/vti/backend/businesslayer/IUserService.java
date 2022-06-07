package com.vti.backend.businesslayer;

import com.vti.entity.Employee;
import com.vti.entity.Manager;
import com.vti.entity.User;

import java.sql.SQLException;
import java.util.List;

public interface IUserService {
	public User getUser(String email, String password) throws ClassNotFoundException, SQLException;
	
	public List<Employee> getListEmployeeByProjectId(int projectId) throws ClassNotFoundException, SQLException;
	
	public List< Manager > getListManagerByProjectId(int projectId) throws ClassNotFoundException, SQLException;
	
	public List<Manager> getListManagerInAllProject() throws ClassNotFoundException, SQLException;
	
	public List<Employee> getListEmployeeInAllProject() throws ClassNotFoundException, SQLException;
	
	public void deleteAccount(int ID)throws SQLException, ClassNotFoundException;
	
	public void createAccount(String fullName, String email) throws ClassNotFoundException, SQLException;
	

	
}
