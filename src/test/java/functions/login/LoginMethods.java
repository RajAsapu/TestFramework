package functions.login;

import com.google.common.base.Verify;
import functions.GenericWeMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import setup.Constants;
import setup.DriverBean;

/**
 * Created by asapu on 7/6/2017.
 */
public class LoginMethods extends GenericWeMethods {
    private EventFiringWebDriver edriver;
    public LoginMethods()
    {
        edriver= DriverBean.getEdriver();
    }

    public void email(String email)
    {
        sendKeysToWE(Constants.login_email,email);
    }

    public void password(String password)
    {
        sendKeysToWE(Constants.login_password,password);
    }

    public void login()
    {
        clickOnWE(Constants.login_submit);
    }

    public void verifyLoggedIn()
    {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Verify.verify(edriver.getCurrentUrl().contains("account"),"User is not logged in");
    }

    public void navigateToLoginPage()
    {
        WebElement myAccount = edriver.findElement(By.xpath(Constants.myAccount));
        Actions actions=new Actions(edriver);
        actions.moveToElement(myAccount).click().perform();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actions.click(edriver.findElement(By.linkText("Login"))).perform();
    }
}
