package ru.stqa.training.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import static org.openqa.selenium.support.ui.ExpectedConditions.*;

public class ProductPage extends BasePage{
    public ProductPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void addProDuckt() {
        WebElement sticker = driver.findElement(By.xpath("//div[contains(@class, 'sticker')]"));
        if (sticker.getAttribute("title").equals("On Sale")) {
            Select size = new Select(driver.findElement(By.xpath("//select")));
            size.selectByValue("Large");
            System.out.println("size");
        }
        driver.findElement(By.xpath("//button[@name='add_cart_product']")).click();
        wait.until(presenceOfElementLocated(By.xpath("//div[@id='cart']//img[contains(@src, 'cart_filled.png')]")));
    }

}