package util;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import e2e.BaseTest;

public class Reporting extends BaseTest implements ITestListener {

	public ExtentSparkReporter htmlReport; // Create HTML Report
	public ExtentTest test; // Logging Purpose
	public ExtentReports extent; // Attach HTML Report

	public void onStart(ITestContext context) {

		htmlReport = new ExtentSparkReporter("ExtentReport.html");
		htmlReport.config().setTheme(Theme.STANDARD);
		htmlReport.config().setEncoding("utf-8");
		htmlReport.config().setDocumentTitle("testreport");
		htmlReport.config().setReportName("Test Automation Report");
		extent = new ExtentReports();
		extent.attachReporter(htmlReport);

	}

	public void onTestStart(ITestResult result) {

	}

	public void onTestSuccess(ITestResult result) {
		extent.createTest(result.getName());
		test.log(Status.PASS, MarkupHelper.createLabel(result.getName(), ExtentColor.GREEN));
		Log.info("Test passed from reporting classs");
	}

	public void onTestFailure(ITestResult result) {
		extent.createTest(result.getName());
		test.log(Status.FAIL, MarkupHelper.createLabel(result.getName(), ExtentColor.RED));
	}

	public void onTestSkipped(ITestResult result) {

	}

	public void onFinish(ITestContext context) {

		extent.flush();

	}

}
