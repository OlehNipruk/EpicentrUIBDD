Feature: Epicentr Negative UI Scenarios
  @Negative
  Background:
    Given I am on the Epicentr home page

  Scenario: Search for a non-existing product
    When I search for product "Неіснуючий продукт"
    Then no product should be found
