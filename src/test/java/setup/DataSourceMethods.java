package setup;

import cucumber.api.DataTable;
import org.junit.Assert;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.List;
import java.util.Map;

public class DataSourceMethods {
    public static void verifyCredentialsAreValid(DataTable table)
    {
        try {
            List<Map<String, String>> creds = table.asMaps(String.class, String.class);
            File dataSource = new File(AppProperties.getProperty("dataSource"));
            FileReader reader = new FileReader(dataSource);
            BufferedReader bufferedReader = new BufferedReader(reader);
            boolean flag = false;
            if(dataSource.length()>0) {
                for (Map<String, String> temp : creds) {
                    String credentials;
                    while((credentials=bufferedReader.readLine())!=null) {
                        String usercreds[]=credentials.split(",");
                        if (credentials.contains(temp.get("username")) && credentials.contains(temp.get("password"))) {
                            System.out.println("Credentials are valid");
                            flag = true;
                            break;
                        }
                    }
                }
            }
            if(!flag)
            {
                Assert.fail("Credentials are not valid");
            }
        }
        catch (Exception exp)
        {
            exp.printStackTrace();
        }
    }
}
