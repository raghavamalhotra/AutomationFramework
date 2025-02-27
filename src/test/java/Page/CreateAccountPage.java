package Page;

import TestData.AccountDetails;
import Utilities.BrowserDriver;
import org.junit.Assert;
import org.openqa.selenium.By;

public class CreateAccountPage extends BrowserDriver {

    //Page Objects

    public static String CreateAnAccount = "(//a[text()='Create an Account'])[1]";
    public static String Firstname = "//input[@id='firstname']";
    public static String Lastname = "//input[@id='lastname']";
    public static String Email = "//input[@id='email_address']";
    public static String Password = "//input[@id='password']";
    public static String ConfirmPassword = "//input[@id='password-confirmation']";
    public static String SubmitCreateAccount = "//button[@title='Create an Account']";
    public static String RegistrationSuccessful = "//div[text()='Thank you for registering with Main Website Store.']";
    //public static String  = "";


    //Page Methods
    public void CreateAccount(AccountDetails testData) {

        driver.findElement(By.xpath(CreateAnAccount)).click();
        driver.findElement(By.xpath(Firstname)).sendKeys(testData.Firstname);
        driver.findElement(By.xpath(Lastname)).sendKeys(testData.Lastname);
        driver.findElement(By.xpath(Email)).sendKeys(testData.Email);
        driver.findElement(By.xpath(Password)).sendKeys(testData.Password);
        driver.findElement(By.xpath(ConfirmPassword)).sendKeys(testData.Password);
        driver.findElement(By.xpath(SubmitCreateAccount)).click();
        Assert.assertTrue(driver.findElement(By.xpath(RegistrationSuccessful)).isDisplayed());
        System.out.println("Account Created");
    }
}
