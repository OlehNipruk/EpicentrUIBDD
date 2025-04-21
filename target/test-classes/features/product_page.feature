Feature: Product search and validation

  Background:
    Given I am on the home page

  @regression
  Scenario Outline: Verify product name after searching
    When I search for "<productName>"
    Then I should see product with name "<productName>"

    Examples:
      | productName                                                       |
      | Мишка Logitech Wireless Mouse M185 black/red (910-002240) |
