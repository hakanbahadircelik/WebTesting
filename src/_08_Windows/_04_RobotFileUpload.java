package _08_Windows;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class _04_RobotFileUpload extends BaseDriver {

    @Test
    public void Test01() throws AWTException {

        driver.get("https://demo.guru99.com/test/upload/");
        MyFunc.Wait(3);

        Robot robot = new Robot();

        for (int i = 0; i < 15; i++) {
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
        }

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        //  shift + right-click to the file -> click 'copy as path'
        //  "C:\Users\hakan\OneDrive\Desktop\acceptCkies.png"
        //  we need to write ' // ' for understand the intelij


        StringSelection file = new StringSelection("C:\\Users\\hakan\\OneDrive\\Desktop\\acceptCkies.png");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(file, null);

        MyFunc.Wait(1);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);

        // go to checklist
        for (int i = 0; i < 2; i++) {
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
        }

        // click checklist
        robot.keyPress(KeyEvent.VK_SPACE);
        robot.keyRelease(KeyEvent.VK_SPACE);

        // go to submit
        for (int i = 0; i < 2; i++) {
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
        }

        // click submit
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        WebElement msg =
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='has been successfully uploaded.']")));
        Assert.assertTrue(msg.isDisplayed());


        WaitAndQuit();
    }
}
