package _05_StatusOfElements_Actions;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _10_ActionMouseWheel extends BaseDriver {

    @Test
    public void Test01(){  // scroll to element

        driver.get("http://selenium.dev/selenium/web/scrolling_tests/frame_with_nested_scrolling_frame_out_of_view.html");
        MyFunc.Wait(1);
        WebElement iframe = driver.findElement(By.name("nested_scrolling_frame"));

        new Actions(driver).scrollToElement(iframe).build().perform();

        WaitAndQuit();
    }

    @Test
    public void Test02(){  // scroll a little bit

        driver.get("http://selenium.dev/selenium/web/scrolling_tests/frame_with_nested_scrolling_frame_out_of_view.html");
        MyFunc.Wait(1);
        WebElement iframe = driver.findElement(By.name("nested_scrolling_frame"));

        new Actions(driver).scrollByAmount(0,1000).build().perform();

        WaitAndQuit();
    }

//    @Test
//    public void Test03(){  // step by step scroll till an element
//
//        driver.get("http://selenium.dev/selenium/web/scrolling_tests/frame_with_nested_scrolling_frame_out_of_view.html");
//        MyFunc.Wait(1);
//        WebElement iframe = driver.findElement(By.name("nested_scrolling_frame"));
//
//        new Actions(driver).scrollFromOrigin().build().perform();
//
//        WaitAndQuit();
//    }

}
