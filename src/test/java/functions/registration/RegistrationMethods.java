package functions.registration;

import com.google.common.base.Verify;
import cucumber.api.DataTable;
import functions.GenericWeMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import setup.Constants;
import setup.DriverBean;

import java.util.List;
import java.util.Map;

/**
 * Created by asapu on 7/6/2017.
 */
public class RegistrationMethods extends GenericWeMethods{
    private EventFiringWebDriver edriver;
    public RegistrationMethods()
    {
        edriver= DriverBean.getEdriver();
    }

    public void setFirstName(String firstName)
    {
        sendKeysToWE(Constants.registration_firstName,firstName);
    }

    public void setLastName(String lastName)
    {
        sendKeysToWE(Constants.registration_lastName,lastName);
    }

    public void setMobileNumber(String mobileNumber)
    {
        sendKeysToWE(Constants.registration_mobileNumber,mobileNumber);
    }

    public void setEmail(String email)
    {
        sendKeysToWE(Constants.registration_email,email);
    }

    public void setPassword(String password)
    {
        sendKeysToWE(Constants.registration_password,password);
    }

    public void confirmPassword(String confirmPassword)
    {
        sendKeysToWE(Constants.registration_confirmPassword,confirmPassword);
    }

    public void signup()
    {
        clickOnWE(Constants.registration_signUp);
    }

    public void navigateToRegistrationPage()
    {
        WebElement myAccount = edriver.findElement(By.xpath(Constants.myAccount));
        Actions actions=new Actions(edriver);
        actions.moveToElement(myAccount).click().perform();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actions.click(edriver.findElement(By.linkText("Sign Up"))).perform();
    }

    public void registerUser(DataTable table)
    {
        List<Map<String,String>> list = table.asMaps(String.class,String.class);
        for(Map<String,String> row:list)
        {
            setFirstName(row.get("firstname"));
            setLastName(row.get("lastname"));
            setMobileNumber(row.get("mobilenumber"));
            setEmail(row.get("email"));
            setPassword(row.get("password"));
            confirmPassword(row.get("confirmpassword"));
        }
    }

    public void verifyIfUserIsRegistered()
    {
        Verify.verify(edriver.getCurrentUrl().contains("account"),"User is not registered");
    }
}
