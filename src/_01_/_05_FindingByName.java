package _01_;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _05_FindingByName {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");

        WebElement textBox1 = driver.findElement(By.name("q8_name[first]"));
        textBox1.sendKeys("baha");

        WebElement textBox2 = driver.findElement(By.name("q8_name[last]"));
        textBox2.sendKeys("steel");

        WebElement clickBox = driver.findElement(By.id("input_2"));
        clickBox.click();

        MyFunc.Wait(3);
        driver.quit();
    }
}
