package hooks;

import org.junit.After;
import org.openqa.selenium.WebDriver;

public class hookfile {
    WebDriver driver;
    @After
    public void tearDown(){
        if(driver!=null){
            driver.quit();
        }
    }
}
