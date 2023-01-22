package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {

	FileInputStream fis;
	static Properties properties = new Properties();

	public ReadConfig() {
		try {
			fis = new FileInputStream(
					"/Users/kaif/eclipse-workspace/Facebook/src/main/resources/properties/config.properties");
			try {
				properties.load(fis);
			} catch (IOException e) {
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			Log.info(e.getMessage());
		}
	}

	public String gettestSiteURL() {
		String testSite = properties.getProperty("testSiteURL");
		return testSite;
	}

	public String getfirstName() {
		String firstName = properties.getProperty("firstName");
		return firstName;
	}

	public String getlastName() {
		String lastName = properties.getProperty("lastName");
		return lastName;
	}

	public String getemail() {
		String email = properties.getProperty("username");
		return email;
	}

	public String getpassword() {
		String password = properties.getProperty("password");
		return password;
	}

	public static String getUserSQL() {
		String userSQL = properties.getProperty("usermysql");
		return userSQL;
	}

	public static String getpassSQL() {
		String passSQL = properties.getProperty("userpass");
		return passSQL;
	}

}
