package Page;

import Utilities.BrowserDriver;
import org.openqa.selenium.By;
import org.testng.Assert;

public class LogOut extends BrowserDriver {

    //Page Objects

    public static String WelcomeToggle = "//span[text()='Change']/..";
    public static String SignOut = "(//a[contains(text(),'Sign Out')])[1]";
    public static String HomePage = "//span[text()='Home Page']";
    //public static String  = "";

    //Page Methods
    public void LogOutFromSoftwareTestingBoard() throws InterruptedException {

        driver.findElement(By.xpath(WelcomeToggle)).click();
        driver.findElement(By.xpath(SignOut)).click();
        Thread.sleep(5000); // Since Sign out page redirects to homepage after 5 seconds
        Assert.assertTrue(driver.findElement(By.xpath(HomePage)).isDisplayed());
        System.out.println("Log out successful");
    }
}
