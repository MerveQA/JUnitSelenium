package Day7_Iframe_WindowHandles;

import com.github.javafaker.Faker;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.BaseTest;

import java.util.List;

public class C02_IframeExamle extends BaseTest {
    // https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/ sitesine gidiniz.
    // Web sitesini maximize yapınız.
    // İkinci emojiye tıklayınız.
    // Tüm ikinci emoji öğelerine tıklayınız.
    // Parent iframe geri dönünüz.
    // Formu doldurun (Formu istediğiniz metinlerle doldurun) apply button'a basınız.

    @Test
    public void test(){
        // https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/ sitesine gidiniz.
        driver.get("https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/");

        // İkinci emojiye tıklayınız.
        driver.switchTo().frame("emoojis");
        driver.findElement(By.xpath("//a[contains(@href,'nature')]")).click();

        // Tüm ikinci emoji öğelerine tıklayınız.
        List<WebElement> liste = driver.findElements(By.xpath("//div[@id='nature']//img"));

        for (WebElement e : liste){
           e.click();
        }

        // Parent iframe geri dönünüz.
        driver.switchTo().defaultContent();

        // Formu doldurun (Formu istediğiniz metinlerle doldurun) apply button'a basınız.
        Faker faker = new Faker();
        driver.findElement(By.xpath("//input[@id='text']")).sendKeys("merhaba");
        driver.findElement(By.xpath("//input[@id='smiles']")).sendKeys("gulumse");
       WebElement place =  driver.findElement(By.xpath("//input[@id='places']"));
place.sendKeys(faker.name().fullName());
        driver.findElement(By.id("send")).click();






    }
}
