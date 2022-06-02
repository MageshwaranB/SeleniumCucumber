Feature: Adding an user in User Management 
Background: User has to be in User Management Page
	Given User is in the login page 
	When user enter the username and password 
	And user clicks the login button to login 
	And user will be in the dashboard page
	And User clicks the Admin link and also clicks the add user button
	Then User must be in User Management Page 
	
Scenario: User adds a new user in the management 
	Given User present in the User Management page 
	When User gets the employee name from the dropdown
	And User enters the username and password
	And user enters the confirm password and clicks save button
	Then User's account will be added