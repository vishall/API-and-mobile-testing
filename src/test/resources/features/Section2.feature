Feature: Verify the youtility app

  Background:
    Given open the application
    When app is loaded successfully

#  Scenario: Verify home page is loaded successfully
#    Then verify the images and text is getting displayed correctly

  Scenario Outline: Verify swipe through screen
    And swipe the screen
   Then should get navigate to correct "<page>"

    Examples:
      | page                    |
      | home finances           |
      | Switch providers        |
      | bank accounts           |

#  Scenario: Verify terms of service page
#    And click on get started button
#    And verify terms of service link is present
#    And click on terms of service link
#    Then verify respective pop up should display correctly
#
#  Scenario: Verify privacy policy page
#    And click on get started button
#    And verify privacy policy link is present
#    And click on privacy policy link
#    Then verify respective pop up should display correctly
#
#  Scenario: Verify valid email address
#    And click on get started button
#    And select radio button option
#    And click on continue button
#    And should be abe to email text box
#    And enter valid email address
#    And click on continue button
#    Then "Thank you" toast message should be displayed
#
#  Scenario: Verify invalid email address
#    And click on get started button
#    And select radio button option
#    And click on continue button
#    And should be abe to email text box
#    And enter invalid email address
#    And click on continue button
#    Then "Invalid email format" error message should be displayed
