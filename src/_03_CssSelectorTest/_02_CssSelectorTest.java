package _03_CssSelectorTest;
import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.junit.Assert; // *
import org.junit.Test; // *

public class _02_CssSelectorTest extends BaseDriver {

    @Test                   // no need main anymore
    public void Test01(){
        driver.get("https://demo.selenium.com/basic-first-form-demo.html");

        String message = "hello selenium";
        WebElement txtBox = driver.findElement(By.cssSelector("input[id='user-message']"));
        txtBox.sendKeys(message);

        WebElement btn = driver.findElement(By.cssSelector("[onclick='showInput();']"));
        btn.click();

        WebElement msg = driver.findElement(By.cssSelector("[id='display']"));

        Assert.assertTrue(msg.getText().contains(message)); // is it TRUE or FALSE
        // if it's true, don't write anything
        // if its false, it gives ERROR MESSAGE

        WaitAndQuit();
    }

}
