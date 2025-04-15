package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"steps", "listeners"},
        tags = "@positive",
        plugin = {"pretty", "summary"}
)
public class PositiveTestRunner extends AbstractTestNGCucumberTests {
}

