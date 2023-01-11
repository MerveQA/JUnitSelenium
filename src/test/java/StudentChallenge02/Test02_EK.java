package StudentChallenge02;

import com.github.javafaker.Faker;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import utilities.BaseTest;

public class Test02_EK extends BaseTest {
    @Test
    public void test02() {
        // 1. "https://facebook.com" adresine gidin.
        driver.get("https://facebook.com");
        // 2. "Create New Account" butonuna basın.
        WebElement account = driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
        account.click();

        // 3. "firstName" giriş kutusuna bir isim yazın.
        // 4. "surname" giriş kutusuna bir soyisim yazın.
        // 5. "email" giriş kutusuna bir email yazın.
        // 6. "email" onay kutusuna emaili tekrar yazın.
        // 7. Bir şifre girin.
        // 8. Tarih için gün seçin.
        // 9. Tarih için ay seçin.
        // 10. Tarih için yıl seçin.
        // 11. Cinsiyeti seçin.
        Faker faker = new Faker();
        Actions actions = new Actions(driver);
        String email = faker.internet().emailAddress();
        WebElement name = driver.findElement(By.name("firstname"));
        actions.click(name).sendKeys(faker.name().firstName()).sendKeys(Keys.TAB)
                .sendKeys(faker.name().lastName()).sendKeys(Keys.TAB)
                .sendKeys(email).sendKeys(Keys.TAB)
                .sendKeys(email).sendKeys(Keys.TAB)
                .sendKeys(faker.internet().password()).sendKeys(Keys.TAB).sendKeys(Keys.TAB)
                .sendKeys(String.valueOf(faker.number().numberBetween(1,31))).sendKeys(Keys.TAB)
                .sendKeys("Haz").sendKeys(Keys.TAB)
                .sendKeys(String.valueOf(faker.number().numberBetween(1980,2000))).sendKeys(Keys.TAB).sendKeys(Keys.TAB)
                // ARROW_RİGHT ok tuslarıyla saga dogru gider
                .sendKeys(Keys.ARROW_RIGHT).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER).perform();

        // 12. İşaretlediğiniz cinsiyetin seçili, diğer cinsiyet kutularının seçili olmadığını doğrulayın.
        WebElement womanButton = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
        WebElement manButton = driver.findElement(By.xpath("(//input[@class='_8esa'])[2]"));
        WebElement otherbutton = driver.findElement(By.xpath("(//input[@class='_8esa'])[3]"));

        Assert.assertTrue(manButton.isSelected());
        Assert.assertFalse(womanButton.isSelected());
        Assert.assertFalse(otherbutton.isSelected());
        // 13. Sayfayı kapatın.
        driver.close();

    }
}
