Feature: Shopping Cart Functionality

  Background:
    Given I am on the home page

  @regression
  Scenario Outline: Add a single product to the cart
    When I search for "<productName>"
    And I add the product to the cart
    Then I should see "<productName>" in the cart

    Examples:
      | productName                                                       |
      | Ноутбук Lenovo ideapad Slim 5 16ABR8 16\" (82XG009HRA) cloud grey |
      | Мишка Logitech Wireless Mouse M185 black/red (910-002240)         |

  @regression
  Scenario: Add two different products to the cart
    When I search for "Ноутбук Lenovo ideapad Slim 5 16ABR8 16\" (82XG009HRA) cloud grey"
    And I add the product to the cart
    And I go back to the home page
    And I search for "Мишка Logitech Wireless Mouse M185 black/red (910-002240)"
    And I add the product to the cart
    Then I should see 2 products in the cart
