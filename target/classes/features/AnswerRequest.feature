Feature: Answer Request

Background: 
	Given User is on home page 
	When  User  enter "a" and "b"
	And   User selects Manager button
	Then  Manager page is displayed

Scenario: Successful answer request by a Manager
	Given Manager selects view update status
	When Manager enters "name" "reason" and "status"
	Then Manager submits answers