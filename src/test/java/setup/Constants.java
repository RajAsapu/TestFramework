package setup;

/**
 * Created by asapu on 7/6/2017.
 */
public class Constants {
    /*
     * Login Page Identifiers
     */
    public static String login_email = "//input[@name='username']";
    public static String login_password = "//input[@name='password']";
    public static String login_submit = "//button[normalize-space()='Login']";
    public static String login_forgetPassword = "//*[contains(text(),'Forget Password')]";
    public static String myAccount = "//div[2]/div/div/div[2]/ul/li[2]/a";
    public static String login_rememberMe = "//*[@id=\"remember-me\"]";
    /*
     * Registration Page Identifiers
     */
    public static  String registration_firstName = "//input[@name='firstname']";
    public static String registration_lastName = "//input[@name='lastname']";
    public static String registration_mobileNumber = "//input[@placeholder='Mobile Number']";
    public static String registration_email = "//input[@placeholder='Email']";
    public static String registration_password = "//input[@placeholder='Password']";
    public static String registration_confirmPassword = "//input[@placeholder='Confirm Password']";
    public static String registration_signUp = "//button[@type=\"submit\"]";
    /*
     * Hotel page identifiers
     */
    public static String hotel_searchHotelName = ".//*[@id='s2id_autogen3']/a/span[2]";
    public static String hotel_searchInputField = ".//*[@id='select2-drop']/div/input";
    public static String hotel_checkIn = ".//*[@id='dpd1']/div/input";
    public static String hotel_checkout = ".//*[@id='dpd2']/div/input";
    public static String hotel_adults = ".//select[@id='adults']";
    public static String hotel_children = ".//*[@id='child']";
    public static String hotel_search = "//button[@type='submit']";
    public static String searchResults_hotelNames = ".//*[@id='ROOMS']/form[*]/div/div[2]/div[2]/h4/b";
    public static String searchResults_price = ".//*[@id='ROOMS']/form[*]/div/div[2]/div[2]/h4/span/span[1]/b";

}
