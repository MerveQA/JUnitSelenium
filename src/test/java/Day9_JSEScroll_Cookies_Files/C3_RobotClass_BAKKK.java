package Day9_JSEScroll_Cookies_Files;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.BaseTest;

import java.awt.*;
import java.awt.event.KeyEvent;

public class C3_RobotClass_BAKKK extends BaseTest {

    @Test
    public void robot() throws AWTException, InterruptedException {

        driver.get("https://demo.guru99.com/test/upload/");
        WebElement dosyaSec = driver.findElement(By.xpath("//input[@id='uploadfile_0']"));
        // robot classlarda absulete path kullanılması daha iyi
        dosyaSec.sendKeys("C:\\Users\\Asus\\IdeaProjects\\CWJunitSelenium\\src\\test\\java\\resources\\robot.txt");

        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);   // KONTROLE BASILI TUTTUM
        robot.keyPress(KeyEvent.VK_S);         // S YE BASILI TUTTUM
        robot.keyRelease(KeyEvent.VK_CONTROL); // KONTROL TUSUNU BIRAKTIK
        robot.keyRelease(KeyEvent.VK_S);       // S TUSUNU BIRAKTIK

        robot.keyPress(KeyEvent.VK_ENTER);     // enter a bas
        robot.keyRelease(KeyEvent.VK_ENTER);   // enter ı bırak


        robot.keyPress(KeyEvent.VK_LEFT);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(20);
        robot.keyRelease(KeyEvent.VK_LEFT);
        robot.keyRelease(KeyEvent.VK_ENTER);

    }
}
