package tests;

import com.cbt.utilities.StringUtility;
import com.cbt.utilities.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationTests {
    public static void main(String[] args) {
        //test case 1
    WebDriver driver = BrowserFactory.getDriver("Chrome");

        driver.get("https://google.co.uk");
        String title1 = driver.getTitle();
        driver.get("https://etsy.com");
        String title2 = driver.getTitle();

        driver.navigate().back();
        StringUtility.verifyEquals(title1, driver.getTitle());

        driver.navigate().forward();
        StringUtility.verifyEquals(title2, driver.getTitle());

        driver.quit();

        //test case 2
        driver = BrowserFactory.getDriver("edge");

        driver.get("https://google.co.uk");
        title1 = driver.getTitle();
        driver.get("https://etsy.com");
        title2 = driver.getTitle();

        driver.navigate().back();
        StringUtility.verifyEquals(title1, driver.getTitle());

        driver.navigate().forward();
        StringUtility.verifyEquals(title2, driver.getTitle());

        driver.quit();




    }
}
