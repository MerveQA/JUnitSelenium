package Day5_LocatorPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Ek2 {



    @Test
    public void test(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        //    Go to URL: https://demoqa.com/
        driver.get("https://demoqa.com/");

//    Click on Elements.
        WebElement elemnt=driver.findElement(By.xpath("//div[@class='avatar mx-auto white'][1]"));
        elemnt.click();
//    Click on Checkbox.
        WebElement check=   driver.findElement(By.xpath("//span[text()='Check Box']"));
        check.click();
//    Verify if Home checkbox is selected.
        WebElement home=   driver.findElement(By.cssSelector(".rct-icon.rct-icon-uncheck"));
        home.click();
//    Verify that "You have selected" is visible.
        Assert.assertTrue(home.isSelected());

    }
}
