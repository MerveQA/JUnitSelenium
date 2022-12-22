package Day4_LocatorPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HomeWork01 {

    //  https://id.heroku.com/login sayfasına gidiniz.
    //  Bir mail adresi giriniz.
    //  Bir password giriniz.
    //  Login butonuna tıklayınız.
    //  "There was a problem with your login." text görünür ise "Kayıt Yapılamadı" yazdırınız.
    //  Eğer yazı görünür değilse "Kayıt Yapıldı" yazdırınız.
    //  Tüm sayfaları kapatınız.

    WebDriver driver;

    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    @After
    public void tearDown() {
        //  Tüm sayfaları kapatınız.
        driver.quit();
    }

    @Test
    public void Test() {
        //  https://id.heroku.com/login sayfasına gidiniz.
        driver.get("https://id.heroku.com/login");

        //  Bir mail adresi giriniz.
        WebElement buttonEmail = driver.findElement(By.xpath("//input[@id='email']"));
        buttonEmail.sendKeys("merveabd_61@hotmail.com");

        //  Bir password giriniz.
        WebElement buttonPassword = driver.findElement(By.xpath("//input[@id='password']"));
        buttonPassword.sendKeys("123456");

        //  Login butonuna tıklayınız.
        WebElement buttonLogin = driver.findElement(By.xpath("//button[@name]"));
        buttonLogin.click();

        //  "There was a problem with your login." text görünür ise "Kayıt Yapılamadı" yazdırınız.
        WebElement text = driver.findElement(By.xpath("//div[text()='There was a problem with your login.']"));

        if (text.isDisplayed()) {
            System.out.println("Kayıt Yapılamadı");
        } else {
            System.out.println("Kayıt Yapıldı");
        }





    }
}
