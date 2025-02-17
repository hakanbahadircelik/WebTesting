package _02_FindElement2;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class _06_StopJavaTillFindElement extends BaseDriver {
    public static void main(String[] args) {

        DriverStart();

        driver.get("https://www.hepsiburada.com/");

        List<WebElement> links = driver.findElements(By.tagName("a"));
        // find the all 'a' tags

        for (WebElement w : links)
            System.out.println("w.getText() = " + w.getText());

        WaitAndQuit();


    }
}
