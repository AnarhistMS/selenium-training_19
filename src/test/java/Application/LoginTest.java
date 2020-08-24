package Application;

import org.junit.Test;

public class LoginTest{


    @Test
    public void loginTest() {
        MainPage.goToMainPage();
        MainPage.clickLoginButton();
        AuthorizationPage.correctCredentialInput();
        AuthorizationPage.login();
        MainAccountingPage.checkUserInfo();
    }
}