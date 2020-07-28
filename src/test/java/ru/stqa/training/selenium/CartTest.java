package ru.stqa.training.selenium;

import org.junit.Test;

public class CartTest extends BaseTest {

    @Test
    public void cartTest() {
        for (int i = 0; i < 3; i++) {
                app.addProDucktToCart();
        }
        app.goToCart();
        app.removeAll();
        app.quit();
    }
}