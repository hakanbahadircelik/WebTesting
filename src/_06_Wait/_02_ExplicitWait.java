package _06_Wait;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _02_ExplicitWait extends BaseDriver {

    @Test
    public void Test01() {

        driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");

        WebElement button = driver.findElement(By.xpath("//button[@onclick='timedText()']"));
        button.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20)); //  wait till you find 20sec (only 1 time writing this)
        wait.until(ExpectedConditions.textToBe(By.id("demo"), "WebDriver")); // wait an element of 'demo', till
                                                                                    // message of 'WebDriver' comes up
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//button[@onclick='timedText()']")));
        // wait till this element visible

        WebElement message = driver.findElement(By.id("demo"));
        System.out.println("message = " + message.getText());

        MyFunc.Wait(1);
        WaitAndQuit();
    }
}
