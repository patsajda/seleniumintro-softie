package page.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;
    final String MAIN_URL = "http://automationpractice.com/index.php";

    @FindBy(linkText = "Sign in")
    WebElement signInButton;

    @FindBy(id = "contact")
    WebElement contactButton;

    public BasePage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
        PageFactory.initElements(driver, this);
    }

    public void openPage() {
        driver.get(MAIN_URL);
    }

    public LoginPage goToLoginPage() {
        wait.until(ExpectedConditions.elementToBeClickable(signInButton));
        signInButton.click();
        return new LoginPage(driver, wait);
    }

    public ContactPage goToContactPage() {
        wait.until(ExpectedConditions.elementToBeClickable(contactButton));
        contactButton.click();
        return new ContactPage(driver,wait);
    }

}
