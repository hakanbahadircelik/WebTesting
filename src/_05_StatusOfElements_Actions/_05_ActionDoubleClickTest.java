package _05_StatusOfElements_Actions;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _05_ActionDoubleClickTest extends BaseDriver {

    @Test
    public void Test01() {

        driver.get("https://demoqa.com/buttons");

        WebElement doubleClick = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
        MyFunc.Wait(1);

        Actions actions = new Actions(driver); // web page open for actions
        Action action = actions.moveToElement(doubleClick).doubleClick().build();
        action.perform();


        WaitAndQuit();
    }

}
