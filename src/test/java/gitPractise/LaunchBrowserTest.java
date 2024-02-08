package gitPractise;

import org.example.BaseCLass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.io.IOException;

public class LaunchBrowserTest extends BaseCLass {

    WebDriver driver;

    @Test
    public void launchBrowser() throws IOException {
        driver= initializeDriver();
        driver.get("https://demoautomation2303.aurigo.net/");
        System.out.println("added new code");
        driver.close();
    }
}
