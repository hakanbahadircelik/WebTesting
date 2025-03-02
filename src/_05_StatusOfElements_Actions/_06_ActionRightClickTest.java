package _05_StatusOfElements_Actions;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _06_ActionRightClickTest extends BaseDriver {

    @Test
    public void Test01(){

        driver.get("https://demoqa.com/buttons");

        WebElement btnRightClick;
        btnRightClick = driver.findElement(By.id("rightClickBtn"));
        MyFunc.Wait(1);

        Actions actions = new Actions(driver);
        Action action = actions.contextClick(btnRightClick).build();
        action.perform();


        WaitAndQuit();
    }

}
