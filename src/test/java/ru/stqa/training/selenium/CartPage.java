package ru.stqa.training.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.openqa.selenium.support.ui.ExpectedConditions.*;

public class CartPage extends BasePage {

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public void removeProDucts() {
        List<WebElement> duckAmount = driver.findElements(By.xpath("//button[text()='Remove']"));
        for (int i = 0; i < duckAmount.size(); i++) {
            duckAmount.get(i).click();
            wait.until(stalenessOf(duckAmount.get(i)));
        }
    }

    public boolean cartIsEmpty() {
        return driver.findElement(By.tagName("p")).getAttribute("textContent").contains("There are no items in your cart.");

    }
}