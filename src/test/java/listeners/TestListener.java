package listeners;
import driver.SingletonDriver;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import utils.ScreenshotUtil;

public class TestListener {

    private static final Logger logger = LogManager.getLogger(TestListener.class);

    @After
    public void afterScenario(Scenario scenario) {
        WebDriver driver = SingletonDriver.getDriver();


        if (scenario.isFailed() && driver != null) {

            String screenshotPath = ScreenshotUtil.takeScreenshot(driver, scenario.getName().replaceAll(" ", "_"));


            if (screenshotPath != null) {
                logger.error("Scenario failed: {}. Screenshot: {}", scenario.getName(), screenshotPath);
            }

            byte[] screenshotBytes = ScreenshotUtil.takeScreenshotAsBytes(driver);
            scenario.attach(screenshotBytes, "image/png", "Failure Screenshot");
        }
    }
}
