package Day9_JSEScroll_Cookies_Files;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.BaseTest;

import java.awt.*;

public class C10_FileUpload extends BaseTest {

    @Test
    public void fileUpload() throws AWTException {
        //  Go to URL: https://the-internet.herokuapp.com/upload
        //  Find the path of the file that you want to upload.
        //  Click on Upload button.
        //  Verify the upload message.

        driver.get("https://the-internet.herokuapp.com/upload");
        WebElement dosyaSec = driver.findElement(By.id("file-upload"));
        dosyaSec.sendKeys("C:\\Users\\Asus\\Desktop\\5.jfif");
        WebElement upload = driver.findElement(By.id("file-submit"));
        upload.click();
        Assert.assertTrue(driver.findElement(By.tagName("h3")).getText().contains("Upload"));
        Assert.assertTrue(driver.findElement(By.tagName("h3")).isDisplayed());



    }
}
