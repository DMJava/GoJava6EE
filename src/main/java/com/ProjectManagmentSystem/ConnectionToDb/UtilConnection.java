package com.ProjectManagmentSystem.ConnectionToDb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by pc on 20.06.2017.
 */
public class UtilConnection {
    String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    String DATABASE_URL = "jdbc:mysql://localhost:3306/homework_db?useSSL=true";
    String USER = "root";
    String PASSWORD = "root";

    public Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName(JDBC_DRIVER);
            connection = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);
            System.out.println("Connection ok");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
