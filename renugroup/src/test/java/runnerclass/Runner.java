package runnerclass;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/resources/Features/sample.feature",
glue = {"stepdef"},dryRun = false,monochrome = true, tags="@All")
public class Runner {

}
