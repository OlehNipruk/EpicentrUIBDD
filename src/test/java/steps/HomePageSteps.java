package steps;

import io.cucumber.java.en.*;
import org.testng.Assert;

public class HomePageSteps extends AbstractStepDef {

    @Given("the user is on the home page")
    public void theUserIsOnTheHomePage() {
    }

    @Then("^the page title should contain \"([^\"]*)\"$")
    public void thePageTitleShouldContain(String expectedTitle) {
        Assert.assertTrue(driver.getTitle().contains(expectedTitle), "Page title mismatch!");
    }



    @When("the user searches for {string}")
    public void theUserSearchesFor(String query) {
        homePage.searchForProduct(query);
    }

    @Then("the URL should contain {string}")
    public void theURLShouldContain(String expectedSubstring) {
        Assert.assertTrue(driver.getCurrentUrl().contains(expectedSubstring), "URL does not contain expected text!");
    }
}
