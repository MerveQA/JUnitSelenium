package Day1_SeleniumMaven;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_Assertions {
    //    Go to Amazon homepage.
    //    Do the following tasks by creating 3 different test methods.
    //    1- Test if the URL contains Amazon.
    //    2- Test if the title does not contain Facebook.
    //    3- Test that the Amazon logo appears in the upper left corner.

    WebDriver driver;

    @Before
    public void before() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @After
    public void after() {
        driver.quit();
    }

    @Test
    public void URLTest() {
        driver.get("https://www.amazon.com.tr/");
        String currentURL = driver.getCurrentUrl();

        Assert.assertTrue("URL 'Amazon' içermiyor", currentURL.contains("Amazon"));
    }

    @Test  // icermiyor dediginden false kullanıyoruz
    public void TitleTest() {
        driver.get("https://www.amazon.com.tr/");
        String pageTitle = driver.getTitle();

        Assert.assertFalse("Title 'Facebook' icermiyor ",pageTitle.contains("Facebook"));
    }

    @Test
    public void LogoNavigateTest() {
        driver.get("https://www.amazon.com.tr/");

        WebElement logo = driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));
        logo.isDisplayed();
        Assert.assertTrue(logo.isDisplayed());
    }



}
