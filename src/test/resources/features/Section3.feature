
Feature: Verify the response for the capital city

  Scenario: Extract the name of the capital city from response
    Given I hit the get call for the capital city
      And I get a response for respective capital city
     When I extracted the capital city from the response
     Then I display the response on the console

  Scenario: Verify text presence in the response
    Given I hit the get call for the capital city
      And I get a response for respective capital city
     Then I verify "British pound" presence in the response
