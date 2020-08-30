package Application.pageObjects;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class MainPage {

    /**
     * Main page URL
     */
    private final String mainPageUrl = "https://www.moedelo.org/";

    /**
     * Authorization button on the main page
     */
    private final SelenideElement auth = $(By.id("login_auth"));

    public void goToMainPage() {
        open(mainPageUrl);
    }

    public void clickAuthorizationButton() {
        auth.click();
        switchTo().window(1);
    }

}
