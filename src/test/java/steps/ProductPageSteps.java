package steps;

import io.cucumber.java.en.*;
import org.testng.Assert;

public class ProductPageSteps extends AbstractStepDef {

    @Then("^I should see product with name \"([^\"]*)\"$")
    public void i_should_see_product_with_name(String expectedName) {
        String actual = productPage.getProductName();
        Assert.assertEquals(actual, expectedName, "Product name mismatch");
    }

    @Then("I should not see any product")
    public void i_should_not_see_any_product() {
        String name = productPage.getProductName();
        Assert.assertTrue(name.isEmpty(), "Expected no product, but found one");
    }
}
