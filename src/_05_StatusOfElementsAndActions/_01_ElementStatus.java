package _05_StatusOfElementsAndActions;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_ElementStatus extends BaseDriver {

    @Test
    public void Test01(){

        driver.get("http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCheckBox");

        WebElement tuesday = driver.findElement(By.id("gwt-debug-cwCheckBox-Tuesday-input"));

        System.out.println("tuesday.isDisplayed() = " + tuesday.isDisplayed());
        System.out.println("tuesday.isEnabled() = " + tuesday.isEnabled());
        System.out.println("tuesday.isSelected() = " + tuesday.isSelected());
        MyFunc.Wait(1);
        tuesday.click();
        MyFunc.Wait(1);
        System.out.println("tuesday.isSelected() = " + tuesday.isSelected());


        WebElement saturday = driver.findElement(By.id("gwt-debug-cwCheckBox-Saturday-input"));
        MyFunc.Wait(1);
        System.out.println("saturday.isDisplayed() = " + saturday.isDisplayed());
        System.out.println("saturday.isEnabled() = " + saturday.isEnabled());
        System.out.println("saturday.isSelected() = " + saturday.isSelected());
        MyFunc.Wait(1);


        WaitAndQuit();
    }

}
