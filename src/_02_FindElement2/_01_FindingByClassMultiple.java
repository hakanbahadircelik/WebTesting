package _02_FindElement2;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _01_FindingByClassMultiple {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hepsiburada.com/");

        List<WebElement> labels = driver.findElements(By.className("i9jTSpEeoI29_M1mOKct"));
        for (WebElement w : labels)
            System.out.println("w.getText() = " + w.getText());


        MyFunc.Wait(3);
        driver.quit();

    }
}
