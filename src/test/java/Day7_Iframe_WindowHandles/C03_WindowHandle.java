package Day7_Iframe_WindowHandles;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.BaseTest;

import java.util.List;
import java.util.Set;

public class C03_WindowHandle extends BaseTest {

    //    Go to URL: https://www.toolsqa.com/selenium-webdriver/window-handle-in-selenium/
    //    Print the existing windowHandles ids by clicking all the links on the page.
    //    Click on the links that open a new page.
    //    Close other pages other than the home page.
    //    Set the driver back to the main page.

    @Test
    public void handleTest() {

        //    Go to URL: https://www.toolsqa.com/selenium-webdriver/window-handle-in-selenium/
        driver.get("https://www.toolsqa.com/selenium-webdriver/window-handle-in-selenium/");

        //    Print the existing windowHandles ids by clicking all the links on the page.

        // anasayfayı kaybetmemek için bir yerde saklıyoruz
        String mainwindow = driver.getWindowHandle();
        List<WebElement> handles = driver.findElements(By.xpath("//a[@target]"));

        //    Click on the links that open a new page.
       handles.get(0).click();
       handles.get(1).click();
       handles.get(2).click();

    //    Close other pages other than the home page.
        Set<String> hndl = driver.getWindowHandles();
        for (String h : hndl){
            // sekmeler arası geciş için switchTo() kullandık
            driver.switchTo().window(h);
        if (h.equalsIgnoreCase(mainwindow)){
            continue;
        } else {
            driver.close();

        }

        }
        //    Set the driver back to the main page.
    }



}



