package Application;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class AuthorizationPage{

    final static String CORRECTMAIL = "test_acc_ip@testemail.org";
    final static String CORRECTPASSWORD = "890890";

    public static void correctCredentialInput() {
        $(By.xpath("//input[@type='email']")).setValue(CORRECTMAIL);
        $(By.xpath("//input[@type='password']")).setValue(CORRECTPASSWORD);
    }

    public static void login() {
        $(By.xpath("//button")).click();
    }

}
