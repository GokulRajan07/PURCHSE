package com.runner;

import java.io.IOException;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.baseclass.BaseClass;
import com.helper.FileReaderManager;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\acer\\eclipse-workspace\\Project\\src\\test\\java\\com\\feature\\amazon.feature",
                  glue    = "com.stepdefinition",
                  dryRun  = false,
                  monochrome =true,
                  plugin  = {"pretty",
                		     "html:target/Amazon.html",
                		     "json:target/Amazon.json",
                		     "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
                  )
public class Runner {
	public static WebDriver driver;
	
	@BeforeClass
	public static void setUp() throws IOException {
      String browser = FileReaderManager.getInstance().getIntanceCr().getBrowser();
      driver=BaseClass.browser(browser);
	}
	
	}


