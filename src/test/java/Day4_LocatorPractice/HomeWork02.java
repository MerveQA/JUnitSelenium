package Day4_LocatorPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HomeWork02 {
    //   Navigate to https://testpages.herokuapp.com/styled/index.html
    //   Click on Calculate under Micro Apps.
    //   Type any number in the first input.
    //   Type any number in the second input.
    //   Click on Calculate.
    //   Get the result.
    //   Print the result
    //   Quit

    @Test
    public void test() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        //   Navigate to https://testpages.herokuapp.com/styled/index.html
        driver.get("https://testpages.herokuapp.com/styled/index.html");

        //   Click on Calculate under Micro Apps.
        WebElement button = driver.findElement(By.xpath("//a[@href='calculator']"));
        button.click();

        //   Type any number in the first input.
        WebElement button1 = driver.findElement(By.xpath("//input[@id='number1']"));
        button1.sendKeys("10");
        //   Type any number in the second input.
        WebElement button2 = driver.findElement(By.xpath("//input[@id='number2']"));
        button2.sendKeys("20");

        //   Click on Calculate.
        driver.findElement(By.xpath("//input[@id='calculate']")).click();

        //   Get the result.
        WebElement result = driver.findElement(By.xpath("//p[text()='Answer : ']"));
        //   Print the result.
        System.out.println(result.getText());

        driver.quit();


    }
}
