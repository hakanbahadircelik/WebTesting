package _08_Windows;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.Dimension;

import java.awt.*;

public class _08_WindowSize extends BaseDriver {

    @Test
    public void Test01(){

        driver.get("https://www.youtube.com/");
        MyFunc.Wait(2);

        driver.manage().window().maximize();
        Dimension screenSize = driver.manage().window().getSize();
        System.out.println("screenSize.width = " + screenSize.width);
        System.out.println("screenSize.height = " + screenSize.height);

        Dimension newSize = new Dimension(516,600);
        driver.manage().window().setSize(newSize);



        WaitAndQuit();
    }
}
