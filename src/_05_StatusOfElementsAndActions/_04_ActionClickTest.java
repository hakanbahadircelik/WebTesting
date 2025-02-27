package _05_StatusOfElementsAndActions;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _04_ActionClickTest extends BaseDriver {

    @Test
    public void Test01(){

        driver.get("https://demoqa.com/buttons");

        WebElement element = driver.findElement(By.xpath("//button[text()='Click Me']"));

        Actions actions = new Actions(driver); // web page open for actions

        Action action = actions.moveToElement(element).click().build();
        // go to the element and wait there, prepare for action
        System.out.println("Action got ready");

        MyFunc.Wait(2);
        action.perform(); // action starts
        System.out.println("Action happend");

        // short version
        new Actions(driver).moveToElement(element).click().build().perform();

        WaitAndQuit();
    }
}
