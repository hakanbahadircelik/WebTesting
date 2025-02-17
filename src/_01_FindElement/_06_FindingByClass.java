package _01_FindElement;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _06_FindingByClass {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");

        WebElement textBox1 = driver.findElement(By.className("form-textbox"));
        // if there is more than one same element in findElement, it sends the first one
        textBox1.sendKeys("baha");


        MyFunc.Wait(3);
        driver.quit();

    }
}
