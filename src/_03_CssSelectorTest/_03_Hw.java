package _03_CssSelectorTest;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _03_Hw extends BaseDriver {

    @Test
    public void Test01(){

        driver.get("https://formsmarts.com/form/yu?mode=h5");

        MyFunc.Wait(1);
        WebElement business = driver.findElement(By.xpath("//input[@id='u_XiB_4586_0']"));
        business.click();

        MyFunc.Wait(1);
        WebElement select = driver.findElement(By.xpath("//select[@id='u_XiB_4588']"));
        select.click();
        MyFunc.Wait(1);
        WebElement onelineAdv = driver.findElement(By.xpath("//option[@value='Online Advertising']"));
        onelineAdv.click();

        MyFunc.Wait(1);
        WebElement everyD = driver.findElement(By.xpath("//label[@for='u_XiB_89585_0']"));
        everyD.click();

        MyFunc.Wait(1);
        WebElement good = driver.findElement(By.xpath("//input[@id='u_XiB_4589_0']"));
        good.click();

        MyFunc.Wait(1);
        WebElement select2 = driver.findElement(By.xpath("//select[@id='u_XiB_4597']"));
        select2.click();
        MyFunc.Wait(1);
        WebElement xyz = driver.findElement(By.xpath("//*[@id='u_XiB_4597']/option[3]"));
        xyz.click();


        WaitAndQuit();
    }

}

// go to https://formsmarts.com/form/yu?mode=h5
// select business
// click and select online advertising
// select every day
// select good
// click using xyz and select 3rd
// with css selector

