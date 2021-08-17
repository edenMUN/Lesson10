package singleton;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverSingleton {
    private static WebDriver driver;

    public static WebDriver getDriverInstance(){
        if(driver == null){
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\edenmm\\Downloads\\chromedriver_win32\\chromedriver.exe");
            driver = new ChromeDriver();
        }
        return driver;
    }
}
