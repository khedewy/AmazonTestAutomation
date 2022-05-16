package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class Testbase {

    public WebDriver driver;

    @BeforeTest
    @Parameters({"browser"})
    public void setDriver(@Optional("chrome") String brwosername){

        if (brwosername.equalsIgnoreCase("firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
            driver.navigate().to("https://www.amazon.com/ref=nav_logo");
        }
        else if (brwosername.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.navigate().to("https://www.amazon.com/ref=nav_logo");
        }
    }
    @AfterTest
    public void closedriver(){
        driver.close();
    }
}



