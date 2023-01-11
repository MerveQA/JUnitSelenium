package StudentChallenge02;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.BaseTest;

import java.util.Set;

public class Test07 extends BaseTest {

    /*
    1- https://the-internet.herokuapp.com/context_menu sitesine gidelim.
    2- Çizili alan üzerinde sağ click yapalım.
    3- Alert'te çıkan yazının "You selected a context menu" olduğunu test edelim.
    4- Tamam diyerek Alert'i kapatalım.
    5- Elemental Selenium linkine tıklayalım.
    6- Açılan sayfada h1 tagında "Elemental Selenium" yazdığını test edelim.
 */
    @Test
    public void test07() {
        // 1- https://the-internet.herokuapp.com/context_menu sitesine gidelim.
        driver.get("https://the-internet.herokuapp.com/context_menu");
        // 2- Çizili alan üzerinde sağ click yapalım.
        Actions action = new Actions(driver);
        WebElement square = driver.findElement(By.id("hot-spot"));
        action.moveToElement(square).contextClick().perform();
        // 3- Alert'te çıkan yazının "You selected a context menu" olduğunu test edelim.
        String alertText = driver.switchTo().alert().getText();
        Assert.assertTrue(alertText.contains("You selected a context menu"));
        // 4- Tamam diyerek Alert'i kapatalım.
        driver.switchTo().alert().accept();
        // 5- Elemental Selenium linkine tıklayalım.
        String firstPage = driver.getWindowHandle();
        WebElement link = driver.findElement(By.linkText("Elemental Selenium"));
        link.click();
    //    // 6- Açılan sayfada h1 tagında "Elemental Selenium" yazdığını test edelim.
        Set<String> allWindowsHndles = driver.getWindowHandles();

        String secondWindow = "";

       for (String window : allWindowsHndles) {
            if (!window.equals(firstPage)) {
                secondWindow = window;
            }
        }
        driver.switchTo().window(secondWindow);
       Assert.assertEquals("Elemental Selenium",driver.findElement(By.tagName("h1")).getText());
    }


}
