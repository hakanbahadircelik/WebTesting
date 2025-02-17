package _02_FindElement2;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _07_Navigating extends BaseDriver {
    public static void main(String[] args) {

        driver.navigate().to("https://testpages.eviltester.com/styled/index.html");

        WebElement element = driver.findElement(By.id("alerttest"));
        element.click(); // went to the other page
        MyFunc.Wait(3);
        System.out.println(driver.getCurrentUrl());

        driver.navigate().back();
        MyFunc.Wait(3);
        System.out.println(driver.getCurrentUrl());

        driver.navigate().forward();
        MyFunc.Wait(3);
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());

        WaitAndQuit();
    }
}
