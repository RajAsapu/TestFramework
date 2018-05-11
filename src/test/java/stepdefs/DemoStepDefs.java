package stepdefs;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DemoStepDefs {
    static WebDriver driver;
    private static final String URL = "http://www.gmail.com";
    private Actions actions;
    @Given("^the user has lauched the gmail login page$")
    public void the_user_has_lauched_the_gmail_login_page()  {
        switch (System.getenv("BROWSER").toLowerCase()){
            case "chrome":  ChromeDriverManager.getInstance().setup();
                driver = new ChromeDriver();
                break;
            case "firefox":     FirefoxDriverManager.getInstance().setup();
                driver = new FirefoxDriver();
                break;
            default: System.out.println("Doesn't match any browser available");
        }
        driver.navigate().to(URL);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        actions=new Actions(driver);
    }

    @When("^the user enters login details$")
    public void the_user_enters_login_details(List<LoginCreds> creds)  {
        driver.findElement(By.name("identifier")).sendKeys(creds.get(0).getUsername());
        actions.click(driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div[2]"))).perform();
        driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys(creds.get(0).getPassword());
    }

    @And("^the user clicks on login$")
    public void the_user_clicks_on_login()  {
        actions.click(driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/content/span"))).perform();
    }

    @Then("^the user shall be able to view the gmail home page$")
    public void the_user_shall_be_able_to_view_the_gmail_home_page()  {
        String error = driver.findElement(By.xpath("//*[@id=\"password\"]/div[2]/div[2]")).getText();
        Assert.assertTrue("Error message doesn't match",error.equals("Wrong password. Try again or click Forgot password to reset it."));
        driver.close();
    }

}
