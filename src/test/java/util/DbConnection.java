package util;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.openqa.selenium.bidi.Connection;
import org.testng.annotations.Test;

import e2e.BaseTest;

public class DbConnection extends BaseTest {
	@Test
	public void dbConnection() throws SQLException {

		Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/ecommerce",
				ReadConfig.getUserSQL(), ReadConfig.getpassSQL());
		java.sql.Statement stmnt = ((java.sql.Connection) connection).createStatement();
		String query = "select * from Customers";
		ResultSet rs = stmnt.executeQuery(query);

		while (rs.next()) {
			Log.info(rs.getString("City "));
		}
	}
}