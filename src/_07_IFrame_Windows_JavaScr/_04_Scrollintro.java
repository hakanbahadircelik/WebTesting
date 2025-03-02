package _07_IFrame_Windows_JavaScr;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;

public class _04_Scrollintro extends BaseDriver {

    @Test
    public void Test01() {

        driver.get("http://selenium.dev/selenium/web/scrolling_tests/frame_with_nested_scrolling_frame_out_of_view.html");

        // Actions actions = new Actions(driver);

        JavascriptExecutor js = (JavascriptExecutor) driver; // casting
        js.executeScript("window.scrollTo(0, 500);");

        // js.executeScript("window.scrollBy(0, 500);");   -> from where is belonged dragging
        // js.executeScript("window.scrollTo(0, 500);");   -> drag till where we wrote
        // js.executeScript("window.scrollTo(0, document.body.scrollHeight);");   -> drag on the bottom
        // js.executeScript("arguments[0].scrollIntoView(true);", element);   -> drag till the element

        // element.click -> normal click
        // action.click -> action click

        WaitAndQuit();
    }
}
