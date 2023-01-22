package stepDefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DatadrivenTest {
	public static WebDriver driver;

	@Given("user launches chrome browser")
	public void user_launches_chrome_browser() {
		WebDriverManager.chromedriver().setup();
		driver = (WebDriver) new ChromeDriver();
	}

	@When("user opens url {string}")
	public void user_opens_url(String url) {
		driver.get(url);
		;
	}

	@And("user enters email as {string} and password as {string}")
	public void user_enters_email_as_and_password_as(String uname, String pass) {
		driver.findElement(By.id("email")).sendKeys(uname);
		driver.findElement(By.id("pass")).sendKeys(pass);
	}

	@And("user clicks login")
	public void user_clicks_login() {
		// click
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String title1) {
		String title = driver.getTitle();
		if (title.equals(title1)) {
			System.out.println("Title Matched");
		} else {
			System.out.println("Title Not Matched");
		}
	}

	@And("close browser")
	public void close_browser() {
		driver.close();
		System.out.println("Closing Browser");
	}
}