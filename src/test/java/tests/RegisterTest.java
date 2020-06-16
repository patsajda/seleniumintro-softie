package tests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import page.objects.LoginPage;
import page.objects.HomePage;
import page.objects.RegisterPage;

public class RegisterTest extends BaseTest {

    @Test
    void register() {
        HomePage homePage = new HomePage(driver, wait);
        homePage.openPage();
        LoginPage loginPage = homePage.goToLoginPage();
        RegisterPage registerPage = loginPage.goToRegister("szakal@softie.pl");
        registerPage.register("Patryk", "Sto", "tajnehaslo", "Patryk",
                "Szakal", "OxfordStreet", "Warsaw", "00020", "699699699", "Alabama");

//TODO: Assertions

    }

    @AfterAll
    static void tearDown() {
        driver.quit();
    }
}
