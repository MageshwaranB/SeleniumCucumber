Feature: Testing them login functionality 
Scenario Outline: Executing the test with valid data 
	Given User is in the login Page 
	When User enters the <username> and <password> 
	And User clicks the login buttons 
	Then Homepage should be displayed 
	
	Examples: 
		|username|password|
		|standard_user|secret_sauce|
		|problem_user|secret_sauce|
		|performance_glitch_user|secret_sauce|
		
Scenario Outline: Executing the test with invalid data 
	Given User is in the login Page 
	When User enters the <username> and <password> 
	And User clicks the login button 
	Then Homepage should be displayed 
	
	Examples: 
		|username|password|
		|abcd|fhsll|
		|problem_user|12334|
		|""|secret_sauce|
