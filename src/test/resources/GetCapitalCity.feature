
Feature: Verify the response for the capital city

  Scenario: Extract the name of the capital city from response
    Given I hit the get call for the capital city
    Then I get a response for respective capital city
    And I extracted the capital city from the response
    Then I display the response on the console

