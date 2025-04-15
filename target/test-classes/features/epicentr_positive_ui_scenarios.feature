@Positive
Feature: Epicentr Positive UI Scenarios

  Background:
    Given I am on the Epicentr home page

  @Positive
  Scenario: Open home page and verify title
    Then the page title should contain "Епіцентр"

  @Positive
  Scenario: Search for a notebook and verify URL
    When I search for product "Ноутбук"
    Then the current URL should contain "noutbuki"

  @Positive
  Scenario Outline: Add single product to cart and verify
    When I search for product "<productName>"
    And I add the product to the cart
    Then the product in the cart should be "<productName>"

    Examples:
      | productName                                                                 |
      | Ноутбук Lenovo ideapad Slim 5 16ABR8 16" (82XG009HRA) cloud grey           |

  @Positive
  Scenario: Add two products to cart and verify count
    When I search for product "Ноутбук Lenovo ideapad Slim 5 16ABR8 16\" (82XG009HRA) cloud grey"
    And I add the product to the cart
    And I go back to the home page
    And I search for product "Мишка Logitech Wireless Mouse M185 black/red (910-002240)"
    And I add the product to the cart
    Then the cart should contain 2 items
