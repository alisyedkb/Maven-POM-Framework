package testCases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import e2e.BaseTest;
import e2e.HomePage;
import util.ExcelReader;
import util.Log;

public class DataDrivenTest extends BaseTest {

	@Test(dataProvider = "ddt")
	public void ddt(String user, String pass) throws InterruptedException {

		HomePage hp = new HomePage(driver);
		hp.login(user, pass);
		Log.info(user + " " + pass);
	}

	@DataProvider(name = "ddt")
	public String[][] getddt() throws Exception {

		String path = "/Users/kaif/eclipse-workspace/Facebook/src/main/resources/excel/LoginDDT.xlsx";

		int rowNum = ExcelReader.getRowCount(path, "Sheet1");
		int colcount = ExcelReader.getCellCount(path, "Sheet1", 1);

		String[][] loginData = new String[rowNum][colcount];

		for (int i = 1; i <= rowNum; i++) {
			for (int j = 0; j < colcount; j++) {

				loginData[i - 1][j] = ExcelReader.getCellData(path, "Sheet1", i, j);
			}
		}
		return loginData;
	}
}
