package Application;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class MainPage{

    public static void goToMainPage() {
        open("https://www.moedelo.org/");
    }
    public static void clickLoginButton() {
        $(By.id("login_auth")).click();
        switchTo().window(1);
    }

}
