package StepDefinations;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",glue= {"StepDefinations"},
plugin= {"pretty","html:target/HtmlReports/report.html",
"json:target/JSONReports/report.json",
"junit:target/JUNITReports/report.xml"}
)

public class TestRunner {

}
