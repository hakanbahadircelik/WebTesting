package _07_IFrame_Windows_JavaScr;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class _05_JavaScriptClick extends BaseDriver {

    @Test
    public void Test01(){

        driver.get("https://www.copado.com/product-overview/copado-robotic-testing");
        MyFunc.Wait(2);

        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement demo = driver.findElement(By.xpath("//a[@id='w-node-bd3f14b1-25af-3df6-45b6-9a48db433b04-a0bab9d4']"));
        js.executeScript("arguments[0].scrollIntoView[true];",demo);  //  scroll till element
//        readStoryLink.click();

        js.executeScript("arguments[0].click();",demo);  //  click with java


        WaitAndQuit();
    }
}
