package e2e;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import util.Log;
import util.ReadConfig;

public class BaseTest {

	public static WebDriver driver;
	public static ReadConfig readConfig = new ReadConfig();
	static ExtentTest test;

	@Parameters("browser")
	@BeforeSuite
	public void setUp(@Optional("firefox") String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = (WebDriver) new ChromeDriver();
			Log.info("Launching Chrome");

		} else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = (WebDriver) new FirefoxDriver();
			Log.info("Launching Firefox");
		} else {
			WebDriverManager.safaridriver().setup();
			driver = (WebDriver) new SafariDriver();
		}

		driver.get(readConfig.gettestSiteURL());
		Log.info(readConfig.gettestSiteURL());
		// driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@AfterSuite
	public void tearDown() {
//		if (driver != null)
//			Log.info("Driver Quitting");
//		driver.quit();
	}
}
