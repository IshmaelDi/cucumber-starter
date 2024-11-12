package TMSRunner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/Features/TMStest.feature",
        glue = "TMSstepsDefinitions",
        monochrome = false,

        plugin = {"pretty", "html:target/Cucumber-report"}
//        dryRun = false,



)
public class runneruitests {
}
