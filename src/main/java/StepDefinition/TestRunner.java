package StepDefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="src/main/resources/Features/miniproject.feature", glue= {"StepDefinition"},monochrome=true,
plugin= {"pretty","html:target/HtmlReports","json:target/jsonReports/report.json"})
public class TestRunner {

}
