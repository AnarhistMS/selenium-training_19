package Application.tests;

import Application.pageObjects.AuthorizationPage;
import Application.pageObjects.MainAccountingPage;
import Application.pageObjects.MainPage;
import org.junit.Test;

public class LoginTest {

    private AuthorizationPage authorizationPage;
    private MainPage mainPage;
    private MainAccountingPage mainAccountingPage;

    public LoginTest() {
        authorizationPage = new AuthorizationPage();
        mainPage = new MainPage();
        mainAccountingPage = new MainAccountingPage();
    }

    @Test
    public void loginTest() {
        mainPage.goToMainPage();
        mainPage.clickAuthorizationButton();
        authorizationPage.emailAndPasswordInput("test_acc_ip@testemail.org", "890890");
        authorizationPage.login();
        mainAccountingPage.checkUserId("92861");
    }
}