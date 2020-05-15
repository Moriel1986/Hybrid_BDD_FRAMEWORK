package com.qa.runner;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(
		features= "C:\\Users\\Demoriel Purnell\\git\\Eudereka-Selenium-Code\\Demo\\src\\com\\qa\\feature\\features\\HomePageButtons.feature", 
		glue= {"C:\\Users\\Demoriel Purnell\\git\\Eudereka-Selenium-Code\\Demo\\src\\com\\qa\\stepDefinition\\FlightClubButtonSmokeTest.java"}
//		format= {"pretty","html:test-output", "json:json_output/cucumber.json","junit:junit_xml/cucumber.xml"},
//		monochrome = true,
//		strict = false,
//		dryRun = true
//		tags = {"@SmokeTest", "@RegressionTest", "@End2End"}
		)



public class FlightClubButtonTestRunner 
{


	
}
