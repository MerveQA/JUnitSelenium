package Day8_WindowHandles_Actions;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.BaseTest;

public class C02_Actions extends BaseTest {

    @Test
    public void doubleClick() {
        driver.get("https://demoqa.com/buttons");
        WebElement act = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
        Actions actions = new Actions(driver);
        actions.doubleClick(act).perform();

        WebElement message = driver.findElement(By.xpath("//p[@id='doubleClickMessage']"));
        Assert.assertTrue(message.isDisplayed());

    }

    @Test
    public void rightClick() {
        driver.get("https://demoqa.com/buttons");
        WebElement rightButton = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
        Actions act = new Actions(driver);
        act.contextClick(rightButton).build().perform();

       WebElement message = driver.findElement(By.xpath("//p[@id='rightClickMessage']"));
       Assert.assertTrue(message.isDisplayed());

    }

    @Test
    public void click() {
        driver.get("https://demoqa.com/buttons");
        WebElement clickButton = driver.findElement(By.xpath("//button[text()='Click Me']"));
        Actions action = new Actions(driver);
        action.click(clickButton).build().perform();

        WebElement clcMess = driver.findElement(By.id("dynamicClickMessage"));
        Assert.assertTrue(clcMess.isDisplayed());

    }
}
