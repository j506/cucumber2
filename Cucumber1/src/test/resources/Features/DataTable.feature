	Feature: Test the login functionaly of OrangeHRM using Data Table
	Scenario: Test the valid login
	
	Given user is on login page
	When user enter  credentials using DataTable
	|admin|admin123|
	And click on login button
	Then user should land the Homepage 
