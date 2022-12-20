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

public class HomePage01 {

    // 1) Open the browser
    // 2) Enter the URL “http://practice.automationtesting.in/”
    // 3) Click on Shop Menu
    // 4) Now click on Home menu button
    // 5) Test whether the Home page has Three Sliders only
    // 6) The Home page must contains only three sliders

    WebDriver driver;

    @Before
    public void setup() {
        // 1) Open the browser
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    @After
    public void teardown() {
      //  driver.quit();
    }

    @Test
    public void test() {
        // 2) Enter the URL “http://practice.automationtesting.in/”
        driver.get("http://practice.automationtesting.in/");

        // 3) Click on Shop Menu
        WebElement shop = driver.findElement(By.xpath("//a[text()='Shop']"));
        shop.click();

        // 4) Now click on Home menu button
        WebElement home = driver.findElement(By.xpath("//a[text()='Home']"));
        home.click();

        // 5) Test whether the Home page has Three Sliders only
        List<WebElement> imgList = driver.findElements(By.xpath("/img[@class='n2-ss-slide-background-image n2-ss-slide-fill n2-ow']"));

        // 6) The Home page must contains only three sliders
        int expectedImg = 3;
        int actualImg = imgList.size();
        Assert.assertEquals(expectedImg, actualImg);


    }
}
