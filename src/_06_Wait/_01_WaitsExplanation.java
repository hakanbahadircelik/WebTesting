package _06_Wait;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class _01_WaitsExplanation extends BaseDriver {

    @Test
    public void Test01(){

        driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        // try to find an element till 20 seconds

        WebElement button = driver.findElement(By.xpath("//button[@onclick='timedText()']"));
        button.click();

        WebElement message = driver.findElement(By.xpath("//p[text()='WebDriver']"));
        System.out.println("message = " + message);


        MyFunc.Wait(1);
        WaitAndQuit();
    }
}
