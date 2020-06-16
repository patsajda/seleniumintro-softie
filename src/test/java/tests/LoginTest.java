package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import page.objects.LoginPage;
import page.objects.HomePage;

public class LoginTest extends BaseTest {

    @Test
    void shouldDisplayAuthenticationErrorWhenWrongPasswordProvided() {
        HomePage homePage = new HomePage(driver, wait);
        homePage.openPage();
        LoginPage loginPage = homePage.goToLoginPage();
        loginPage.login("test@softie.pl", "incorrect");

        Assertions.assertTrue(loginPage.isWrongPasswordErrorDisplay());
    }

    @Test
    void shouldDisplayAuthenticationErrorWhenNoPasswordProvided() {
        HomePage homePage = new HomePage(driver, wait);
        homePage.openPage();
        LoginPage loginPage = homePage.goToLoginPage();
        loginPage.login("test@softie.pl", "");

        Assertions.assertTrue(loginPage.isNoPasswordAlertDisplay());
    }

    @Test
    void shouldDisplayAuthenticationErrorWhenWrongEmailProvided() {
        HomePage homePage = new HomePage(driver, wait);
        homePage.openPage();
        LoginPage loginPage = homePage.goToLoginPage();
        loginPage.login("test", "incorrect");

        Assertions.assertTrue(loginPage.isWrongEmailAlertDisplay());
    }

    @Test
    void shouldDisplayAuthenticationErrorWhenNoEmailProvided() {
        HomePage homePage = new HomePage(driver, wait);
        homePage.openPage();
        LoginPage loginPage = homePage.goToLoginPage();
        loginPage.login("", "incorrect");

        Assertions.assertTrue(loginPage.isNoEmailAlertDisplay());
    }
}

