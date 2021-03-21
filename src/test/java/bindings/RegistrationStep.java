package bindings;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.RegistrationPage;

public abstract class RegistrationStep {
    private WebDriver driver;
    RegistrationPage objRegistrationPage;


    @Given("I am in the home page of the Para Bank Application")
    public void i_am_in_the_home_page_of_the_Para_Bank_Application() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.setProperty("webdriver.chrome.driver", "D:\\45h1k\\MyGitHub\\bdd-test-automation-boilerplate\\src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
        throw new PendingException();
    }

    @When("I click Register link")
    public void i_click_Register_link() throws Throwable {
        objRegistrationPage.doClickOnRegisterLink();
        // Write code here that turns the phrase above into concrete actions

        throw new PendingException();
    }

    @Then("I should be taken to the SignUP page")
    public void i_should_be_taken_to_the_SignUP_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        objRegistrationPage.checkIfSignUpPageLoaded();
        throw new PendingException();
    }

    @When("I fill up registration info")
    public void i_fill_up_registration_info() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        objRegistrationPage.doFillUpRegistrationInfo();
        throw new PendingException();
    }

    @When("I click on Register button")
    public void i_click_on_Register_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        objRegistrationPage.doClickOnRegisterButton();
        throw new PendingException();
    }

    @Then("Registration will be successful")
    public void registration_will_be_successful() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        objRegistrationPage.checkWelcomeText().isDisplayed();
        throw new PendingException();
    }
}
