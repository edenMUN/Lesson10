import com.paulhammant.ngwebdriver.ByAngular;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Question2 {
    private static WebDriver driver;

    @BeforeClass
    public static void runOnceBeforeClass() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\edenmm\\Downloads\\chromedriver_win32\\ChromeDriver.exe");
        driver = new ChromeDriver();
        driver.get("https://dgotlieb.github.io/AngularJS/main.html");
    }

    @Test
    public void ClearFirstName() {
        WebElement firstmane = driver.findElement(ByAngular.model("firstName"));
        firstmane.clear();
        firstmane.sendKeys("Eden");
        assertEquals(driver.findElement(By.xpath("//input")).getAttribute("value"), "Eden");
    }

//    Question3 - limits the time that the script allots for a web page to be displayed.
}
