package _03_CssSelector;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_CssSelectorExample extends BaseDriver {
    public static void main(String[] args) {

        driver.get("https://demo.selenium.com/basic-first-form-demo.html");

        String message = "hello selenium";
        WebElement txtBox = driver.findElement(By.cssSelector("input[id='user-message']"));
        txtBox.sendKeys(message);

        WebElement btn = driver.findElement(By.cssSelector("[onclick='showInput();']"));
        btn.click();

        WebElement msg = driver.findElement(By.cssSelector("[id='display']"));

        if (msg.getText().contains(message))
            System.out.println("TEST PASSED");
        else
            System.out.println("TEST FAILED");

        WaitAndQuit();
    }
}
