package Page;

import TestData.AccountDetails;
import Utilities.BrowserDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class SignIn extends BrowserDriver {

    //Page Objects

    public static String SignInTabLink = "//a[contains(text(),'Sign In')]";
    public static String Email = "//input[@id='email']";
    public static String Password = "//input[@id='pass']";
    public static String SignInButton = "//button[@id='send2']";
    public static String Welcome = "//span[contains(text(),'Welcome')]";
    //public static String  = "";


    //Page Methods
    public void SignInToSoftwareTestingBoard(AccountDetails testData)
    {
        driver.findElement(By.xpath(SignInTabLink)).click();
        driver.findElement(By.xpath(Email)).sendKeys(testData.Email);
        driver.findElement(By.xpath(Password)).sendKeys(testData.Password);
        driver.findElement(By.xpath(SignInButton)).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Welcome)));
        Assert.assertTrue(driver.findElement(By.xpath(Welcome)).isDisplayed());
        System.out.println("Sign In was successful");
    }
}
