package Day5_LocatorPractice;

import java.util.List;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;


public class HomeWork01 {
    //    Go to URL: https://demoqa.com/
    //    Click on Elements.
    //    Click on Checkbox.
    //    Verify if Home checkbox is selected.
    //    Verify that "You have selected" is visible.


    @Test
    public void demoTest() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        //    Go to URL: https://demoqa.com/
        driver.get("https://demoqa.com/");

        //    Click on Elements.
        WebElement demo = driver.findElement(By.xpath("//div[@class='card mt-4 top-card']"));
        demo.click();

        //    Click on Checkbox.
        List<WebElement> demoList = driver.findElements(By.xpath("//li[@id='item-1']"));
        demoList.get(0).click();

        //    Verify if Home checkbox is selected.
        WebElement checkbox = driver.findElement(By.xpath("//div[@id='tree-node']"));
        checkbox.isSelected();


        //      Verify that "You have selected" is visible.
        WebElement checkIkon = driver.findElement(By.xpath("//span[@class='rct-checkbox']"));

        if (!checkIkon.isSelected()) {
            checkIkon.click();
        }

        //    Verify that "You have selected" is visible.
        WebElement textSelected = driver.findElement(By.xpath("//span[.='You have selected :']"));
        Assert.assertTrue(textSelected.isDisplayed());

        //  quit
        driver.quit();


    }
}
