package e2e;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.Log;

public class LoginPage extends BaseTest {

	LoginPage(WebDriver localDriver) {
		driver = localDriver;
		PageFactory.initElements(localDriver, this);
	}

	@FindBy(id = "email")
	WebElement usernamefb;

	@FindBy(id = "pass")
	WebElement passwordfb;

	@FindBy(xpath = "//*[text()='Sign In']")
	WebElement signInButton;

	public UserPage login(String user, String pass) {
		usernamefb.sendKeys(user);
		Log.info(user);
		passwordfb.sendKeys(pass);
		Log.info(pass);

		// signInButton.click();
		return new UserPage(driver);

	}

}
