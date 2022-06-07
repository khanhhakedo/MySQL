package com.vti.backend.datalayer;

import java.sql.SQLException;
import java.util.List;

import com.vti.entity.Employee;
import com.vti.entity.Manager;
import com.vti.entity.User;

public interface IUserRepository {
	public User getUser(String email, String password) throws ClassNotFoundException, SQLException;
	public List<Employee> getListEmployeeByProjectId(int projectId) throws ClassNotFoundException, SQLException;
	public List<Manager> getListManagerInAllProject() throws ClassNotFoundException, SQLException;
}
