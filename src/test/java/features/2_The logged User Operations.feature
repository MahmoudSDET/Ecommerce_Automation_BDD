

Feature: The Logged User Operations
  I want to make some operations as a logged User 
  
    
Background: 
Given The customer is logged in successfully
  
  
  
  
  
 Scenario Outline: SC4-Logged User could search for any product
	When he search for "<productName>"
	Then the product is found in search page
	 |Apple MacBook Pro 13-inch |
	
  Examples:
      | productName               | 
      | Apple MacBook Pro 13-inch |
  
 
 Scenario: SC5- Logged User could switch between currencies US-Euro
	When we switch to Euro
	Then the price of product is switched to Euro sign
	When we switch to US Dollar
	Then the price of product is switched to Dollar sign
	
		
Scenario: SC6- Logged user could select different Categories
	When we select the other category like Electronics from dashboard menu section	
	And  we click the subcategory cells phones
	Then redirection to the category and sub category is successfully
	  | Cell phones|
	
	
Scenario Outline: SC7- Logged user could filter with color
	When we select the "<category>" and "<subcategory>"
	Then we redirect to "<subcategory>" successfully 
	And we can filter with color successfully

 Examples:
      | category|subcategory|
      | Apparel  |Shoes|
 
 Scenario Outline: SC8- Logged user could filter with color
	When we select the "<tage>" from popular tags
	Then we can redirect to "<tage>" successfully 
	

 Examples:
      | tage|
      | apparel |
      
      
 Scenario Outline: SC9- Logged user could add different products to Shopping cart
    When we search for "<productName>"
    And choose to buy Two items
    Then moves to checkout cart and check "<productName>"
    
   


    Examples:
      | productName               | 
      | Apple MacBook Pro 13-inch |     
       
      
 