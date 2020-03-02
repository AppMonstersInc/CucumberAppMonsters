package runners;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-reports", "json:target/parallel-cucumber1.json",},
        features = "src/test/resources/features",
        glue = "step_definitions",
        tags = "@SmokeManager"
)
public class ManageParallelRunner {
}

