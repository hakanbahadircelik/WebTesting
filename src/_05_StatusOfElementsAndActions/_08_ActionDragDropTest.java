package _05_StatusOfElementsAndActions;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _08_ActionDragDropTest extends BaseDriver {

    @Test
    public void Test01(){

        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        Actions actions = new Actions(driver);

        MyFunc.Wait(1);
        WebElement oslo = driver.findElement(By.id("box1"));
        WebElement norway = driver.findElement(By.id("box101"));

        // 1. way
        actions.dragAndDrop(oslo, norway).build().perform();

        // 2. way
        actions.clickAndHold(oslo).build().perform();
        actions.moveToElement(norway).release().build().perform();

        WaitAndQuit();
    }
}
