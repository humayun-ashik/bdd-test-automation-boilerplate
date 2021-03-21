package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import io.github.bonigarcia.wdm.WebDriverManager;

import pages.BasePage;
import pages.Pages;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    public WebDriver driver;
    public Pages page;

    private String url = "https://parabank.parasoft.com/parabank/index.htm";

    public BaseTest(String url) {
        this.url = url;
    }

    @BeforeClass
    @Parameters(value = {"browser"})
    public void setupTest(String browser) {
        if (browser.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browser.equals("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else {
            System.out.println("No Browser is Defined in xml");
        }


//		driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
//
//
        // Default value 0 Seconds implicit timeout
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


        // Default value 300 Seconds pageload timeout
        driver.manage().timeouts().pageLoadTimeout(300, TimeUnit.SECONDS);


        driver.get(this.url);


//		try {
//			Thread.sleep(6000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}


        System.out.println("URL: " + this.url);

        page = new BasePage(driver);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
