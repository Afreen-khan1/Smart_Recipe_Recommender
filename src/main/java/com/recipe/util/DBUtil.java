package com.recipe.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

    private static final String URL = "jdbc:mysql://localhost:3306/smart_recipe_db";
    private static final String USER = "root";
    private static final String PASSWORD = "Recipe@1234";

    public static Connection getConnection() throws SQLException {
        Connection connection = null;
        try {
            // Load the MySQL driver class (for newer versions - use this for mysql-connector-j-8.x and 9.x)
            Class.forName("com.mysql.cj.jdbc.Driver");
            // If you were using an older connector (5.x), you would use:
            // Class.forName("com.mysql.jdbc.Driver");

            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            System.err.println("MySQL JDBC Driver not found!");
            e.printStackTrace();
            throw new SQLException("MySQL JDBC Driver not found!");
        }
        return connection;
    }
}