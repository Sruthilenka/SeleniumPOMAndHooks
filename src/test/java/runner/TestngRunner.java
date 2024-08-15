package runner;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features = "src/test/resources/Login.feature",
        glue = {"steps"},
        plugin = {"pretty",
                "html:target/cucumber-reports",
        "rerun:target/failedrerun.txt" }

)
public class TestngRunner extends AbstractTestNGCucumberTests {
}
