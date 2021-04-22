package com.adactin.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\adactin\\feature",
glue = "com\\adactin\\stepdefinition",
monochrome = true,
plugin= { "com.cucumber.listener.ExtentCucumberFormtter:ExtentReport/CucumberReport.html",
         "rerun:rerunReports/FailedScenario.txt"})

public class TestRunner {

}
  