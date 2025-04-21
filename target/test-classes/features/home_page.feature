Feature: Home Page functionality

  Background:
    Given the user is on the home page

  @regression
    @smoke
  Scenario: Check page title
    Then the page title should contain "Епіцентр"

  @regression
    @smoke
  Scenario: Search for a notebook
    When the user searches for "Ноутбук"
    Then the URL should contain "noutbuki"
