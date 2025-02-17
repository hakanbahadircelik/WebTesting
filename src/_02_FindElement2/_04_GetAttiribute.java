package _02_FindElement2;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _04_GetAttiribute {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hepsiburada.com/");

        // normally thats 4 word but I wrote 2 of it. It founds the rest of the words
        WebElement ordersLink = driver.findElement(By.partialLinkText("Süper Fiyat"));
        System.out.println("ordersLink.getText() = " + ordersLink.getText());

        System.out.println("ordersLink.getAttribute(\"href\") = " + ordersLink.getAttribute("href"));
        System.out.println("ordersLink.getAttribute(\"title\") = " + ordersLink.getAttribute("title"));
        System.out.println("ordersLink.getAttribute(\"rel\") = " + ordersLink.getAttribute("rel"));


        MyFunc.Wait(3);
        driver.quit();

    }
}
