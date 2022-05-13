Feature: The Un Logged User Operations
   I want to make some operations as a un logged User 

Background: 
  Given the user in the home page
   
	Scenario Outline: SC1- User could register with valid data
	When I click on register link
	And I entered "<firstname>" , "<lastname>" , "<email>" , "<password>"
	Then The registration page displayed successfully
 
 
 
 	Examples:
 	 | firstname | lastname | email | password |
 	 | ahmed | mohamed | ahmed@user2298.com | 12345678 |
 	
 
 	
 	
 	Scenario Outline: SC2- User could reset his/her password successfully
	When I click on login link
	And I click on forget password link
	Then I can entered my email "<email>"
	When I click on recover button 
  Then the message should be displayed as
     | Email with instructions has been sent to you.|
  And I should close the displayed message                       
        
 Examples:
 	 | email |
   | ahmed@user24598.com |
   
 
 Scenario Outline: SC3- User could log in with valid email and password
	When I click on login link
	And I entered  "<email>" , "<password>"
	Then The user is logged in successfully
 

 Examples:
 	 | email | password |
   | ahmed@user24598.com | 12345678 |
   
 
      
      
 
	    