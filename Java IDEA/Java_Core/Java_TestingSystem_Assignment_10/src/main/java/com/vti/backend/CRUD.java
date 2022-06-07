package com.vti.backend;

import com.vti.entity.ConnectionService;
import com.vti.entity.Department;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CRUD {

    public static final String URL_DB = "jdbc:mysql://localhost:3306/TestingSystem?autoReconnect=true&useSSL=false&characterEncoding=latin1";
    public static final String USER_NAME = "root";
    public static final String PASSWORD = "root";

    public static void printDepartment() throws SQLException, ClassNotFoundException {
        Connection connection = ConnectionService.getConnection(URL_DB, USER_NAME, PASSWORD);
        List<Department> listDepartments = new ArrayList<Department>();

        String sql = "SELECT * FROM testingsystem.Department";

        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);


        while (resultSet.next()) {
            Department department = new Department();
            department.setId(resultSet.getInt("DepartmentID"));
            department.setName(resultSet.getString("DepartmentName"));

            listDepartments.add(department);

        }

        for (Department department : listDepartments) {
            System.out.println(department);
        }

        connection.close();
    }


    public static void Question_2() throws SQLException, ClassNotFoundException {
        Connection connection = ConnectionService.getConnection(URL_DB, USER_NAME, PASSWORD);
        List<Department> listDepartments = new ArrayList<Department>();

        String sql = "SELECT * FROM testingsystem.Department";

        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);


        while (resultSet.next()) {
            Department department = new Department();
            department.setId(resultSet.getInt("DepartmentID"));
            department.setName(resultSet.getString("DepartmentName"));

            listDepartments.add(department);
        }


        try {
            for (Department department : listDepartments) {
                if (department.getId() == 5) {
                    System.out.println(department);
                }
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        connection.close();
    }

    public static void Question_3(int a) throws SQLException, ClassNotFoundException {
        Connection connection = ConnectionService.getConnection(URL_DB, USER_NAME, PASSWORD);
        List<Department> listDepartments = new ArrayList<Department>();

        String sql = "SELECT * FROM testingsystem.Department";

        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);


        while (resultSet.next()) {
            Department department = new Department();
            department.setId(resultSet.getInt("DepartmentID"));
            department.setName(resultSet.getString("DepartmentName"));

            listDepartments.add(department);
        }


        try {
            for (Department department : listDepartments) {
                if (department.getId() == a) {
                    System.out.println(department);
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        connection.close();
    }

    public static void Question_4(String a) throws SQLException, ClassNotFoundException {
        Connection connection = ConnectionService.getConnection(URL_DB, USER_NAME, PASSWORD);
        List<Department> listDepartments = new ArrayList<Department>();

        String sql = "SELECT * FROM testingsystem.Department";

        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);


        while (resultSet.next()) {
            Department department = new Department();
            department.setId(resultSet.getInt("DepartmentID"));
            department.setName(resultSet.getString("DepartmentName"));

            listDepartments.add(department);
        }

        try {
            for (Department department : listDepartments) {
                if (department.getName() == a) {
                    System.out.println(department);
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        connection.close();
    }



}
