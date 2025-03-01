package _01_FindElement;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02_FindingById {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");

        // # = only checks id's
        WebElement nameBox = driver.findElement(By.id("first_8"));
        nameBox.sendKeys("baha");

        WebElement snameBox = driver.findElement(By.id("last_8"));
        snameBox.sendKeys("steel");

        MyFunc.Wait(3);
        driver.quit();
    }
}
