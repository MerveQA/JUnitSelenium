package Day07;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import utilities.BaseTest;

public class HomeWork_02 extends BaseTest {
    // Go to URL: https://testproject.io/
    // Selenium's 4 newWindow() method to open a new Window for TestProject's Blog page.
    // https://blog.testproject.io/

    @Test
    public void test() {
        driver.get("https://testproject.io/");
    }

    public void newWindow(){
        WebDriver newWindow = driver.switchTo().newWindow(WindowType.WINDOW);
        newWindow.get("https://blog.testproject.io/");
    }


}
