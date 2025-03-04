package Hooks;

import Utilities.BrowserDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class Hook {

    @BeforeTest
    public void Setup()
    {
        System.out.println("Setup Successful");
    }

    @AfterTest
    public void CleanUp()
    {
        BrowserDriver.CloseBrowser();
        System.out.println("Clean Up Successful");
    }
}
