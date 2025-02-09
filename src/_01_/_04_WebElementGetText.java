package _01_;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _04_WebElementGetText {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");

        WebElement label = driver.findElement(By.id("sublabel_8_first"));
        System.out.println("label.getText() = " + label.getText());

        WebElement label2 = driver.findElement(By.id("sublabel_8_last"));
        System.out.println("labe2l.getText() = " + label2.getText());

        MyFunc.Wait(3);
        driver.quit();
    }
}
