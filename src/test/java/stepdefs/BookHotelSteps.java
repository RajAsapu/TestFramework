package stepdefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import setup.PageFactory;

/**
 * Created by asapu on 7/7/2017.
 */
public class BookHotelSteps {

    private PageFactory pageFactory = null;
    public BookHotelSteps()
    {
        pageFactory=new PageFactory();
    }

    @Given("^the user sets the location as \"([^\"]*)\"$")
    public void the_user_sets_the_location_as(String location)  {
       pageFactory.getHotelMethods().selectLocation(location);
       
    }

    @When("^the user sets the checkin date as \"([^\"]*)\"$")
    public void the_user_sets_the_checkin_date_as(String arg1)  {
      pageFactory.getHotelMethods().checkIn(arg1);
    }

    @When("^the user sets the checkout date as \"([^\"]*)\"$")
    public void the_user_sets_the_checkout_date_as(String arg1)  {
        pageFactory.getHotelMethods().checkOut(arg1);
    }

    @When("^the adult count as \"([^\"]*)\"$")
    public void the_adult_count_as(String arg1)  {
       pageFactory.getHotelMethods().selectAdults(arg1);
    }

    @When("^the children count as \"([^\"]*)\"$")
    public void the_children_count_as(String arg1)  {
       pageFactory.getHotelMethods().selectChildren(arg1);
    }

    @When("^clicks on search$")
    public void clicks_on_search()  {
       pageFactory.getHotelMethods().search();
    }

    @Then("^the hotel details with the prices should be displayed$")
    public void the_hotel_details_with_the_prices_should_be_displayed()  {
        pageFactory.getHotelMethods().displayHotelNamesAndPrices();
    }

}
