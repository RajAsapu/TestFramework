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

}
