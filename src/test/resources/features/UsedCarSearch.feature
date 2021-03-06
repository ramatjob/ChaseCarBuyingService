Feature: Test the Used Car Search functionality of Chase Portal

  @TestCase2
  Scenario Outline: Searching for the used cars in chase portal home screen
    Given I launch the Chase Portal home page
    Then I verify the objects on the Chase portal home page
    And I select a valid used car make from Select Make drop down
    And I enter a valid "<ZipCode>" for Used car
    And I click on Shop Used Cars button
    Then I can see a new page with used car results
    And I get the details of used "<Required Car Link>"
    And I click on the used "<Required Car Link>"
    Then I can see a new page which shows the full details of selected used car
    And I get the full details of used car
    And I close the browser

    Examples:
      | ZipCode | Required Car Link  |
      | 12345   | 1                  |

