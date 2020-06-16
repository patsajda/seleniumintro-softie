package page.objects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterPage extends BasePage{
    @FindBy(id = "customer_firstname")
    private WebElement customerFirstNameField;

    @FindBy(id = "customer_lastname")
    private WebElement customerLastNameField;

    @FindBy(id = "passwd")
    private WebElement passwordField;

    @FindBy(id = "firstname")
    private WebElement firstNameField;

    @FindBy(id = "lastname")
    private WebElement lastNameField;

    @FindBy(id = "address1")
    private WebElement addressField;

    @FindBy(id = "city")
    private WebElement cityField;

    @FindBy(id = "id_state")
    private WebElement stateField;

    @FindBy(id = "postcode")
    private WebElement postcodeField;

    @FindBy(id = "phone_mobile")
    private WebElement phoneNumberField;

    public RegisterPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
//        this.createEmail = createEmail;
    }

    public void register(String customerFirstName, String customerLastName, String passwd, String firstName,
                         String lastName, String address, String city, String postcode, String phoneNumber, String state) {
        customerFirstNameField.sendKeys(customerFirstName);
        customerLastNameField.sendKeys(customerLastName);
        passwordField.sendKeys(passwd);
        firstNameField.sendKeys(firstName);
        lastNameField.sendKeys(lastName);
        addressField.sendKeys(address);
        cityField.sendKeys(city);
        postcodeField.sendKeys(postcode);
        phoneNumberField.sendKeys(phoneNumber);

        Select stateSelect = new Select(stateField);
        stateSelect.selectByVisibleText(state);

        phoneNumberField.sendKeys(Keys.ENTER);

    }


}
