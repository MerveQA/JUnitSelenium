package Day5_LocatorPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02_Task {

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

    WebDriver driver;

    @Before
    public void setup() {
        //Driver ile ilgili her turlu initial(baslangic) islemi burada yapilir
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    @After
    public void tearDown() {
        // test sonrasinda driver kapatmak (varsa raporlari dosyalamak) icin kullanilir.
        driver.quit();
    }

    @Test
    public void teknosaTest() {
        driver.get("https://www.teknosa.com/");
        driver.findElement(By.xpath("//input[@id='search-input']")).sendKeys("oppo", Keys.ENTER);

        WebElement result = driver.findElement(By.xpath("//div[@class='plp-info']"));
        System.out.println(result.getText());

        List <WebElement> elementList = driver.findElements(By.xpath("//a[@class='prd-link']"));
        elementList.get(0).click();

        List <WebElement> sepetList = driver.findElements(By.xpath("//button[@id='addToCartButton']"));
        sepetList.get(0).click();

        driver.findElement(By.xpath("//a[@class='btn btn-secondary']")).click();
        System.out.println(driver.findElement(By.xpath("//a[@class='link-back-lg cart-back']")).getText());

        driver.findElement(By.xpath("//a[@class='btn btn-primary js-checkout-controls']")).click();
        System.out.println(driver.findElement(By.xpath("//div[@class='lrp-title']")).getText());
    }
}
