package com.vti.backend;

import com.vti.entity.ConnectionService;

import java.sql.*;

public class Basic {

    public static  final  String URL_DB= "jdbc:mysql://localhost:3306/TestingSystem?autoReconnect=true&useSSL=false&characterEncoding=latin1";
    public static  final  String USER_NAME= "root";
    public static  final  String PASSWORD= "root";


    public static void testConnection() throws SQLException, ClassNotFoundException {
        Connection connection = ConnectionService.getConnection(URL_DB, USER_NAME, PASSWORD);
    }



    public static void printPosition() throws ClassNotFoundException, SQLException {
        Connection connection = ConnectionService.getConnection(URL_DB, USER_NAME, PASSWORD);

        String sql = "SELECT PositionID,PositionName FROM testingsystem.position";

        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);

        System.out.println(" " + "Bang Position");
        System.out.println("------------------");
        System.out.printf("%s %s %s %n", "ID", "  | ", "Name");
        System.out.println("------------------");

        while (resultSet.next()) {
            System.out.println(resultSet.getInt("PositionID") + "    |   " + resultSet.getString("PositionName"));
            System.out.println("------------------");

        }
    }



    public static void createPosition(String name) throws SQLException, ClassNotFoundException {

        Connection connection = ConnectionService.getConnection(URL_DB, USER_NAME, PASSWORD);

        String sql = "SELECT PositionID,PositionName FROM testingsystem.position";

        String createPosition = "INSERT INTO Position (PositionName)" + "VALUES(?)";

        String PositionName = name;

        PreparedStatement preStatement = connection.prepareStatement(createPosition);

        preStatement.setString(1, PositionName);
        try {
            int resultCreated = preStatement.executeUpdate();

            System.out.println("PositionName: " + PositionName + " ---" + resultCreated);
        } catch (SQLException e){
            System.out.println("Loi roi");
            System.out.println(e.getMessage());
        }

        connection.close();

    }


    public static void updatePosition(String name, int id) throws SQLException, ClassNotFoundException {

        Connection connection = ConnectionService.getConnection(URL_DB, USER_NAME, PASSWORD);

        String sql = "UPDATE `Position`" +
                "SET  PositionName = ? " +
                "WHERE PositionID = ?  ";

        PreparedStatement preStatement = connection.prepareStatement(sql);
//        input from Scanner
        int PositionID = id;
        String PositionName = name;
//         set parameter
        preStatement.setString(1, PositionName);
        preStatement.setInt(2,PositionID);

//        Excute SQL query

        int effectedRecordAmount = preStatement.executeUpdate();

        System.out.println("Effected Record Amount: " + effectedRecordAmount);

        connection.close();

    }

    public static void deletePosition( int id) throws SQLException, ClassNotFoundException {

        Connection connection = ConnectionService.getConnection(URL_DB, USER_NAME, PASSWORD);

        String sqlPosition = "DELETE FROM `Position`"+
                                      " WHERE  PositionID = ? ";

        PreparedStatement preStatement = connection.prepareStatement(sqlPosition);
//        input from Scanner
        int PositionID = id;
//         set parameter
        preStatement.setInt(1,PositionID);

//        Excute SQL query

        int effectedRecordAmount = preStatement.executeUpdate();

        System.out.println("Effected Record Amount: " + effectedRecordAmount);

        connection.close();

    }
}

