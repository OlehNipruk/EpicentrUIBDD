package steps;

import io.cucumber.java.en.*;
import org.testng.Assert;

public class ProductPageSteps extends AbstractStepDef {

    @Then("^I should see product with name \"([^\"]*)\"$")
    public void i_should_see_product_with_name(String expectedName) {
        String actual = productPage.getProductName();
        Assert.assertEquals(actual, expectedName, "Product name mismatch");
    }
}
