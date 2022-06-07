package com.vti.backend.businesslayer;

import java.sql.SQLException;
import java.util.List;

import com.vti.entity.Employee;
import com.vti.entity.Manager;
import com.vti.entity.User;

public interface IUserService {
	public User getUser(String email, String password) throws ClassNotFoundException, SQLException;
	public List<Employee> getListEmployeeByProjectId(int projectId) throws ClassNotFoundException, SQLException;
	public List<Manager> getListManagerInAllProject() throws ClassNotFoundException, SQLException;
}
