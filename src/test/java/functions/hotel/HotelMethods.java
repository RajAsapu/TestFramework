package functions.hotel;

import functions.GenericWeMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import setup.Constants;
import setup.DriverBean;

import java.util.List;

/**
 * Created by asapu on 7/7/2017.
 */
public class HotelMethods extends GenericWeMethods{

    private EventFiringWebDriver edriver;
    public HotelMethods()
    {
        edriver= DriverBean.getEdriver();
    }

    public void selectLocation(String location)
    {
        clickOnWE(Constants.hotel_searchHotelName);
        sendKeysToWE(Constants.hotel_searchInputField,location);
        getWeAtPosition(".//*[@id='select2-drop']/ul/li[1]/ul/li/div[normalize-space()='"+location+"']",-1).click();
    }

    public void checkIn(String date)
    {
        setDate(Constants.hotel_checkIn,date);
    }

    public void checkOut(String date)
    {
        setDate(Constants.hotel_checkout,date);
    }

    public void selectAdults(String choose)
    {
        selectFromDropDown(Constants.hotel_adults,choose);
    }

    public void selectChildren(String children)
    {
        selectFromDropDown(Constants.hotel_children,children);
    }

    public void search()
    {
        clickOnWE(Constants.hotel_search);
    }

    public void displayHotelNamesAndPrices()
    {
        List<WebElement> hotelNameList = edriver.findElements(By.xpath(Constants.searchResults_hotelNames));
        List<WebElement> priceList = edriver.findElements(By.xpath(Constants.searchResults_price));

        for(int i=0;i<hotelNameList.size() && i<priceList.size();i++)
        {
            System.out.println(hotelNameList.get(i).getText()+"-"+priceList.get(i).getText());
        }
    }
}
