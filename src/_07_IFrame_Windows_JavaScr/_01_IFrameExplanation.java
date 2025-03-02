package _07_IFrame_Windows_JavaScr;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_IFrameExplanation extends BaseDriver {

    @Test
    public void Test01(){

        driver.get("http://chercher.tech/practice/frames");

        driver.switchTo().frame(0); // with index -> FASTEST
        driver.switchTo().frame("frame1"); // with id -> WORKING SLOW
        driver.switchTo().frame("iamframe"); // with name -> FAST

        WebElement frame1 = driver.findElement(By.id("frame1"));
        driver.switchTo().frame(frame1);

        // index > webelement > name > id     / FASTEST TO SLOWEST

        WebElement txtBox = driver.findElement(By.cssSelector("[id='topic']+input"));
        txtBox.sendKeys("georgia");


        driver.switchTo().parentFrame(); // go one page back
        driver.switchTo().defaultContent();  // go to beginning



        WaitAndQuit();
    }
}
