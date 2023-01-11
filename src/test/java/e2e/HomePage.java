package e2e;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
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

	public LoginPage login(String user, String pass) {
		// opens 2 tabs
		for (int i = 0; i < 2; i++) {
			driver.switchTo().newWindow(WindowType.TAB);
			driver.get(readConfig.gettestSiteURL());
			driver.getTitle();
			Log.info("New Tab Opened");

			try {
				Thread.sleep(250);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			username.sendKeys(user);
			Log.info(user);
			password.sendKeys(pass);
			Log.info(pass);
		}

		driver.switchTo().window((String) driver.getWindowHandles().toArray()[0]);
		return new LoginPage(driver);
	}

	public CreateAccountPage createAccount() {

		return new CreateAccountPage(driver);
	}

}