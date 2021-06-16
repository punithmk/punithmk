package com.pmk.test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features = "target/classes", tags = {"@api"} , monochrome = true, plugin = {
        "pretty", "html:target/cucumber-report/runapiat",
        "json:target/cucumber-report/runapiat/cucumber.json",
        "rerun:target/cucumber-report/single/rerun.txt"},
        glue = "com.pmk.test")
public class RunAPItestSuite extends AbstractTestNGCucumberTests {
}
