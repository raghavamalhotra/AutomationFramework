package Utilities;

import org.openqa.selenium.WebDriver;

public class BrowserDriver {

    public static WebDriver driver;

    public static void CloseBrowser()
    {
        driver.quit();
        System.out.println("Browser Closed");
    }
}
