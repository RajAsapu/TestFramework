package setup;

import org.openqa.selenium.support.events.EventFiringWebDriver;

/**
 * Created by asapu on 7/6/2017.
 */
public class DriverBean {
    public static EventFiringWebDriver getEdriver() {
        return edriver;
    }

    public static void setEdriver(EventFiringWebDriver edriver) {
        DriverBean.edriver = edriver;
    }

    public static EventFiringWebDriver edriver;


}
