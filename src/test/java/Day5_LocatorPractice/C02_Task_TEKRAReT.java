package Day5_LocatorPractice;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.BaseTest;

public class C02_Task_TEKRAReT extends BaseTest {

    // https://www.teknosa.com/ adresine gidiniz.
    // Arama çubuğuna ''oppo'’ yazıp ENTER tıklayınız.
    // Sonuç sayısını yazdırınız.
    // Çıkan ilk ürüne tıklayınız.
    // Sepete ekleyiniz.
    // Sepetime gite tıklayınız.
    // Konsolda "Sipariş Özeti" WebElement'inin text'ini yazdırınız.
    // Alışverişi tamamlayınız.
    // Son olarak "Teknosa'ya Hoş Geldiniz" WebElement'inin text'ini yazdırınız.
    // Driver'ı kapatınız.


    @Test
    public void teknosaTest() {
        // https://www.teknosa.com/ adresine gidiniz.
        driver.get("https://www.teknosa.com/");

        // Arama çubuğuna ''oppo'’ yazıp ENTER tıklayınız.
        driver.findElement(By.xpath("//input[@id='search-input']")).sendKeys("oppo", Keys.ENTER);

        // Sonuç sayısını yazdırınız.
        WebElement result = driver.findElement(By.xpath("//div[@class='plp-info']"));
        System.out.println(result.getText());

        // Çıkan ilk ürüne tıklayınız.
        WebElement ilkUrun = driver.findElement(By.xpath("//a[@class='prd-link']"));
        ilkUrun.click();

        // Sepete ekleyiniz.
        WebElement sepetEkle = driver.findElement(By.id("addToCartFormaddToCartForm"));
        sepetEkle.click();

        // Sepetime gite tıklayınız.
        WebElement sepeteGit = driver.findElement(By.xpath("//a[@class='btn btn-secondary']"));
        sepeteGit.click();

        // Konsolda "Sipariş Özeti" WebElement'inin text'ini yazdırınız.
        // System.out.println(driver.findElement(By.xpath("//a[@class='link-back-lg cart-back']")).getText());
        System.out.println(driver.findElement(By.xpath("//div[@class='cart-sum-body']")).getText());

        // Alışverişi tamamlayınız.
        driver.findElement(By.xpath("//a[@class='btn btn-primary js-checkout-controls']")).click();

        // Son olarak "Teknosa'ya Hoş Geldiniz" WebElement'inin text'ini yazdırınız.
        System.out.println(driver.findElement(By.xpath("//div[@class='lrp-title']")).getText());




    }
}
