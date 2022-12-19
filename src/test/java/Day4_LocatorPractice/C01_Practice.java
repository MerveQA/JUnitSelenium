package Day4_LocatorPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;


public class C01_Practice {

     // Navigate to website  https://testpages.herokuapp.com/styled/index.html
     // Under the ORIGINAL CONTENTS
     // Click on Alerts
     // Print the UR
     // Navigate back
     // Print the UR
     // Click on Basic Ajax
     // Print the UR
     // Enter value  20 and Ente
     // And then verify Submitted Values is displayed open pag
     // Close driver.


    static WebDriver driver;

    @BeforeClass
    public static void beforeEach(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    @Before
    public void before() {
        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");
    }

   @AfterClass
    public static void tearDown(){
        // varsa raporlama da yapılabilir
        driver.quit();
    }

    @Test
    public void test(){

        WebElement alerts = driver.findElement(By.xpath("//a[@id='alerts']"));
        alerts.click();

        String alertsURL = driver.getCurrentUrl();
        System.out.println(alertsURL);

        driver.navigate().back();

        String homeURL = driver.getCurrentUrl();
        System.out.println(homeURL);

        WebElement basicAjax = driver.findElement(By.xpath("//a[@id='basicajax']"));
        basicAjax.click();

        String basicAjaxURL = driver.getCurrentUrl();
        System.out.println(basicAjaxURL);

        WebElement button = driver.findElement(By.xpath("//input[@id='lteq30']"));
        button.sendKeys("20", Keys.ENTER);

        WebElement submitted = driver.findElement(By.xpath("//p[text()='Submitted Values']"));
        Assert.assertTrue(submitted.isDisplayed());
        // Assert.assertEquals(true,submitted.isDisplayed());

    }




}
