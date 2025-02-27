package Hooks;

import Utilities.BrowserDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;


public class Hook {

    @Before
    public void Setup()
    {
        System.out.println("Setup Successful");
    }

    @After
    public void CleanUp()
    {
        BrowserDriver.CloseBrowser();
        System.out.println("Clean Up Successful");
    }
}
