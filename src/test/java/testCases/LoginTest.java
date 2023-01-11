package testCases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import e2e.BaseTest;
import e2e.HomePage;

public class LoginTest extends BaseTest {

	@Test(dataProvider = "logindata")
	public void login(String user, String pass) {

		HomePage hp = new HomePage(driver);
		hp.login(user, pass);
	}

	@DataProvider(name = "logindata")
	public static String[][] getData() {

		String[][] loginData = {

				{ "prince.ali23k@gmail.com", "p@ssword1" }, { "testcase1.com", "p@ssword1" },
				{ "testcase2@icloud", "p@ssword1" } };

		return loginData;
	}
}
