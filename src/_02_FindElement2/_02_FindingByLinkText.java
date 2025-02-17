package _02_FindElement2;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _02_FindingByLinkText {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hepsiburada.com/");

        WebElement ordersLink = driver.findElement(By.linkText("Siparişlerim"));
        System.out.println("ordersLink.getText() = " + ordersLink.getText());


        MyFunc.Wait(3);
        driver.quit();

    }
}
