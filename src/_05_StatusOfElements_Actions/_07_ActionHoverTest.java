package _05_StatusOfElements_Actions;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _07_ActionHoverTest extends BaseDriver {

    @Test
    public void Test01(){

        driver.get("https://www.trendyol.com/");

        WebElement element = driver.findElement(By.xpath("//span[text()='Moda']"));
        MyFunc.Wait(1);

        Actions actions = new Actions(driver);
        Action action = actions.moveToElement(element).build();
        action.perform();

        MyFunc.Wait(1);
        WaitAndQuit();
    }

}
