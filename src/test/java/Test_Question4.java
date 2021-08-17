import buttons.Buttons;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import singleton.DriverSingleton;

public class Test_Question4 {
    public static WebDriver driver;
    int number = 13;

    @BeforeClass
    public void beforeClass(){
        driver = DriverSingleton.getDriverInstance();
        driver.get("https://dgotlieb.github.io/WebCalculator/");
    }

    @Test
    public void test01(){
        Buttons dimension = new Buttons(driver);
        System.out.println(dimension.getHeight());
        System.out.println(dimension.getWidth());
    }

    @Test
    public void sixIsDisplayed(){
        Buttons sixIsDisplayed = new Buttons(driver);
        sixIsDisplayed.isDisplayed();
    }

    @Test
    public void test02(){
        Buttons printnumber = new Buttons(driver);
        int actual = printnumber.textSeven() + printnumber.textSix();
        Assert.assertEquals(actual, number);
    }
}

