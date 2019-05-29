  Feature: Test the Chase Auto Loans functionality of Chase Portal

    @TestCase1
    Scenario Outline: Check the Chase Auto Loans functionality
      Given I launch the Chase Portal home page
      Then I verify the "<Left Side Title>"
      And I click on the Auto Loans menu
      Then I can see a new screen called Chase Auto Loans screen

      Examples:
      | Left Side Title           |
      | Chase Car Buying Service  |

