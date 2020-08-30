package Application.pageObjects;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class AuthorizationPage {

    /**
     * Email input field on authorization page
     */
    private final SelenideElement emailInputField = $(By.xpath("//input[@type='email']"));

    /**
     * Password input field on authorization page
     */
    private final SelenideElement passwordInputField = $(By.xpath("//input[@type='password']"));

    /**
     * Login button on authorization page
     */
    private final SelenideElement login = $(By.xpath("//button"));

    public void emailAndPasswordInput(String email, String password) {
        emailInputField.setValue(email);
        passwordInputField.setValue(password);
    }

    public void login() {
        login.click();
    }

}
