package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "/src/test/resources/Features/google_Search.feature", monochrome=true, 
    glue = "Stepdefinitions",
    plugin = {"pretty", "html:target/cucumber-reports","json:target/JSONReports/report.xml"}
)
public class TestRunner {
}
