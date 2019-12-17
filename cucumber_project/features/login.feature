
Feature: Login
	In order to perform successful login
	As a user
	I want to enter correct username and password
	
	Scenario Outline: In order to verify login to facebook
		Given user  navigates to facebook website
		When user navigates to facebook website
		Then user validates the homepage title
		Then user enters "<username>" username
		And user enters "<password>" password
		Then user "<loginType>" logged in
		
		Examples: 
			|username| password	|loginType		|
			|Valid				| Valid 				|should				|
			|Invalid			| Invalid			|shouldNot	|