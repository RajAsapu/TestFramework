package stepdefs;

import com.google.common.base.Verify;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import setup.DataSourceMethods;
import setup.PageFactory;

/**
 * Created by asapu on 7/6/2017.
 */
public class LoginPageSteps {
    private PageFactory pageFactory = null;
    public LoginPageSteps()
    {
        pageFactory=new PageFactory();
    }

    @Given("^the user is registered$")
    public void the_user_is_registered(DataTable table) {
        // Verify in data source if the credentials are present
        DataSourceMethods.verifyCredentialsAreValid(table);
    }

    @When("^the user navigates to the login page$")
    public void the_user_navigates_to_the_login_page()  {
        pageFactory.getLoginMethods().navigateToLoginPage();
    }

    @When("^enters the \"([^\"]*)\" and \"([^\"]*)\"$")
    public void enters_the_and(String arg1, String arg2)  {
        pageFactory.getLoginMethods().email(arg1);
        pageFactory.getLoginMethods().password(arg2);
    }

    @And("^checks remember me$")
    public void checks_remember_me()
    {
        pageFactory.getLoginMethods().rememberMe(true);
    }
    @When("^clicks on login$")
    public void clicks_on_login()  {
        pageFactory.getLoginMethods().login();
    }

    @Then("^the user should be able to login$")
    public void the_user_should_be_able_to_login()  {
       pageFactory.getLoginMethods().verifyLoggedIn();
    }

}
