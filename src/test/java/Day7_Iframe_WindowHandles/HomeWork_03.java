package Day7_Iframe_WindowHandles;

import org.junit.Test;
import org.openqa.selenium.By;
import utilities.BaseTest;

import java.util.Set;

public class HomeWork_03 extends BaseTest {

    //  Go to URL: https://demoqa.com/browser-windows
    //  Click on the windows - "WindowButton"
    //  Click on all the child windows.
    //  Print the text present on all the child windows in the console.
    //  Print the heading of the parent window in the console.

    @Test
    public void test() {

        //  Go to URL: https://demoqa.com/browser-windows
        driver.get("https://demoqa.com/browser-windows");

        //  Click on the windows - "WindowButton"
        String homePageID = driver.getWindowHandle();

        //  Click on all the child windows.
        driver.findElement((By.cssSelector("button[id='tabButton']"))).click();
        driver.findElement(By.cssSelector("button[id='windowButton']")).click();

        //  Print the text present on all the child windows in the console.
        Set <String>  setWindows = driver.getWindowHandles();
        for (String s : setWindows) {
            driver.switchTo().window(s);
            if (driver.getWindowHandle().equals(homePageID)){
                continue;
            }

            System.out.println(driver.findElement(By.tagName("body")).getText());
        }

        //  Print the heading of the parent window in the console.
        System.out.println(driver.switchTo().window(homePageID).getTitle());
      //  System.out.println("driver.getTitle() = " + driver.getTitle());


    }
}
