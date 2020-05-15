package com.qa.stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.util.FlightClubBaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FlightClubSmokeTest extends FlightClubBaseClass{
	
WebDriver driver;
	
	@Given("^Open chrome and start application$")
	public void Open_chrome_and_start_application() throws Throwable 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Demoriel Purnell\\eclipse-workspace\\Eudreka_Workspace\\Demo\\Drivers\\chromedriver.exe" );
		driver= new ChromeDriver(); 
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.flightclub.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}

	@When("^I enter valid user name and valid user password$")
	public void I_enter_valid_user_name_and_valid_user_password() throws Throwable 
	{
	   driver.findElement(By.id("sign-in-dropdown")).click();
	   driver.findElement(By.id("email")).sendKeys("dpurnellqa@gmail.com");
	   driver.findElement(By.id("pass")).sendKeys("Kobelastgame60$");
	}

	@Then("^user should be able to login successfully$")
	public void user_should_be_able_to_login_successfully() throws Throwable
	{
		driver.findElement(By.id("send2")).click();
		////
		Thread.sleep(3000);
		driver.getTitle();
		if(driver.getTitle() == "My Account  | Flight Club") 
		{
			System.out.println("Test Passed");
		}
		else 
		{
			System.out.println("Test Failed");
		}
		
		Thread.sleep(2000);
		driver.quit();
	}

}
