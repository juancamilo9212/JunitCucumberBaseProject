package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/Features"},
        glue = {"StepDefinitions"},
        plugin = {"pretty","json:target/json-report/cucumber.json"},
        dryRun = false,
        monochrome = true,
        tags = "@Ignore"
        //name = {"Search Link"}
)
public class TestRun {
}
