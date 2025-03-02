package _08_Windows;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class _01_WindowsExplanation extends BaseDriver {

    @Test
    public void Test01() {

        driver.get("https://www.selenium.dev/");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        MyFunc.Wait(1);

        List<WebElement> links = driver.findElements(By.xpath("//a[@target='_blank']"));

        for (WebElement e : links) {
//            e.click();
            js.executeScript("arguments[0].click();", e);
        }

        Set<String> windowsIds = driver.getWindowHandles(); // showing id of all pages
        for (String s : windowsIds){
            System.out.println("ID's = " + s);
        }

        String mainPageId = driver.getWindowHandle(); // showing mainpage id (where you belong first)

        driver.switchTo().window(mainPageId);

            WaitAndQuit();
    }
}
