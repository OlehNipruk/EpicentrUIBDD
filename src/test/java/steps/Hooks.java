package steps;

import driver.SingletonDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import utils.ConfigReader;

import java.time.Duration;

public class Hooks {
    private WebDriver driver;

    @Before
    public void setUp() {
        driver = SingletonDriver.getDriver();
        int wait = ConfigReader.getIntProperty("implicitWait");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(wait));
        driver.get(ConfigReader.getProperty("baseUrl"));
    }

    @After
    public void tearDown() {
        SingletonDriver.closeDriver();
    }
}
