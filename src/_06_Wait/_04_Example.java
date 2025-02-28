package _06_Wait;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class _04_Example extends BaseDriver {

    @Test
    public void Test01() {

        driver.get("https://www.google.com/");
//        MyFunc.Wait(2);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//textarea[@name='q']")));

        WebElement searchBar = driver.findElement(By.xpath("//textarea[@name='q']"));
        searchBar.sendKeys("selenium");

        WebElement searchBtn = driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[1]"));
        searchBtn.click();

        WebElement selenium = driver.findElement(By.xpath("(//a/h3)[1]"));
        selenium.click();

        Assert.assertTrue("URL is not matching", driver.getCurrentUrl().equals("https://www.selenium.dev/"));

//        Actions actions = new Actions(driver);


        WaitAndQuit();
    }
}
