package ru.stqa.training.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.openqa.selenium.support.ui.ExpectedConditions.titleContains;
import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

public class MainPage extends BasePage {

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public void selectFirstProDuckt(){
        driver.findElement(By.xpath("//li[contains(@class,'product')]")).click();
        wait.until(titleContains("Rubber Ducks"));
    }

    public void goToMainPage() {
        driver.get("http://localhost/litecart/");
        wait.until(titleIs("Online Store | My Store"));
    }

    public void goToCart() {
        driver.findElement(By.xpath("//div[@id='cart']//a[@class='link']")).click();
    }
}
