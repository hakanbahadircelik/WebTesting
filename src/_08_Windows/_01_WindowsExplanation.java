package _08_Windows;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _01_WindowsExplanation extends BaseDriver {

    @Test
    public void Test01() {

        driver.get("https://www.selenium.dev/");
        MyFunc.Wait(1);

        List<WebElement> links = driver.findElements(By.xpath("//a[@target='_blank']"));

        for (WebElement e : links) {
            System.out.println("e.getText() = " + e.getText());
            e.click();
        }


        WaitAndQuit();
    }
}
