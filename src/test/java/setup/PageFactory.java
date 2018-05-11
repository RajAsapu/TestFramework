package setup;

import functions.hotel.HotelMethods;
import functions.login.LoginMethods;
import functions.registration.RegistrationMethods;

/**
 * Created by asapu on 7/6/2017.
 */
public class PageFactory {
    private LoginMethods loginMethods = null;
    private RegistrationMethods registrationMethods = null;
    private HotelMethods hotelMethods = null;

    public LoginMethods getLoginMethods()
    {
        loginMethods=new LoginMethods();
        return loginMethods;
    }

    public RegistrationMethods getRegistrationMethods()
    {
        registrationMethods = new RegistrationMethods();
        return registrationMethods;
    }

    public HotelMethods getHotelMethods()
    {
        hotelMethods = new HotelMethods();
        return hotelMethods;
    }
}
