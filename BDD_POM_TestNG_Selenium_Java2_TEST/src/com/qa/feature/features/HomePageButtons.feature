Feature: Test FlightClub Home Page Buttons Smoke Scenario

	@SmokeTest
	Scenario: Test Button FlightClubLog On FlightClub Home Page
	
	Given I Launched the FlightClub Website and Landed on the FlightClub home page
	
	When  I Enter Jordan 13's in search field
	
	Then  user should land on Jordan 13 page successfully
	
	