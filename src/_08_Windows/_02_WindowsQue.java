package _08_Windows;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

import static Utility.BaseDriver.WaitAndQuit;

public class _02_WindowsQue extends BaseDriver {

    @Test
    public void Test01() {

        driver.get("https://www.selenium.dev/");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        MyFunc.Wait(1);

        String mainPageId = driver.getWindowHandle(); // main page id

        List<WebElement> links = driver.findElements(By.xpath("//a[@target='_blank']"));

        for (WebElement e : links) {
            js.executeScript("arguments[0].click();", e);
        }

        Set<String> pageIDs = driver.getWindowHandles();

        for (String s : pageIDs) {
            MyFunc.Wait(1);
            driver.switchTo().window(s);
            System.out.println("title= " + driver.getTitle() + ", url= " + driver.getCurrentUrl());
        }

        for (String s : pageIDs) {

            if (s.equals(mainPageId)) continue;

            driver.switchTo().window(s);
            driver.close();
        }


        WaitAndQuit();
    }
}
