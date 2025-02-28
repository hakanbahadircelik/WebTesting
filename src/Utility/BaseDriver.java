package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.LoggerFactory;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseDriver {

    private static final org.slf4j.Logger log = LoggerFactory.getLogger(BaseDriver.class);

    public static WebDriver driver;

    public static WebDriverWait wait;

    static  {  //  if only static is there, its automatically starts at the top of the code page.

        Logger logger = Logger.getLogger(""); // get output logs
        logger.setLevel(Level.SEVERE); // show only errors

        driver = new ChromeDriver();
        driver.manage().window().maximize(); // makes fullScreen
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20)); // loading page wait till 30sec, or ERROR
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // find element wait till 30sec, or ERROR
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    public static void WaitAndQuit(){
        MyFunc.Wait(3);
        driver.quit();
    }

}
