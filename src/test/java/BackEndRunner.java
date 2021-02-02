import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = "src/test/resources/Features/backEndFeatures/",
        glue = {"utils.hooks", "APISteps","LoginApiTest", "Login.feature"},
        //tags = {"~@Ignore"},
        plugin = {"html:target/cucumber-reports/cucumber-pretty",
                "json:target/cucumber-reports/CucumberTestReport.json",
                "rerun:target/cucumber-reports/rerun.txt"
        })

public class BackEndRunner extends AbstractTestNGCucumberTests {
}

