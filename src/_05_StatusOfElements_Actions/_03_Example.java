package _05_StatusOfElements_Actions;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _03_Example extends BaseDriver {

    @Test
    public void Test01() {

        driver.get("https://www.facebook.com/");

        // cookies' fix
//        MyFunc.Wait(1);
//        List<WebElement> cookiesAccept = driver.findElements(By.xpath("//button[text()='Allow all cookies']"));
//        if (cookiesAccept.size() > 0)
//            cookiesAccept.get(0).click();

        WebElement createNewAcc = driver.findElement(By.xpath("//div[@class='_6ltg']/a"));
        createNewAcc.click();
        MyFunc.Wait(1);

        WebElement name = driver.findElement(By.xpath("//input[@name='firstname']"));
        name.sendKeys("baha");
        MyFunc.Wait(1);

        WebElement Sname = driver.findElement(By.xpath("//input[@name='lastname']"));
        Sname.sendKeys("steel");
        MyFunc.Wait(1);

        // checking reEmail showing up or not
        WebElement reEmail = driver.findElement(By.name("reg_email_confirmation__"));
        Assert.assertFalse("reEmail showed up = ", reEmail.isDisplayed());
        MyFunc.Wait(1);

        WebElement email = driver.findElement(By.xpath("//input[@name='reg_email__']"));
        email.sendKeys("bahasteel@gmail.com");
        MyFunc.Wait(1);

        // checking reEmail showing up or not
        Assert.assertTrue("reEmail is not showed up = ", reEmail.isDisplayed());
        MyFunc.Wait(1);

        // Selecting Birthday with SelectClass
        WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
        Select mSelect = new Select(month);
        mSelect.selectByVisibleText("Dec");
        MyFunc.Wait(1);

        WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
        Select dSelect = new Select(day);
        dSelect.selectByVisibleText("15");
        MyFunc.Wait(1);

        WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
        Select ySelect = new Select(year);
        ySelect.selectByVisibleText("2002");
        MyFunc.Wait(1);


        WaitAndQuit();
    }

}
