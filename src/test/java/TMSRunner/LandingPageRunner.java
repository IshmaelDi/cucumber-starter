package TMSRunner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/TMSLogin.feature",
        glue = "stepsDefinition",
        monochrome = true,

        plugin = { "pretty", "json:target/CucumberTestReport.json"  }




)

public class LandingPageRunner {
}
