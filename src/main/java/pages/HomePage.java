package pages;

import driver.LoggingWebElementDecorator;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.LogUtil;

public class HomePage extends BasePage {
    private By searchInput = By.cssSelector("input[placeholder='Пошук']");
    private By searchButton = By.xpath("//button[@aria-label='Пошук']");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    private static final Logger logger = LogUtil.getLogger(HomePage.class);

    public void searchForProduct(String productName) {
        logger.info("Searching for product: {}", productName);
        LoggingWebElementDecorator searchInputElement = new LoggingWebElementDecorator(driver.findElement(searchInput));
        LoggingWebElementDecorator searchButtonElement = new LoggingWebElementDecorator(driver.findElement(searchButton));
        searchInputElement.sendKeys("  ");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        searchInputElement.clear();
        searchInputElement.sendKeys(productName);

        searchButtonElement.click();
        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
