package _04_Xpath;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _01_Example_xXx extends BaseDriver {

    @Test
    public void Test01() {

        driver.get("https://www.saucedemo.com/");

        // LOGIN PART
        WebElement uName = driver.findElement(By.xpath("//input[@id='user-name']"));
        uName.sendKeys("standard_user");

        MyFunc.Wait(1);
        WebElement passW = driver.findElement(By.xpath("//input[@id='password']"));
        passW.sendKeys("secret_sauce");

        MyFunc.Wait(1);
        WebElement login = driver.findElement(By.xpath("//input[@id='login-button']"));
        login.click();

        // 1. PRODUCT ADDED
        MyFunc.Wait(1);
        WebElement backpack = driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
        backpack.click();

        MyFunc.Wait(1);
        WebElement addToCart = driver.findElement(By.xpath("//button[text()='Add to cart']"));
        addToCart.click();

        MyFunc.Wait(1);
        WebElement backToProd = driver.findElement(By.xpath("//button[@id='back-to-products']"));
        backToProd.click();

        // 2. PRODUCT ADDED
        MyFunc.Wait(1);
        WebElement shirt = driver.findElement(By.xpath("//div[text()='Sauce Labs Bolt T-Shirt']"));
        shirt.click();

        MyFunc.Wait(1);
        WebElement addToCart2 = driver.findElement(By.xpath("//button[text()='Add to cart']"));
        addToCart2.click();

        MyFunc.Wait(1);
        WebElement backToProd2 = driver.findElement(By.xpath("//button[@id='back-to-products']"));
        backToProd2.click();

        // GO TO SHOPPING CART
        MyFunc.Wait(1);
        WebElement shopingCart = driver.findElement(By.xpath("//div[@id='shopping_cart_container']/a"));
        shopingCart.click();

        MyFunc.Wait(1);
        WebElement checkout = driver.findElement(By.xpath("//button[@id='checkout']"));
        checkout.click();

        // WRITING INFORMATION
        MyFunc.Wait(1);
        WebElement fname = driver.findElement(By.xpath("//input[@id='first-name']"));
        fname.sendKeys("baha");

        MyFunc.Wait(1);
        WebElement lname = driver.findElement(By.xpath("//input[@id='last-name']"));
        lname.sendKeys("steel");

        MyFunc.Wait(1);
        WebElement zipC = driver.findElement(By.xpath("//input[@id='postal-code']"));
        zipC.sendKeys("55055");

        MyFunc.Wait(1);
        WebElement continuee = driver.findElement(By.xpath("//input[@id='continue']"));
        continuee.click();

        // CHECKING THE PRICE
        // xXx people can add several items, so you need to find with 1 element
        MyFunc.Wait(1);
        List<WebElement> itemPrices = driver.findElements(By.xpath("//div[@class='inventory_item_price']"));

        double sum = 0;
        for (WebElement e : itemPrices)
        {
            System.out.println(e.getText());
            sum = sum + Double.parseDouble(e.getText().replaceAll("[^0-9,.]",""));
        }
        System.out.println(sum);

        WaitAndQuit();
    }

}
