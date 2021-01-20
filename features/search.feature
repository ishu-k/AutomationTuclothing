Feature: Search
  As an end user
  I want to search for product
  So that i should see the desired product
  
 
  Scenario: Searchwithvaliddata
    Given Im on home page
    When I search for a prodcut
    Then I should see the desired product
    
    
   Scenario: searchInvalidProductCat
    Given Im on home page
    When I search with invalid productcategory
    Then I should see the invalid product error
    
   Scenario: cursor check for search
    Given Im on home page
    When I search for cursor check
    Then I should see the cursor blinking
    
   Scenario: search with no data
    Given Im on home page
    When I search with no data
    Then I should see the desired error
   
   Scenario: search with color
     Given Im on home page 
     When I search with color
     Then I shuld able to see the color related products
 
  Scenario Outline: search with color
    Given Im on home page
     When I search with "<color>"
     Then I should see the "<color>" product
   Examples:
   
  |color|
  |red   |
  |green |
  |blue  |
  
  
  Scenario Outline: Searchwithvaliddata
   Given Im on home page
      When I search for a "<product>"
      Then I should see the desired "<product>"
    Examples:
    
    |product|
    |jumper|
    |shoes |
    |jacket|
     
  Scenario: Verify search wiht invalid product name
    Given Im on home page
      When I enter invalid product name
      Then I should see error message for invalid product name
      
    @test  
   Scenario: Verify functionality of search with blank product name
   Given Im on home page
    When I leave search text box blank
    Then I should see error message for blank product
   
