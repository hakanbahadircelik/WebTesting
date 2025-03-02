package _08_Windows;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.devtools.v85.backgroundservice.BackgroundService;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

public class _03_RobotClass extends BaseDriver {

    @Test
    public void Test01() throws AWTException {

        driver.get("https://www.google.com/");
        MyFunc.Wait(1);

        // press ctrl, while pressing, press T
        // release T, release ctrl
        // * new page opened *

        Robot robot = new Robot();

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_T);

        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_T);

        MyFunc.Wait(1);
        // switching page with selenium windows

        Set<String> windowsIDs = driver.getWindowHandles();
        Iterator iterator = windowsIDs.iterator();
        String firstPage = iterator.next().toString();
        String secondPage = iterator.next().toString();
//        System.out.println("firstPage = " + firstPage);
//        System.out.println("secondPage = " + secondPage);

        MyFunc.Wait(1);
        driver.switchTo().window(secondPage);
        driver.get("https://www.facebook.com/");


        WaitAndQuit();
    }
}
