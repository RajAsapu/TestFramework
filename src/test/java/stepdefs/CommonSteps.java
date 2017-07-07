package stepdefs;

import cucumber.api.java.en.Given;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import setup.AppProperties;
import setup.DriverBean;
import setup.OpenBrowser;
import setup.PageFactory;

import java.sql.Driver;

/**
 * Created by asapu on 7/6/2017.
 */
public class CommonSteps {
    private PageFactory pageFactory = null;
    private EventFiringWebDriver edriver;
    public CommonSteps()
    {
        edriver = DriverBean.getEdriver();
        pageFactory=new PageFactory();
    }
    @Given("^the application is opened$")
    public void the_application_is_opened()
    {
        new OpenBrowser().initBrowser(AppProperties.getProperty("browser"));
    }
}
