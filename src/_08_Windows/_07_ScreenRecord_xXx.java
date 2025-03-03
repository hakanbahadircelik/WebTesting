package _08_Windows;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class _07_ScreenRecord_xXx extends BaseDriver {

    @Test
    public void Test01() throws IOException {

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        MyFunc.Wait(1);

        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys("abc");
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("abc");
        WebElement submit = driver.findElement(By.cssSelector("button[type='submit']"));
        submit.click();

        List<WebElement> errorMsg = driver.findElements(By.xpath("//p[text()='Invalid credentials']"));
        if (errorMsg.size() > 0) // if there is an error,
        {
            System.out.println(" error ");
            // record screen

            TakesScreenshot tss = (TakesScreenshot) driver; // screenShot variable written
            File onTheDatabase = tss.getScreenshotAs(OutputType.FILE); // take a screenShot, on the dataBase
            // need to save the SS to the file from dataBase
            FileUtils.copyFile(onTheDatabase, new File("screenShots\\screenshot.png"));

        }


        WaitAndQuit();
    }
}
