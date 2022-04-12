Feature: Employee Login

Scenario: Successful Login by an Employee
	Given User is on home page 
	When  User  enter "a" and "b"
	And   User selects employee button
	Then  The employee page is displayed