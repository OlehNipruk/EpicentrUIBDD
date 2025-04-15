package steps;

import io.cucumber.java.en.*;
import org.testng.Assert;

public class CartPageSteps extends AbstractStepDef {

    @Given("I am on the home page")
    public void i_am_on_the_home_page() {
    }

    @When("I search for {string}")
    public void i_search_for_product(String productName) {
        homePage.searchForProduct(productName);
    }

    @And("I add the product to the cart")
    public void i_add_product_to_cart() {
        productPage.addProductToCart();
    }

    @And("I go back to the home page")
    public void i_go_back_to_home_page() {
        driver.navigate().back();
    }

    @Then("I should see {string} in the cart")
    public void i_should_see_product_in_cart(String expectedProductName) {
        String actual = cartPage.getProductNameInCart();
        Assert.assertEquals(actual, expectedProductName, "Product name mismatch in cart");
    }

    @Then("I should see {int} products in the cart")
    public void i_should_see_number_of_products_in_cart(int expectedCount) {
        int actualCount = cartPage.getCartItemCount();
        Assert.assertEquals(actualCount, expectedCount, "Incorrect number of products in the cart");
    }
}
