package _05_StatusOfElements_Actions;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _09_DragAndDropBy extends BaseDriver {

    @Test
    public void Test01() {

        driver.get("https://talkerscode.com/webtricks/demo/demo_price-range-slider-using-jquery-css-and-php.php");
        Actions actions = new Actions(driver);

        WebElement leftHolder = driver.findElement(By.xpath("//div[@id='slider-range']/span[1]"));
        MyFunc.Wait(1);

        Action action = actions.dragAndDropBy(leftHolder, 100, 0).build();
        action.perform();

        WaitAndQuit();
    }

    @Test
    public void Test02() {


        WaitAndQuit();
    }

    @Test
    public void Test03() {


        WaitAndQuit();
    }

}
