package setup;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by asapu on 7/6/2017.
 */
public class OpenBrowser {
    public void initBrowser(String browser)
    {
        WebDriver driver = null ;

        switch (browser.toLowerCase())
        {
            case "chrome":
//                System.setProperty("chrome.webdriver.driver","C://")
                ChromeDriverManager.getInstance().setup();
                ChromeOptions options=new ChromeOptions();
                options.addArguments("--incognito");
                options.addArguments("--start-maximized");
                driver = new ChromeDriver(options);
                break;
            default:
                System.out.println("Browser:"+browser+" is not configured");
                break;
        }
        IEventInterface iEventInterface = new IEventInterface();
        EventFiringWebDriver edriver = new EventFiringWebDriver(driver);
        edriver.register(iEventInterface);

        DriverBean.setEdriver(edriver);
        edriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        edriver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
        edriver.get(AppProperties.getProperty("url"));
    }
}
