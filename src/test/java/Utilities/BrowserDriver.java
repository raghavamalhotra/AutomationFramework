package Utilities;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

public class BrowserDriver {

    public static WebDriver driver;

    public static void CloseBrowser()
    {
        driver.quit();
        System.out.println("Browser Closed");
    }
}
