package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

    public void DbConnection() throws SQLException {

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/ecommerce", "root", " ");

    }
}
