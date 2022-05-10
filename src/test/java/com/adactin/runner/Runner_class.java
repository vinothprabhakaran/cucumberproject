package com.adactin.runner;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.base_class;
import com.adactin.properties.File_readManager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features ="C:\\Users\\Lenovo\\eclipse-workspace\\cucumberproject\\src\\test\\java\\com\\adactin\\feature\\adactin.feature",glue="com.adactin.stepdefinition")//,//monochrome = true,
//dryRun = false, 
//strict = true,  
//plugin = {"html:Report/Cucumber_Html_Report",
		//"pretty",
		//"json:Report/Cucumber.json",
	//	"com.cucumber.listener.ExtentCucumberFormatter:Report/Extent_Report.html"})
                     
public class Runner_class {
 
	public static WebDriver vinoth;
	@BeforeClass
	public static void setup() throws IOException {
		String browser = File_readManager.GetinstantFIR().GetInstantCR().getBrowser();
		
	vinoth = base_class.setbrowser(browser);

	}
	@AfterClass
	public static void endprocess()  {
		
		vinoth = base_class.close1();

}
}
