Feature: Product search and validation

  Background:
    Given I am on the home page

  @positive
  Scenario Outline: Verify product name after searching
    When I search for "<productName>"
    Then I should see product with name "<productName>"

    Examples:
      | productName                                                       |
      | Ноутбук Lenovo ideapad Slim 5 16ABR8 16\" (82XG009HRA) cloud grey |

  @negative
  Scenario: Verify non-existing product shows nothing
    When I search for "Неіснуючий продукт"
    Then I should not see any product
