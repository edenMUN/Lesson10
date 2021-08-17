package buttons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Buttons {
    private WebDriver driver;

    public Buttons(WebDriver driver){
        this.driver = driver;
    }

    public int getHeight(){
        WebElement height = driver.findElement(Constants.MY_LOCATOR_SEVEN);
        return height.getRect().getHeight();
    }

    public int getWidth(){
        WebElement height = driver.findElement(Constants.MY_LOCATOR_SEVEN);
        return height.getRect().getWidth();
    }

    public Boolean isDisplayed(){
        WebElement sixDisplayed = driver.findElement(Constants.MY_LOCATOR_SIX);
        return sixDisplayed.isDisplayed();
    }

    public int textSeven(){
        WebElement numSeven = driver.findElement(Constants.MY_LOCATOR_SEVEN);
        String sValue = numSeven.getText();
        int iValue = Integer.parseInt(sValue);
        return iValue;
    }

    public int textSix(){
        WebElement numSIX = driver.findElement(Constants.MY_LOCATOR_SIX);
        String sValue = numSIX.getText();
        int iValue = Integer.parseInt(sValue);
        return iValue;
    }
}
