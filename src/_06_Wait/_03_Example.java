package _06_Wait;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class _03_Example extends BaseDriver {

    @Test
    public void Test01(){

        driver.get("https://demoblaze.com/index.html");

        WebElement s6 = driver.findElement(By.xpath("//a[text()='Samsung galaxy s6']"));
        s6.click();

        WebElement addToCart = driver.findElement(By.xpath("//a[text()='Add to cart']"));
        addToCart.click();

        wait.until(ExpectedConditions.alertIsPresent()); // wait till the alert comes up

        driver.switchTo().alert().accept();

        WebElement mainPage = driver.findElement(By.id("nava"));
        mainPage.click();

        WaitAndQuit();
    }
}
