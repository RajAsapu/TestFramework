package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by asapu on 7/7/2017.
 */
@RunWith(Cucumber.class)
@CucumberOptions(plugin = "html:reports/testreport",
                 features = "src/test/resources/features",
                 glue="classpath:",
                 tags="@BookHotel,@Login,@Registration")
public class TestRunner {
}
