package setup;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import functions.GenericWeMethods;

/**
 * Created by asapu on 7/6/2017.
 */
public class Hooks {
    @After
    public void tearDown(Scenario scenario)
    {
        new GenericWeMethods().takeScreenShot(scenario.getName());
        DriverBean.getEdriver().close();
    }
    /*
      @Before
      public void init()
      {
      }
      @Test - > Runs Test
      @After
      public void
     */
}
