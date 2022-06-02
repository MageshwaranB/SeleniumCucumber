Feature: Testing the DashBoard page feature 
	Testing the my info link and logging out from the website

Background: User is logged into the website 
	Given User is in login page 
	When User enters username and password and clicks the login button 
	Then User is navigated to the homepage 
	
	
Scenario: User tests the my info 
	When User clicks myinfo link 
	Then info is displayed 
	

Scenario: User logout from the website 
	When User clicks the welcome page and clicks the logout option 
	Then Login page has to displayed