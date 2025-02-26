package _05_StatusOfElements;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _02_SelectClass extends BaseDriver {

    @Test
    public void Test01(){

        driver.get("https://www.amazon.com/");

        WebElement webMenu = driver.findElement(By.id("searchDropdownBox"));

        Select ddMenu = new Select(webMenu);

        // 3 Different ways to find select elements

//        ddMenu.selectByIndex(4);
//        ddMenu.selectByValue("search-alias=digital-music");
        ddMenu.selectByVisibleText("Computers");

        System.out.println("ddMenu.getOptions().size() = " + ddMenu.getOptions().size());
        
        for (WebElement e : ddMenu.getOptions()){
            System.out.println("e.getText() = " + e.getText());
            System.out.println("e.getAttribute(\"value\") = " + e.getAttribute("value"));
        }

        WaitAndQuit();
    }

}
