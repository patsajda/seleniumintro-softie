package page.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ContactPage extends BasePage{
    @FindBy(className = "navigation_page")
    WebElement contactHeader;

    public ContactPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public boolean isDisplayed() {
        return contactHeader.getText().contains("Contact");
    }
}
