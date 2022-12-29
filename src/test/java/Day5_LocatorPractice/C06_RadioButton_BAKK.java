package Day5_LocatorPractice;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.BaseTest;

public class C06_RadioButton_BAKK extends BaseTest {
    //    Go to URL:  https://www.facebook.com/
    //    Click on Create an Account button.
    //    Then click kadın
    //    Then click erkek
    //    Validate if kafın is not selected


    @Test
    public void radioButtons() throws InterruptedException {

        //  Facebook sitesine gidildi
        driver.get("https://www.facebook.com/");

        // Click on Create an Account button.
        //a[text()='Yeni Hesap Oluştur']

        // WebElement registerButton = driver.findElement(By.xpath("//a[contains(@data-testid,'registration-form')]"));
        WebElement registerButton = driver.findElement(By.xpath("//a[text()='Yeni Hesap Oluştur']"));
        registerButton.click();


        //    Then click kadın
        //  WebElement kadinRadio = driver.findElement(By.xpath("//input[@name='sex' and @value='1']"));
        WebElement kadinRadio = driver.findElement(By.xpath("//label[text()='Kadın']"));
        // WebElement erkekRadio = driver.findElement(By.xpath("//input[@name='sex' and @value='2']"));
        WebElement erkekRadio = driver.findElement(By.xpath("//label[text()='Erkek']"));

        kadinRadio.click();

        erkekRadio.click();

     Thread.sleep(5000);
        Assert.assertFalse(kadinRadio.isSelected());
        Assert.assertTrue(erkekRadio.isSelected());  // BU NDEN OLMADIIIII !!!
    }
}
