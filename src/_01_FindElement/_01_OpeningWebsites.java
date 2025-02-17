package _01_FindElement;

import Utility.MyFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_OpeningWebsites {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.hepsiburada.com/");


        MyFunc.Wait(3);
//        driver.close(); // only close this one
        driver.quit(); // deletinf all of them
    }
}
