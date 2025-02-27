package Page;

import Utilities.BrowserDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateToUrl extends BrowserDriver {

    public void NavigateToSoftwareTestingBoard()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("https://magento.softwaretestingboard.com/");
        //driver.navigate().to("https://magento.softwaretestingboard.com/"); //Alternate method to Hit URL
        driver.manage().window().maximize();
        System.out.println("Navigation successful");
    }
}
