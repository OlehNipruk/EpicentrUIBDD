package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"steps", "listeners"},
        tags = "@smoke",
        plugin = {"pretty", "summary"}
)
public class SmokeTestRunner extends AbstractTestNGCucumberTests {
}
