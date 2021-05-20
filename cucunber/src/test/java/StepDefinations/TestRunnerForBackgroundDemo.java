package StepDefinations;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/BackgroundDemo",glue= {""},
monochrome=true,
//plugin= {"pretty","html:target/HtmlReports/report.html"}
plugin= {"pretty","junit:target/JUNITReports/report.xml",
		"json:target/JSONReports/report.json",
		"html:target/HtmlReports/report.html"}


)

public class TestRunnerForBackgroundDemo {

}
