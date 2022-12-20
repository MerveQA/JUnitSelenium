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
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class HomePage02 {
    //   1. Launch browser
    //   2. Navigate to url 'http://automationexercise.com'
    //   3. Verify that home page is visible successfully
    //   4. Click on 'Signup / Login' button
    //   5. Verify 'New User Signup!' is visible
    //   6. Enter name and email address
    //   7. Click 'Signup' button
    //   8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
    //   9. Fill details: Title, Name, Email, Password, Date of birth
    //   10. Select checkbox 'Sign up for our newsletter!'
    //   11. Select checkbox 'Receive special offers from our partners!'
    //   12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
    //   13. Click 'Create Account button'
    //   14. Verify that 'ACCOUNT CREATED!' is visible
    //   15. Click 'Continue' button
    //   16. Verify that 'Logged in as username' is visible
    //   17. Click 'Delete Account' button
    //   18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button

    WebDriver driver;

    @Before
    public void setup() {
        //   1. Launch browser
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    @After
    public void teardown() {
        // driver.quit();
    }

    @Test
    public void test() {

        //   2. Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");

        //   3. Verify that home page is visible successfully
        String homeURL = driver.getCurrentUrl();
        Assert.assertEquals(homeURL, "https://automationexercise.com/");

        //   4. Click on 'Signup / Login' button
        WebElement signShop = driver.findElement(By.xpath("//i[@class='fa fa-lock']"));
        signShop.click();

        //   5. Verify 'New User Signup!' is visible
        WebElement sign = driver.findElement(By.xpath("//h2[text()='New User Signup!']"));
        Assert.assertTrue(sign.isDisplayed());

        //   6. Enter name and email address
        driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Merve");
        driver.findElement(By.xpath("(//input[@name='email'])[2]")).sendKeys("adana@gmail.com");

        //   7. Click 'Signup' button
        WebElement signUp = driver.findElement(By.xpath("//button[text()='Signup']"));
        signUp.click();

        //   8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
        WebElement account = driver.findElement(By.xpath("//b[text()='Enter Account Information']"));
        Assert.assertTrue(account.isDisplayed());

        //   9. Fill details: Title, Name, Email, Password, Date of birth
        // Title
        WebElement gender = driver.findElement(By.xpath("//input[@id='id_gender2']"));
        gender.click();

        // password
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("12345");

        // Date of birth
        // day
        WebElement day = driver.findElement(By.xpath("//select[@id='days']"));
        Select select = new Select(day);
        select.selectByIndex(1);

        // month
        WebElement mount =driver.findElement(By.xpath("//select[@data-qa='months']"));
        Select select2=new Select(mount);
        select2.selectByIndex(6);

        // year
        WebElement year = driver.findElement(By.xpath("//select[@id='years']"));
        Select select3 = new Select(year);
        select3.selectByValue("2003");

        //   10. Select checkbox 'Sign up for our newsletter!'

    }
}
