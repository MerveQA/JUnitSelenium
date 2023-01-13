package Day9_JSEScroll_Cookies_Files;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.BaseTest;

import java.awt.*;
import java.util.List;


public class C11_AssertElemetTRICK extends BaseTest {

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

        // yeniden implement edecegız

        // upload edilme mesajının göruntılendgni dgruluyor
        List<WebElement> uploadmessagelist = driver.findElements(By.tagName("h3"));
        Assert.assertEquals("Upload mesajı goruntulenemedi",1, uploadmessagelist.size());

        WebElement uploadmesseage = uploadmessagelist.get(0);
        Assert.assertTrue(uploadmesseage.isDisplayed());
        Assert.assertEquals("istenilen gibi goruntulenemiyor","File Upload!",uploadmesseage.getText());


    }
}
