package Team10_Working;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class HomePage01EK {

    WebDriver driver;

    @Before
    public void setup(){
        //Driver ile ilgili her turlu initial(baslangic) islemi burada yapilir
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    @After
    public void tearDown(){
        // test sonrasinda driver kapatmak (varsa raporlari dosyalamak) icin kullanilir.
        //driver.quit();
    }

    @Test
    public void homepageone() {

        /*
        1) Open the browser
        2) Enter the URL “http://practice.automationtesting.in/”
        3) Click on Shop Menu
        4) Now click on Home menu button
        5) Test whether the Home page has Three Sliders only
        6) The Home page must contains only three sliders
         */

        //02..
        driver.get("http://practice.automationtesting.in");
        //03
        driver.findElement(By.xpath("//a[text()='Shop']")).click();
        // 04..
        driver.findElement(By.xpath("//a[text()='Home']")).click();
        //05-06..
        List<WebElement> listres= driver.findElements(By.xpath("//img[@class='n2-ss-slide-background-image n2-ss-slide-fill n2-ow']"));

        int expected =3;
        int actual =listres.size();
        Assert.assertEquals(expected,actual);


    }
}
