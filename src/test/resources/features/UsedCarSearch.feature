#Feature: Test the Used Car Search functionality of Chase Portal
#
#  @TestCase1
#  Scenario Outline: Searching for the used cars in chase portal home screen
#    Given I launch the Chase Portal home page
#    Then I verify the "<Left Side Title>"
#    And I select a valid used car make from Select Make drop down
#    And I enter a valid "<ZipCode>" for Used car
#    And I click on Shop Used Cars button
#    Then I can see a new page with used car results
#    And I get the details of first used car link
#    And I click on the first used car link
#    Then I can see a new page which shows the full details of selected used car
#    And I get the full details of used car
##      And I close the browser
#
#    Examples:
#      | Left Side Title           | ZipCode |
#      | Chase Car Buying Service  | 12345   |
#
