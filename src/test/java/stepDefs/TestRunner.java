package stepDefs;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Users/kaif/eclipse-workspace/Facebook/src/test/resources/Features", glue = {
		"stepDefs" }, monochrome = true, plugin = { "pretty", "html:target/HtmlReports" }, dryRun = true)

public class TestRunner {

}
