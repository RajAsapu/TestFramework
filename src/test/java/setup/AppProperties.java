package setup;

import java.util.Enumeration;
import java.util.ResourceBundle;

/**
 * Created by asapu on 7/6/2017.
 */
public class AppProperties {
    public static String getProperty(String name)
    {
        ResourceBundle resourceBundle= ResourceBundle.getBundle("application");
        return resourceBundle.getString(name);
    }
}
