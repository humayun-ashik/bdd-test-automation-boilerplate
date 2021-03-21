package bindings;


import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.LoginPage;

public class LoginStep{
    private WebDriver driver;
    LoginPage objLoginPage;

    @Given("^I am in the login page of the Para Bank Application$")
    public void i_am_in_the_login_page_of_the_Para_Bank_Application() {
        System.setProperty("webdriver.chrome.driver", "D:\\45h1k\\MyGitHub\\bdd-test-automation-boilerplate\\src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/index.htm");

    }

    @When("^I enter valid credentials$")
    public void i_enter_valid_credentials() {
        objLoginPage = new LoginPage(driver);
        objLoginPage.doLogin();
    }

    @Then("^I should be taken to the Overview page$")
    public void i_should_be_taken_to_the_Overview_page() throws Exception {
        WebDriverWait wait = new WebDriverWait(driver, 50);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='rightPanel']/div/div/h1")));

        driver.findElement(By.xpath("//*[@id='rightPanel']/div/div/h1")).isDisplayed();
        driver.findElement(By.linkText("Log Out")).click();

        driver.quit();
    }
}

