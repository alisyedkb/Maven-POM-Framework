package stepDefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps {
	public static WebDriver driver;

	@Given("user is on the login page")
	public void user_is_on_the_login_page() {
		WebDriverManager.chromedriver().setup();
		driver = (WebDriver) new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		driver.findElement(By.id("email")).sendKeys("prince.ali23k@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("P@ssword1");

	}

	@When("clicks on the login button")
	public void clicks_on_the_login_button() {
		// click
	}

	@Then("user is successfully logged in")
	public void user_is_successfully_logged_in() {

		Assert.assertEquals(driver.getTitle(), "Facebook - log in or sign up");
		driver.quit();

	}
}
