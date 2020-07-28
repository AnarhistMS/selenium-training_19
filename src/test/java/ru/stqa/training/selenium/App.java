package ru.stqa.training.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
    private WebDriver driver;

    public CartPage cartPage;
    public MainPage mainPage;
    public ProductPage productPage;

    public App() {
        driver = new ChromeDriver();
        cartPage = new CartPage(driver);
        mainPage = new MainPage(driver);
        productPage = new ProductPage(driver);
    }
    public void go() {

    }
    public void addProDucktToCart() {
        mainPage.goToMainPage();
        mainPage.selectFirstProDuckt();
        productPage.addProDuckt();
    }

    public void goToCart() {
        mainPage.goToMainPage();
        mainPage.goToCart();
    }

    public void removeAll() {
        cartPage.removeProDucts();
    }
    public void quit() {
        driver.quit();
    }
}