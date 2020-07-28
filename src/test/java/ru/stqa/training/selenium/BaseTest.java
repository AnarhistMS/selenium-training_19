package ru.stqa.training.selenium;

import org.junit.Before;
import ru.stqa.training.selenium.App;

public class BaseTest {

    public static ThreadLocal<App> tlApp = new ThreadLocal<>();
    public App app;

    @Before
    public void start() {
        if (tlApp.get() != null) {
            app = tlApp.get();
            return;
        }

        app = new App();
        tlApp.set(app);

        Runtime.getRuntime().addShutdownHook(
                new Thread(() -> { app.quit(); app = null; }));
    }

}