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
//   Print the result.

    @Test
    public void test() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://testpages.herokuapp.com/styled/index.html");
        WebElement button = driver.findElement(By.xpath("//a[@href='calculator']"));
        button.click();

        WebElement button1 = driver.findElement(By.xpath("//input[@id='number1']"));
        button1.sendKeys("10");
        WebElement button2 = driver.findElement(By.xpath("//input[@id='number2']"));
        button2.sendKeys("20");
        driver.findElement(By.xpath("//input[@id='calculate']")).click();

        WebElement result = driver.findElement(By.xpath("//p[text()='Answer : ']"));
        System.out.println(result.getText());

        driver.quit();


    }
}
