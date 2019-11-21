@All
Feature: To check a product in Amazon

  Scenario Outline: To check the login functionality of the user
    Given USer is logged in with valid <username> and <password>
    Then click on the signin button
    Then Enter the product name and search
    And disply and sort the product as per the price.
    Then i am going to read data from fillo 
    
    Examples:
    |username|password|
    |"renulavender@gmail.com"|"sarandear"|
    
    
