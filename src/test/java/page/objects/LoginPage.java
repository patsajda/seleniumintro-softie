package page.objects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {
    @FindBy(id = "email")
    protected WebElement emailField;

    @FindBy(id = "passwd")
    protected WebElement passField;

    @FindBy(className = "alert-danger")
    protected WebElement authenticationAlert;

    @FindBy(id = "email_create")
    protected WebElement emailCreateField;

    @FindBy(id = "SubmitCreate")
    protected WebElement submitCreateButton;

    @FindBy(className = "navigation_page")
    WebElement contactHeader;

    public LoginPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void login(String email, String password) {
        emailField.sendKeys(email);
        passField.sendKeys(password);
        passField.sendKeys(Keys.ENTER);
    }

    public boolean isWrongPasswordErrorDisplay() {
        wait.until(ExpectedConditions.visibilityOf(authenticationAlert));
        return authenticationAlert.getText().contains("Authentication failed.");
    }

    public boolean isNoPasswordAlertDisplay() {
        wait.until(ExpectedConditions.visibilityOf(authenticationAlert));
        return authenticationAlert.getText().contains("Password is required.");
    }

    public boolean isWrongEmailAlertDisplay() {
        wait.until(ExpectedConditions.visibilityOf(authenticationAlert));
        return authenticationAlert.getText().contains("Invalid email address.");
    }

    public boolean isNoEmailAlertDisplay() {
        wait.until(ExpectedConditions.visibilityOf(authenticationAlert));
        return authenticationAlert.getText().contains("An email address required.");
    }


    public RegisterPage goToRegister(String emailAddress) {
        emailCreateField.sendKeys(emailAddress);
        submitCreateButton.click();
        return new RegisterPage(driver, wait);
    }

    public boolean isDisplayed() {
        return contactHeader.getText().contains("Authentication");
    }
}
