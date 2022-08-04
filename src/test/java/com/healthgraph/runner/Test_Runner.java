package com.healthgraph.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\AVITA\\eclipse-workspace\\HeathGraph1\\src\\test\\java\\FeatureFiles\\Healthgraph.feature",
                 glue = "C:\\Users\\AVITA\\eclipse-workspace\\HeathGraph1\\src\\test\\java\\com\\healthgraph\\stepdefination\\Step_Defination.java",
                 monochrome = true,
		 dryRun = false,
                 plugin = {"pretty"})

public class Test_Runner {

	public static WebDriver driver;

	@BeforeClass
	public static void set_Up() {

		System.setProperty("Webdriver.chrome.driver",
				"C:\\Users\\AVITA\\eclipse-workspace\\HeathGraph1\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.nobroker.in/");
	}

	@AfterClass
	public static void tear_Down() {

		driver.close();
	}

}
