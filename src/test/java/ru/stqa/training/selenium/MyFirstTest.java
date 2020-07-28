package ru.stqa.training.selenium;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static org.openqa.selenium.support.ui.ExpectedConditions.*;

public class MyFirstTest {

    private WebDriver driver;
    private WebDriverWait wait;


    @Before
    public void start(){
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10);
    }

    @Test
    public void myFirstTest() {
        for (int i = 0; i < 3; i++) {
            driver.get("http://localhost/litecart/");
            wait.until(titleIs("Online Store | My Store"));
            driver.findElement(By.xpath("//li[contains(@class,'product')]")).click();
            wait.until(titleContains("Rubber Ducks"));
            WebElement sticker = driver.findElement(By.xpath("//div[contains(@class, 'sticker')]"));
            if (sticker.getAttribute("title").equals("On Sale")) {
                Select size = new Select(driver.findElement(By.xpath("//select")));
                size.selectByValue("Large");
                System.out.println("size");
            }
            driver.findElement(By.xpath("//button[@name='add_cart_product']")).click();
            wait.until(presenceOfElementLocated(By.xpath("//div[@id='cart']//img[contains(@src, 'cart_filled.png')]")));
        }
        driver.get("http://localhost/litecart/");
        driver.findElement(By.xpath("//div[@id='cart']//a[@class='link']")).click();
        List<WebElement> duckAmount = driver.findElements(By.xpath("//button[text()='Remove']"));
        for (int i = 0; i < duckAmount.size(); i++) {
            duckAmount.get(i).click();
            wait.until(stalenessOf(duckAmount.get(i)));
        }
    }

    @After
    public void stop(){
        driver.quit();
        driver= null;
    }
}