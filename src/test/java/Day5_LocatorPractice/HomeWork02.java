package Day5_LocatorPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HomeWork02 {
    //  Go to URL: https://demoqa.com/radio-button
    //  Soruya verilen 3 seçeneğin de seçilme durumlarını doğrulayınız.
    //  Her bir seçenek seçildiğinde aşağıda çıkan text’leri konsolda yazdırınız.

    @Test
    public void Test(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        //  Go to URL: https://demoqa.com/radio-button
        driver.get("https://demoqa.com/radio-button");

        // Soruya verilen 3 seçeneğin de seçilme durumlarını doğrulayınız.
        // 1.yol
        // yesRadioButton Kontrol
        WebElement yesRadioButton =driver.findElement(By.xpath("//label[text()='Yes']"));
        yesRadioButton.click();
        WebElement yesRadioButtonKontrol =driver.findElement(By.xpath("//input[@id='yesRadio']"));
        Assert.assertTrue(yesRadioButtonKontrol.isSelected());
        String textYes = driver.findElement(By.xpath("//span[text()='Yes']")).getText();
        System.out.println(textYes);

        // impressiveRadioButton Kontrol
        WebElement impressiveRadioButton =driver.findElement(By.xpath("//label[text()='Impressive']"));
        impressiveRadioButton.click();
        WebElement impressiveRadioButtonKontrol =driver.findElement(By.xpath("//input[@id='impressiveRadio']"));
        Assert.assertTrue(impressiveRadioButtonKontrol.isSelected());
        String textImpressive = driver.findElement(By.xpath("//span[text()='Impressive']")).getText();
        System.out.println(textImpressive);

        // noRadioButton Kontrol
        WebElement noRadioButton =driver.findElement(By.xpath("//label[text()='No']"));
        noRadioButton.click();
        WebElement noRadioButtonKontrol =driver.findElement(By.xpath("//input[@id='noRadio']"));
        Assert.assertFalse(noRadioButtonKontrol.isSelected());

        // quit
        driver.quit();

    }

}
