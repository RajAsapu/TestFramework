package functions;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.Select;
import setup.DriverBean;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

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
    /*
     * Method to get web element at a position
     */
    public WebElement getWeAtPosition(String identifier,int position)
    {
        List<WebElement> webElementList = edriver.findElements(By.xpath(identifier));
        if(position!=-1)
            return webElementList.size()>=0?webElementList.get(position):null;
        else
            return webElementList.size()>=0?webElementList.get(webElementList.size()-1):null;
    }
    /*
     * Method to set the date with timestamp
     */
    public void setDate(String identifier,String day)
    {
        String date = null;
        SimpleDateFormat formatter = null;
        day= day.toLowerCase();
        formatter = new SimpleDateFormat("dd-mm-yyyy");
        Date timestamp = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(timestamp);

        if(day.contains("tomorrow")){
            calendar.add(Calendar.DATE,1);
        }else if(day.contains("yesterday")){
            calendar.add(Calendar.DATE,-1);
        }
        date=formatter.format(calendar.getTime());

        getWeAtPosition(identifier,0).sendKeys(date);
        clickOnTab();
    }
    /*
     * click on tab
     */
    public void clickOnTab()
    {
        Actions actions=new Actions(edriver);
        actions.sendKeys(Keys.TAB).perform();
    }
    /*
     * Select from drop down
     */
    public void selectFromDropDown(String identifier,String choose)
    {
        Select select = new Select(getWeAtPosition(identifier,0));
        select.selectByVisibleText(choose);
    }
}
