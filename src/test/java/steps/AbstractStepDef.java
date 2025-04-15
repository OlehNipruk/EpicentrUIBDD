package steps;

import driver.SingletonDriver;
import org.openqa.selenium.WebDriver;
import pages.CartPage;
import pages.HomePage;
import pages.ProductPage;

public abstract class AbstractStepDef {
    protected final WebDriver driver;
    protected final HomePage homePage;
    protected final ProductPage productPage;
    protected final CartPage cartPage;

    public AbstractStepDef() {
        this.driver = SingletonDriver.getDriver();
        this.homePage = new HomePage(driver);
        this.productPage = new ProductPage(driver);
        this.cartPage = new CartPage(driver);
    }
}
