package _08_Windows;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;

public class _06_ShadowContent extends BaseDriver {

    @Test
    public void Test01() {

        driver.get("https://www.akakce.com/");

        WebElement shadowWebParent = driver.findElement(By.cssSelector("[class='efilli-language-compiled-css']"));

        SearchContext shadowContent = shadowWebParent.getShadowRoot();

        WebElement acceptBtn = shadowContent.findElement(By.cssSelector("div+div > div+div"));
        acceptBtn.click();



        WaitAndQuit();
    }
}
