package StudentChallenge02;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.BaseTest;

public class Test02 extends BaseTest {

    /*
    1. "https://facebook.com" adresine gidin.
    2. "Create New Account" butonuna basın.
    3. "firstName" giriş kutusuna bir isim yazın.
    4. "surname" giriş kutusuna bir soyisim yazın.
    5. "email" giriş kutusuna bir email yazın.
    6. "email" onay kutusuna emaili tekrar yazın.
    7. Bir şifre girin.
    8. Tarih için gün seçin.
    9. Tarih için ay seçin.
    10. Tarih için yıl seçin.
    11. Cinsiyeti seçin.
    12. İşaretlediğiniz cinsiyetin seçili, diğer cinsiyet kutularının seçili olmadığını doğrulayın.
    13. Sayfayı kapatın.
*/

    @Test
    public void test02() {
        // 1. "https://facebook.com" adresine gidin.
        driver.get("https://facebook.com");
        // 2. "Create New Account" butonuna basın.
        WebElement account = driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
        account.click();
        // 3. "firstName" giriş kutusuna bir isim yazın.
        WebElement name = driver.findElement(By.name("firstname"));
        name.sendKeys("merve");
        // 4. "surname" giriş kutusuna bir soyisim yazın.
        WebElement lastname = driver.findElement(By.name("lastname"));
        lastname.sendKeys("koşar");
        // 5. "email" giriş kutusuna bir email yazın.
        WebElement email = driver.findElement(By.name("reg_email__"));
        email.sendKeys("merveabd_61@hotmail.com");
        // 6. "email" onay kutusuna emaili tekrar yazın.
        WebElement repeatBox = driver.findElement(By.name("reg_email_confirmation__"));
        repeatBox.sendKeys("merveabd_61@hotmail.com");
        // 7. Bir şifre girin.
        WebElement password = driver.findElement(By.name("reg_passwd__"));
        password.sendKeys("1234554321");

        // 8. Tarih için gün seçin.
        Select selecta = new Select(driver.findElement(By.name("birthday_day")));
        selecta.selectByVisibleText("15");
        // 9. Tarih için ay seçin.
        Select selectb = new Select(driver.findElement(By.name("birthday_month")));
        selectb.selectByVisibleText("Haz");
        // 10. Tarih için yıl seçin.
        Select selectc = new Select(driver.findElement(By.name("birthday_year")));
        selectc.selectByVisibleText("1986");
        // 11. Cinsiyeti seçin.
        WebElement womanButton = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
        womanButton.click();
        // 12. İşaretlediğiniz cinsiyetin seçili, diğer cinsiyet kutularının seçili olmadığını doğrulayın.
        WebElement manButton = driver.findElement(By.xpath("(//input[@class='_8esa'])[2]"));
        WebElement otherbutton = driver.findElement(By.xpath("(//input[@class='_8esa'])[3]"));
        Assert.assertTrue(womanButton.isSelected());
        Assert.assertFalse(manButton.isSelected());
        Assert.assertFalse(otherbutton.isSelected());
        // 13. Sayfayı kapatın.
        driver.close();

    }
}
