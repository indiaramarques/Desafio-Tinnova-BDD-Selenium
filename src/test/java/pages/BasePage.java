package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import support.driver.DriverManager;

public class BasePage {

    public static void click(By element){
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), 10);
        WebElement test = wait.until(ExpectedConditions.elementToBeClickable(element));
        test.click();
    }

    public static void sendKeys(By element, String text){
        if(!text.isEmpty()){
            WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), 10);
            wait.until(ExpectedConditions.elementToBeClickable(element));
            DriverManager.getDriver().findElement(element).sendKeys(text);
            delay(1000);
        }
    }

    public static void delay(int milliseconds){
        try {
            Thread.sleep(milliseconds);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
