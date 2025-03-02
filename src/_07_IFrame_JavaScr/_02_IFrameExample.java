package _07_IFrame_JavaScr;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _02_IFrameExample extends BaseDriver {

    @Test
    public void Test01(){

        driver.get("http://chercher.tech/practice/frames");

        driver.switchTo().frame(1);

        WebElement webSelect = driver.findElement(By.xpath("animals"));
        Select select = new Select(webSelect);
        select.selectByVisibleText("Avatar");


        WaitAndQuit();
    }
}
