package hooks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepHooks {
    protected static WebDriver driver;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    public static WebDriver getDriver(){
        return driver;
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
