package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"steps", "listeners"},
        tags = "@regression",
        plugin = {"pretty", "summary"}
)
public class RegressionTestRunner extends AbstractTestNGCucumberTests {
}

