package _02_FindElement2;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class _08_GetCssValue extends BaseDriver {
    public static void main(String[] args) {

        driver.get("https://www.snapdeal.com/");

        WebElement element = driver.findElement(By.id("inputValEnter"));

        System.out.println("element.getAttribute(class) = " + element.getAttribute("class"));
        System.out.println("element.getAttribute(color) = " + element.getAttribute("color"));
        System.out.println("element.getAttribute(font-size) = " + element.getAttribute("font-size"));
        System.out.println("element.getAttribute(background) = " + element.getAttribute("background"));

        WaitAndQuit();
    } 5
}
