import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features/mobileFeatures/",
        glue = {"utils.hooks", "steps.MobileSteps", "resources.features.mobileFeatures"},
        //tags = {"~@Ignore"},
        plugin = {"html:target/cucumber-reports/cucumber-pretty",
                "json:target/cucumber-reports/CucumberTestReport.json",
                "rerun:target/cucumber-reports/rerun.txt"
        })


public class MobileRunner extends AbstractTestNGCucumberTests {

}