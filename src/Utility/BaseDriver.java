package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class BaseDriver {

    public static WebDriver driver;

    static  {  //  if only static is there, its automatically starts at the top of the code page.
        driver = new ChromeDriver();
        driver.manage().window().maximize(); // makes fullScreen
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20)); // loading page wait till 30sec, or ERROR
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // find element wait till 30sec, or ERROR
    }

    public static void WaitAndQuit(){
        MyFunc.Wait(3);
        driver.quit();
    }

}
