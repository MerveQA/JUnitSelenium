package Day9_JSEScroll_Cookies_Files;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import utilities.BaseTest;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class C9_FileDownload extends BaseTest {
    @Test
    public void fileDownloaded() throws InterruptedException {
        // Go to URL: https://opensource-demo.orangehrmlive.com/
        // Login page valid credentials.
        // Download sample CSV file.(PIM TIKLA  )
        // Verify if the file downloaded successfully.

        // Go to URL: https://opensource-demo.orangehrmlive.com/
        driver.get("https://opensource-demo.orangehrmlive.com/");

        // Login page valid credentials
        WebElement username = driver.findElement(By.xpath("//input[@placeholder='Username']"));
        Actions action = new Actions(driver);
        action.sendKeys("Admin").sendKeys(Keys.TAB).sendKeys("admin123").sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
        WebElement pmi = driver.findElement(By.xpath("(//a[@class='oxd-main-menu-item'])[2]"));
        pmi.click();

        WebElement con = driver.findElement(By.xpath("//span[text()='Configuration ']"));
        con.click();
        WebElement data = driver.findElement(By.xpath("//a[text()='Data Import']"));
        data.click();
        WebElement link = driver.findElement(By.xpath("//a[@class='download-link']"));
        link.click();

        Thread.sleep(5000);
       // file nın inecegı yeri aldık + arkasına dosyanın ismini ekledik
        String downloadPath = "C:\\Users\\Asus\\Downloads\\importData.csv";
        Files.exists(Paths.get(downloadPath));
        Assert.assertTrue("Dosya bulunamadı",Files.exists(Paths.get(downloadPath)));


    }
}
