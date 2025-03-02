package _05_StatusOfElements_Actions;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _11_ActionKeyboardControlSendKeys extends BaseDriver {

    @Test
    public void Test01(){

        driver.get("http://facebook.com/");

        WebElement txtBox = driver.findElement(By.id("email"));
        MyFunc.Wait(1);

        new Actions(driver).moveToElement(txtBox).click().keyDown(Keys.SHIFT).sendKeys("b").keyUp(Keys.SHIFT).sendKeys("aha").build().perform();

        WaitAndQuit();
    }

    @Test
    public void Test02(){

        driver.get("https://demoqa.com/auto-complete");

        WebElement txtBox = driver.findElement(By.xpath("//div[@class='auto-complete__value-container css-1hwfws3']"));
        MyFunc.Wait(1);

        Actions actions = new Actions(driver);

        actions.moveToElement(txtBox).click().sendKeys("b").build().perform();
        MyFunc.Wait(2);
        actions.keyDown(Keys.ARROW_DOWN).keyDown(Keys.ENTER).build().perform();


        WaitAndQuit();
    }

}
