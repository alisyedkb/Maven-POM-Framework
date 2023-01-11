package e2e;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.Log;

public class CreateAccountPage extends BaseTest {

	public CreateAccountPage(WebDriver localDriver) {
		driver = localDriver;
		PageFactory.initElements(localDriver, this);
	}

	@FindBy(xpath = "//*[@id=\"firstName\"]")
	WebElement firstName;

	@FindBy(xpath = "//*[@id=\"lastName\"]")
	WebElement lastName;

	@FindBy(xpath = "//*[@id=\"email\"]")
	WebElement username;

	@FindBy(xpath = "//*[@id=\"fld-p1\"]")
	WebElement password;

	@FindBy(xpath = "//*[@id=\"reenterPassword\"]")
	WebElement confirm;

	@FindBy(xpath = "/html/body/div[1]/div/section/main/div[2]/div[1]/div/div/div/div/div/form/div[8]/button")
	WebElement creAccButton;

	public void creAcc(String uMail, String fname, String lname, String pass) {
		firstName.sendKeys(fname);
		Log.info(fname);
		lastName.sendKeys(lname);
		Log.info(lname);
		username.sendKeys(uMail);
		Log.info(uMail);
		password.sendKeys(pass);
		Log.info(pass);
		confirm.sendKeys(pass);
		Log.info(pass);

		// creAccButton.click();

//		driver.switchTo().newWindow(WindowType.TAB);
//		driver.get(readConfig.gettestSiteURL());
//		driver.getTitle();
//		Log.info("New Tab Opened");

	}

}