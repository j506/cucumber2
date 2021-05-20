	Feature: Test the login functionaly of OrangeHRM
	Scenario Outline: Test the valid login
	
	Given user is on login page
	When user enter  <username> and <password>
	And click on login button
	Then user should land the Homepage 
	Examples:
	|username|password|
	|Admin|admin123|