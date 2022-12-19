package Day2_WebElementLocators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C01_Locators {

    WebDriver driver;

    @Before
    public void setup() {

        //Driver olusturuldu
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        //sayfanin yuklenmesi beklendi
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //LinkedIn sitesine gidildi
        driver.get("https://www.linkedin.com/");

        // driver imiz maximize edildi
        driver.manage().window().maximize();
    }

    @After
    public void tearDown(){
        driver.quit();
    }


    @Test
    public void idLocator() {
  // ıdLocator --> "session_key"

        WebElement email = driver.findElement(By.id("session_key"));
        // web elemwnt dondurur
        email.sendKeys("merve@gmail.com");
        // email alanına mesaj yolladık
    }

    @Test
    public void nameLocator(){
        // nameLocator --> name="session_password"
        WebElement password =  driver.findElement(By.name("session_password"));
        password.sendKeys("sifre");
    }

    @Test
    public void classLocation(){   // claaName
        // classLocator --> input__input
        WebElement email = driver.findElement(By.className("input__input"));
        email.sendKeys("Class Location test");
    }

    @Test
    public void tagNameLocator(){
        // tag locator -> "input"

        List<WebElement> emailList = driver.findElements(By.tagName("input"));

        // 2. elementimiz email text alanimiz. Bu yuzden bu elemani email degiskenine assign ettik.
        WebElement email = emailList.get(1);

        email.sendKeys("Tag locator test");

    }

    @Test
    public void linkTestLocation(){
       // link Locator = Şifrenizi mi unuttunuz?

        WebElement sifreMiUnuttun = driver.findElement(By.linkText("Şifrenizi mi unuttunuz?"));
        sifreMiUnuttun.click();

    }

    @Test
    public void partiallinkTestLocation(){
        // link Locator = Şifrenizi mi unuttunuz?

        WebElement sifreMiUnuttun = driver.findElement(By.partialLinkText("Şifrenizi"));
        sifreMiUnuttun.click();

    }

    @Test
    public void absouleteXPath(){

        // cok tercıh edilmemeli
        // herhangi bir elementin herhangi bir zamanda yolu degişirse tum kod gecersiz olur
        WebElement email = driver.findElement(By.xpath("/html/body/main/section[1]/div/div/form/div[2]/div[1]/input"));
email.sendKeys("Basardık");
    }


    @Test
    public void relativeXPath(){
        // path ---> //input[@id='session_key']
       WebElement email  = driver.findElement(By.xpath("//input[@id='session_key']"));
        email.sendKeys("Mesaj var ... ");
    }


    @Test
    public void multipleAttributeXPath(){
        // path ---> //input[@class='input__input'][@type='text']
        WebElement email  = driver.findElement(By.xpath("//input[@class='input__input'][@type='text']"));
        email.sendKeys("Mesaj var ... ");
    }


    @Test
    public void andOrXPath(){
        // path ---> //input[@class='input__input'][@type='text']
        WebElement email  = driver.findElement(By.xpath("//input[@class='input__input'and @type='text']"));
        email.sendKeys("Mesaj var ... ");

    }


    @Test
    public void containsXPath(){
        // path ---> //input[contains(@id,'key')]
        WebElement email  = driver.findElement(By.xpath("//input[contains(@id,'key')]"));
        email.sendKeys("Mesaj var ... ");

    }

    @Test
    public void textXPath(){
        // path --->  //button[contains(text(),' Oturum')]
        WebElement email  = driver.findElement(By.xpath("//button[contains(text(),' Oturum')]"));

    }


}
