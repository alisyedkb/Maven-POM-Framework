package testCases;

import org.testng.annotations.Test;

import e2e.BaseTest;
import e2e.CreateAccountPage;
import e2e.HomePage;

public class CreateAccTest extends BaseTest {

	@Test
	public void createAcc() {

		HomePage hp = new HomePage(driver);
		CreateAccountPage cap = hp.createAccount();
		cap.creAcc(readConfig.getemail(), readConfig.getfirstName(), readConfig.getlastName(),
				readConfig.getpassword());

	}

}
