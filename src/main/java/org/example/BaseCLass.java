package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;

public class BaseCLass {
    ChromeOptions options = null;
    public static WebDriver driver = null;
    public static WebDriverWait wait;

    public WebDriver initializeDriver() throws IOException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        FirefoxOptions FirefoxOptions = new FirefoxOptions();
        FirefoxOptions.addArguments("-private");
        options = new ChromeOptions();
        options.addArguments("start-maximized", "--disable-extensions", "--incognito", "--remote-allow-origins=*");
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.manage().deleteAllCookies();
        return driver;

    }
}