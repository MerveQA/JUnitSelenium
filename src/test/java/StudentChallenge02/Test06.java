package StudentChallenge02;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.BaseTest;

public class Test06 extends BaseTest {
    /*
    1- https://html.com/tags/iframe/ sayfasına gidelim.
    2- Video'yu görecek kadar aşağı inin.
    3- Videoyu izlemek için Play tuşuna basın.
    4- Videoyu çalıştırdığınızı test edin.
*/

    @Test
    public void test06() {
        //1- https://html.com/tags/iframe/ sayfasına gidelim.
        driver.get("https://html.com/tags/iframe/");
        //2- Video'yu görecek kadar aşağı inin.
        // 2 yolumuz var 1.yol -- actions classından
        //               2.uol -- jsExecute

        Actions action = new Actions(driver);
        action.sendKeys(Keys.PAGE_DOWN).perform();

        //3- Videoyu izlemek için Play tuşuna basın.

        // Iframe nedir ? sayfa içinde sayfa (gomulu)
        driver.switchTo().frame(driver.findElement(By.xpath("(//iframe[@frameborder='0'])[1]")));
        WebElement videoButton = driver.findElement(By.xpath("//button[@class='ytp-large-play-button ytp-button ytp-large-play-button-red-bg']"));
        action.click(videoButton).perform();

        //4- Videoyu çalıştırdığınızı test edin.
        Assert.assertFalse(videoButton.isDisplayed());

    }

}
