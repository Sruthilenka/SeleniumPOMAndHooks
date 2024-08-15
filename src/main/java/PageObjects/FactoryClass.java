package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FactoryClass {
    public static WebDriver driver;

    public static WebDriver getDriver(){
        if(driver == null){
            driver= new ChromeDriver();
        }
        return driver;
    }
}
