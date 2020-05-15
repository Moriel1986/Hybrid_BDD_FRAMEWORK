package com.qa.stepDefinition;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.pages.FlightClubHomePage;
import com.qa.util.FlightClubBaseClass;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FlightClubButtonSmokeTest extends FlightClubBaseClass 
{
	FlightClubHomePage homepage;
	FlightClubHomePage FlightClubTest = PageFactory.initElements(driver, FlightClubHomePage.class);
	FlightClubBaseClass BC = new FlightClubBaseClass();
	
	//@Test(groups={"Regression"}, priority=1)
	@Given("^I Launched the FlightClub Website and Landed on the FlightClub home page$")
	public void I_Land_on_FlightClub_HomePage() throws Throwable
	{
		BC.sleep(5);
		FlightClubTest.SearchBar("Jordan 13");
		
	}
	
	
	@When("^I Enter Jordan 13's in search field$")
	public void I_Click_FlightClubLog_Button_on_FlightClub_Home_Page() throws Throwable 
	{
		BC.sleep(5);
		FlightClubTest.BlackRed13s();
		
	}
	
	
	@Then("^user should land on Jordan 13 page successfully$")
	public void user_should_be_able_to_land_on_FlightClubLog_page_successfully() throws Throwable
	{
		BC.sleep(5);
		String currentTitle=driver.getTitle();
		BC.Print(currentTitle);
		Assert.assertTrue(currentTitle.contains("Sneakers. Here. | Flight Club"));
		
	}
	
	
	

}