package com.vti.entity;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionService {
    public static Connection getConnection( String url, String userName, String passWord){
        Connection connection = null;
        try {
          connection = DriverManager.getConnection(url, userName, passWord);
        }catch(Exception ex){
            System.err.println(ex);
            System.err.println("Get connection failed!");
        }
        System.out.println("Get connection success!");
        return connection;
    }
}
