package e2e;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.Log;

public class HomePage extends BaseTest {

	public HomePage(WebDriver localDriver) {

		driver = localDriver;
		PageFactory.initElements(localDriver, this);
	}

	@FindBy(id = "email")
	WebElement username;

	@FindBy(id = "pass")
	WebElement password;

	public void login(String user, String pass) throws InterruptedException {

		for (int i = 0; i < 2; i++) {
			driver.get(readConfig.gettestSiteURL());
			username.sendKeys(user);
			Log.info(user);
			password.sendKeys(pass);
			Log.info(pass);
		}
	}

	public CreateAccountPage createAccount() {

		return new CreateAccountPage(driver);
	}

}