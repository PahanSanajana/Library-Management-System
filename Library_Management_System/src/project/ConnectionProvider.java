package project;

import java.sql.*;

/**
 *
 * @author LOQ
 */
public class ConnectionProvider {
    public static Connection getCon() {
        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Correct the connection string format
            Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/lms", "root", "1234");
            return con;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
}
