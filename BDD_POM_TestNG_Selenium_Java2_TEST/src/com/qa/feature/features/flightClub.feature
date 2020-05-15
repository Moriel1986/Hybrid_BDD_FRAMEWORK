Feature: Test FlightClub smoke scenario

	Scenario: Test login with valid credentials
	
	Given Open chrome and start application
	
	When I enter valid user name and valid user password
	
	Then user should be able to login successfully
	