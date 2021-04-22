package com.adactin.runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.framework.org.CucumberFramework.Base_Class;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@ExtendedCucumberOptions(retryCount= 4)
@CucumberOptions(features = "src\\test\\java\\com\\adactin\\feature",
                 glue = "com\\adactin\\stepdefinition",
                 monochrome = true,
                 plugin= { "com.cucumber.listener.ExtentCucumberFormatter:ExtentReport/CucumberReport.html"
                           // "rerun:rerunReports/FailedScenario.txt"
                		 })

public class Runner extends Base_Class {

	public static WebDriver driver;

	@BeforeClass
	public static void setup() {

		driver = Base_Class.browserlaunch("chrome");
		maximize();

	}

}
