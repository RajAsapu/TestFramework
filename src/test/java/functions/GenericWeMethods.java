package functions;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import setup.DriverBean;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;

/**
 * Created by asapu on 7/6/2017.
 */
public class GenericWeMethods {
    private EventFiringWebDriver edriver;

    public GenericWeMethods()
    {
        edriver = DriverBean.getEdriver();
    }
    /*
     * Method to send text to the input field
     */
    public void sendKeysToWE(String identifier,String value)
    {
        WebElement element= edriver.findElement(By.xpath(identifier));
        element.sendKeys(value);
    }
    /*
     * Method to click on button
     */
    public void clickOnWE(String identifier)
    {
        WebElement element= edriver.findElement(By.xpath(identifier));
        Actions actions=new Actions(edriver);
        actions.click(element).perform();
    }
    /*
     * Method to take screenshot
     */
    public void takeScreenShot(String name)
    {
        try{
        File screenShot = ((TakesScreenshot) edriver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenShot,new File("screenshot/"+name+ LocalDate.now()+".jpg"));}
        catch (IOException exp)
        {
            exp.printStackTrace();
        }
    }
}
