package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import page.objects.ContactPage;
import page.objects.HomePage;

public class ContactTest extends BaseTest {
    @Test
    void shouldRedirectToContactPage() {
        HomePage homePage = new HomePage(driver, wait);
        homePage.openPage();

        ContactPage contactPage = homePage.goToContactPage();
        Assertions.assertTrue(contactPage.isDisplayed());
    }
}
