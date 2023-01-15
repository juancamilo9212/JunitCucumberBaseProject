package DriverFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

    private static final DriverFactory INSTANCE = new DriverFactory();
    private final ThreadLocal<WebDriver> thread = new ThreadLocal<WebDriver>();

    private DriverFactory() {
    }

    public static DriverFactory getDriverFactory() {
        return INSTANCE;
    }

    public WebDriver getDriver(BrowserType type) {
        if (thread.get() == null) {
            switch (type) {
                case CHROME:
                    thread.set(new ChromeDriver());
                    break;
                case FIREFOX:
                    thread.set(new FirefoxDriver());
                    break;
                default:
                    break;
            }
        }
        return thread.get();
    }
}
