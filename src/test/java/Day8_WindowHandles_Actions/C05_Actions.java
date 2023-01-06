package Day8_WindowHandles_Actions;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.BaseTest;

public class C05_Actions extends BaseTest {

    @Test
    public void hoverover() {
        // amazona git
        driver.get("https://www.amazon.com/");

        // click on "hello,sign in .."
        WebElement c = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
        Actions act = new Actions(driver);
        act.moveToElement(c).perform();

        // click on order page
        WebElement d = driver.findElement(By.xpath("//a[@id='nav_prefetch_yourorders']"));
        d.click();

        // verify the page title contains amazon
        Assert.assertEquals("Amazon Sign-In", driver.getTitle());
    }
}
