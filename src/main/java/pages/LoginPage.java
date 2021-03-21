package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class LoginPage extends BasePage{
    private By username = By.name("username");
    private By password = By.name("password");
    private By loginbtn = By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input");

    WebElement elementBy;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    /**
     * @return the username
     */
    public WebElement getUserName() {
        return getElementBy(username);
    }


    /**
     * @return the password
     */
    public WebElement getPassword() {
        return getElementBy(password);
    }




    /**
     * @return the loginbtn
     */
    public WebElement getLoginbtn() {
        return getElementBy(loginbtn);
    }



    public String getLoginPageTitle() {
        return getPageTitle();

    }


    public BasePage doLogin(String username, String password) {
        System.out.println("Logging you in ...\n\n");
        getUserName().sendKeys(username);
        getPassword().sendKeys(password);
        getLoginbtn().click();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        // Return next landing page class object
        return getInstance(BasePage.class);
    }

    /**
     * Method Overloading
     * @return
     */
    public void doLogin() {
        getUserName().sendKeys("ashik");
        getPassword().sendKeys("1234");
        getLoginbtn().click();

    }

    // username: admin@laototo.pp.com
    public void doLogin(String userCred) {
        if(userCred.contains("username")) {
            getUserName().sendKeys(userCred.split(":")[1].trim());
        }
        else if(userCred.contains("password")) {
            getPassword().sendKeys(userCred.split(":")[1].trim());
        }

    }

//    public void doLogout() {
//        System.out.println("\nLogging you out ...\n");
//        getLogoutWrapperBtn().click();
//        getLogoutBtn().click();
//        //getLoginWrappertBtn().click();
//    }

}
