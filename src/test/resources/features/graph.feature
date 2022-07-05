@tagS
Feature: Stack

   @testS001
     Scenario Outline: Login to the application with valid credentials.
    Given The user is in the Home page after logged in
    When  The user gets the validdata from the datasheet with "<testId>" and "<sheetName>"
    And The user clicks Graph button in the home page 
    Then The user should be directed to Stack Page with "Graph"
    
     Examples:
   |testId|sheetName|
   |    a |Sheet1   |
    
      
  @testS002
   Scenario Outline:
   Given The user is in the Graph page after logged in with input from data sheet under "<testId>" and "<sheetName>"
   When  The user clicks operations in Graph button
   And   The user clicks Try Here button in Operations in Graph page
   When  The User enters pyton code and run it in Operations in Graph
   Then  The user should get print statement for Operations in Graph
    Examples:
   |testId|sheetName|
   |    a |Sheet1   |
   
  @testS003
    Scenario Outline:
   Given The user is in the Graph page after logged in with input from data sheet under "<testId>" and "<sheetName>"
   When  The user clicks implementation button
   And   The user clicks Try Here button in Implementation page
   When  The User enters pyton code and run it in Implementation
   Then  The user should get print statement for Implementation
    Examples:
   |testId|sheetName|
   |    a |Sheet1   |
   
  @testS004
   Scenario Outline:
   Given The user is in the Graph page after logged in with input from data sheet under "<testId>" and "<sheetName>"
   When  The user clicks Graph Representations
   And   The user clicks Try Here button in Graph Representations page
   When  The User enters python code and run it in Graph Representations
   Then  The user should get print statement for Graph Representations
    Examples:
   |testId|sheetName|
   |    a |Sheet1   |