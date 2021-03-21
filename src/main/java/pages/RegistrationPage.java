package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPage extends BasePage{
    Faker faker = new Faker();
    private By registrationLink = By.linkText("Register");
    private By firstName = By.id("customer.firstName");
    private By lastName = By.id("customer.lasName");
    private By address = By.id("customer.address.street");
    private By city = By.id("customer.address.city");
    private By state = By.id("customer.address.state");
    private By zipcode = By.id("customer.address.zipcode");
    private By phoneNumber = By.id("customer.phoneNumber");
    private By ssn = By.id("customer.ssn");
    private By userName = By.id("customer.username");
    private By password = By.id("customer.password");
    private By confirmPassword = By.id("repeatedPassword");
    private By registerButton = By.xpath("//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input");
    private By welcomeText = By.className("title");

    //WebElement elementBy;
    String userNameValue, passwordValue;

    public RegistrationPage(WebDriver driver) {
        super(driver);
    }
    public WebElement getRegistrationLink() {
        return getElementBy(registrationLink);
    }
    public WebElement getRegisterButton() {
        return getElementBy(registerButton);
    }
    public WebElement getFirstName() {
        return getElementBy(firstName);
    }
    public WebElement getLastName() {
        return getElementBy(lastName);
    }
    public WebElement getAddress() {
        return getElementBy(address);
    }
    public WebElement getCity() {
        return getElementBy(city);
    }
    public WebElement getState() {
        return getElementBy(state);
    }
    public WebElement getZipCode() {
        return getElementBy(zipcode);
    }
    public WebElement getPhoneNumber() {
        return getElementBy(phoneNumber);
    }
    public WebElement getSSN() {
        return getElementBy(ssn);
    }
    public WebElement getUserName() {
        return getElementBy(userName);
    }
    public WebElement getPassword() {
        return getElementBy(password);
    }
    public WebElement getConfirmPassword() {
        return getElementBy(confirmPassword);
    }
    private WebElement getWelcomeText() {
        return getElementBy(welcomeText);
    }

    public void doClickOnRegisterLink(){
        getRegistrationLink().click();

    }
    public void doClickOnRegisterButton(){
        getRegisterButton().click();

    }
    public void checkIfSignUpPageLoaded(){
        getRegisterButton();
    }
    public void doFillUpRegistrationInfo(){
        getFirstName().sendKeys(faker.name().firstName());
        getLastName().sendKeys(faker.name().lastName());
        getAddress().sendKeys(faker.address().fullAddress());
        getCity().sendKeys(faker.address().city());
        getState().sendKeys(faker.address().state());
        getZipCode().sendKeys(faker.address().zipCode());
        getPhoneNumber().sendKeys(faker.phoneNumber().phoneNumber());
        getSSN().sendKeys(faker.idNumber().ssnValid());
        userNameValue = faker.superhero().name();
        getUserName().sendKeys(userNameValue);
        getPassword().sendKeys(passwordValue);
        getConfirmPassword().sendKeys(passwordValue);

    }
    public WebElement checkWelcomeText(){
        return getWelcomeText();

    }



}
