package Application;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class MainAccountingPage{

    final static String CORRECTUSERID = "9286120";
    public static void checkUserInfo() {
        $(By.xpath("//script[contains(text(),\"" + CORRECTUSERID + "\")]")).should(exist);
    }
}
