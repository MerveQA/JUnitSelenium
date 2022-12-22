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
     // Print the URL
     // Navigate back
     // Print the URL
     // Click on Basic Ajax
     // Print the URL
     // Enter value  20 and Enter
     // And then verify Submitted Values is displayed open page
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
        // Navigate to website  https://testpages.herokuapp.com/styled/index.html
        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");
    }

   @AfterClass
    public static void tearDown(){
        // varsa raporlama da yapılabilir
        // Close driver.
        driver.quit();
    }

    @Test
    public void test(){
        // Under the ORIGINAL CONTENTS

        // Click on Alerts
        WebElement alerts = driver.findElement(By.xpath("//a[@id='alerts']"));
        alerts.click();

        // Print the URL
        String alertsURL = driver.getCurrentUrl();
        System.out.println(alertsURL);

        // Navigate back
        driver.navigate().back();

        // Print the URL
        String homeURL = driver.getCurrentUrl();
        System.out.println(homeURL);

        // Click on Basic Ajax
        WebElement basicAjax = driver.findElement(By.xpath("//a[@id='basicajax']"));
        basicAjax.click();

        // Print the URL
        String basicAjaxURL = driver.getCurrentUrl();
        System.out.println(basicAjaxURL);

        // Enter value  20 and Enter
        WebElement button = driver.findElement(By.xpath("//input[@id='lteq30']"));
        button.sendKeys("20", Keys.ENTER);

        // And then verify Submitted Values is displayed open page
        WebElement submitted = driver.findElement(By.xpath("//p[text()='Submitted Values']"));
        Assert.assertTrue(submitted.isDisplayed());
        // Assert.assertEquals(true,submitted.isDisplayed());

    }




}
