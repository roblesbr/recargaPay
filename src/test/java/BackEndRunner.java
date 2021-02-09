import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = "src/test/resources/features/backEndFeatures/",
        glue = {"util.hooks", "steps.APISteps","resources.Features.backEndFeatures"},
        //tags = {"~@Ignore"},
        plugin = {"html:target/cucumber-reports/cucumber-pretty",
                "json:target/cucumber-reports/CucumberTestReport.json",
                "rerun:target/cucumber-reports/rerun.txt"
        })

public class BackEndRunner extends AbstractTestNGCucumberTests {
}

