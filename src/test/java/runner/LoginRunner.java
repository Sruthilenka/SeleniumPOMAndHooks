package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/Login.feature",
        glue = {"steps"},
        plugin = {"pretty", "html:target/cucumber-reports"},
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class LoginRunner {
}
