package com.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",glue= {"com.stepDefination"},monochrome=true,
plugin={"html:Reports\\HTMLReports" ,"json:Reports\\JsonReports\\Cucumber.json", "junit:Reports\\JUnitReport\\Cucumber.xml"},
dryRun=false,strict=true)
public class Runner {

}
