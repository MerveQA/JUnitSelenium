package Day3_LocatorPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;
import java.time.Duration;

public class C01_Practice {

    //    Go to https://www.linkedin.com/
    //    When we write an e-mail without the @ sign in the e-mail box and press enter.
    //    Let's test the "Invalid email address" warning.

   WebDriver driver;

   @Before
   public void setup() {

      WebDriverManager.chromedriver().setup();
      driver = new ChromeDriver();

      //sayfanin yuklenmesi beklendi
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


      driver.manage().window().maximize();
   }

   @After
   public void after() {

     // driver.quit();
   }


   @Test
   public void xpathTest() {
      // linked e git
      driver.get("https://www.linkedin.com/");

      // email alanına @ sembolu bulunmayan bir email gir
      // bunun için once elementi bul
      // mesajı yaz gonder
      // entere bas
      driver.findElement(By.id("session_key")).sendKeys("merveabdgmail.com"+ Keys.ENTER);

      // 2.yol
      // x path ile de yapabiliriz .
      // elementimin yolu ---> //input[@id='session_key']
      //   driver.findElement(By.xpath("//input[@id='session_key']")).sendKeys("merveabdgmail.com");

     WebElement alert =  driver.findElement(By.xpath("//p[@class='alert-content']"));

     // 1.yol
     Assert.assertTrue(alert.isDisplayed());
     Assert.assertTrue("Lütfen geçerli bir e-posta adresi veya cep numarası girin.",alert.isDisplayed());

      // 2.yol 3.yol
      // Assert.assertEquals(true,alert.isDisplayed());
      // Assert.assertFalse(!alert.isDisplayed());
      // Assert.assertTrue("Lütfen geçerli bir e-posta adresi veya cep numarası girin.",alert.isDisplayed());


   }





}
