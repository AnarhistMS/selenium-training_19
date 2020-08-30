package Application.pageObjects;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.$;

public class MainAccountingPage {

    /**
     * Creation of xpath to find user id in the script on the Accounting page
     */
    private String xpathCreator(String id) {
        return "//script[contains(text(),\"" + id + "\")]";
    }

    public void checkUserId(String id) {
        $(By.xpath(xpathCreator(id))).should(exist);
    }
}
