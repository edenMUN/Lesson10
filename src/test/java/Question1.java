import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Question1 {
    private static WebDriver driver;
    private static WebDriverWait wait;

    @BeforeClass
    public static void runOnceBeforeClass() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\edenmm\\Downloads\\chromedriver_win32\\ChromeDriver.exe");
        driver = new ChromeDriver();
        driver.get("https://dgotlieb.github.io/Selenium/synchronization.html");
    }

    @Test
    public void removeCheckbox(){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.id("btn")).click();
        driver.findElement(By.id("message")).isDisplayed();
    }

    @Test
    public void ShowHidden() throws InterruptedException {
        driver.findElement(By.id("hidden")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("finish1")).isDisplayed();
    }

    @Test
    public void render(){
        driver.findElement(By.id("rendered")).click();
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("finish2")));
    }
}
