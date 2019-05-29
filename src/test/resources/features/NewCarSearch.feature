  Feature: Test the New Car Search functionality of Chase Portal

    @TestCase1
    Scenario Outline: Searching for the new cars in chase portal home screen
      Given I launch the Chase Portal home page
      Then I verify the "<Left Side Title>"
      And I select a valid value from Select Make drop down
      And I enter a valid "<ZipCode>"
      And I click on Shop New Cars button
      Then I can see a new page with car results
      And I get the details of first car link
      And I click on the first car link
      Then I can see a new page which shows the full details of selected car
      And I get the full details of car


#      And I close the browser

      Examples:
      | Left Side Title           | ZipCode |
      | Chase Car Buying Service  | 12345   |

