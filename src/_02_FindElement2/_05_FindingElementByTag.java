package _02_FindElement2;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _05_FindingElementByTag {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hepsiburada.com/");

        List<WebElement> links = driver.findElements(By.tagName("a"));
        // find the all 'a' tags
        
        for (WebElement w : links)
            System.out.println("w.getText() = " + w.getText());
        
        MyFunc.Wait(3);
        driver.quit();

    }
}
