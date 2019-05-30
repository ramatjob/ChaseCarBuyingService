  Feature: Test the New Car Search functionality of Chase Portal

    @TestCase1
    Scenario Outline: Searching for the new cars in chase portal home screen
      Given I launch the Chase Portal home page
      Then I verify the objects on the Chase portal home page
      And I select a valid value from Select Make drop down
      And I enter a valid "<ZipCode>"
      And I click on Shop New Cars button
      Then I can see a new page with car results
      And I get the details of "<Required Car Link>"
      And I click on the "<Required Car Link>"
      Then I can see a new page which shows the full details of selected car
      And I get the full details of car
      Then I can compare car image and model against the details of car search results
      And I close the browser

      Examples:
      | ZipCode | Required Car Link |
      | 12345   | 1                 |
      | 12345   | 6                 |

