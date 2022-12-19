package Day5_LocatorPractice;
import java.util.List;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_CheckBoxes {
    //    Go to https://the-internet.herokuapp.com/checkboxes
    //    Locate the elements of checkboxes.
    //    Then click on checkbox 1 if box is not selected.
    //    Then click on checkbox 2 if box is not selected.
    //    Then verify that checkbox 1 is checked.

    WebDriver driver;
    @Before
    public void setup(){
        //Driver olusturuldu
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        //sayfanin yuklenmesi beklendi
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // driver imiz maximize edildi
        driver.manage().window().maximize();
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void test() {

        //  //input[@type='checkbox']


    }
}
