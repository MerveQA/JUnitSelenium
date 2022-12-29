package Day6_Dropdown_SeleniumWaits;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.BaseTest;

import java.util.List;

public class C02_DropDown extends BaseTest {


    @Test
    public void selectByIndex() {
        // 1.yol
        driver.get("https://demo.guru99.com/test/newtours/register.php");
        Select sel = new Select(driver.findElement(By.xpath("//*[@name='country']")));
        sel.selectByIndex(2);

        // 2.yol
        // WebElement drpDwn = driver.findElement(By.xpath("//*[@name='country']"));
        // Select selc = new Select(drpDwn);
        // gerisi ayni selkilde devam eder
    }

    @Test
    public void selectByValue() {
        driver.get("https://demo.guru99.com/test/newtours/register.php");
        Select sel = new Select(driver.findElement(By.xpath("//*[@name='country']")));
        sel.selectByValue("ALGERIA");
    }

    @Test
    public void selectByVisibleTest() {
        driver.get("https://demo.guru99.com/test/newtours/register.php");
        Select sel = new Select(driver.findElement(By.xpath("//*[@name='country']")));
        sel.selectByVisibleText("ANGUILLA");
        System.out.println(sel.isMultiple());
    }

    @Test
    public void isMultiple() {
        driver.get("https://output.jsbin.com/osebed/2");
        WebElement drp = driver.findElement(By.xpath("//*[@id='fruits']"));
        Select se = new Select(drp);
        System.out.println(se.isMultiple());

        se.selectByValue("orange");
        se.selectByIndex(1);

    }

    @Test
    public void getOptions() {
        driver.get("https://demo.guru99.com/test/newtours/register.php");
        Select sel = new Select(driver.findElement(By.xpath("//*[@name='country']")));
        List<WebElement> list = sel.getOptions();

        for (WebElement options : list) {
            System.out.println(options.getText());
        }
    }

    @Test
    public void getFirstSelectedOption() {
        driver.get("https://output.jsbin.com/osebed/2");
        WebElement drp = driver.findElement(By.xpath("//*[@id='fruits']"));
        Select se = new Select(drp);
        System.out.println(se.isMultiple());

        se.selectByValue("orange");
        se.selectByIndex(1);
        WebElement s = se.getFirstSelectedOption();
        System.out.println(s.getText());
        // sectiklerimiz arasında secili seceneklerden ilk sırada olanı dondurur.
    }

    @Test
    public void getAllSelectedOptions(){
        driver.get("https://output.jsbin.com/osebed/2");
        WebElement drp = driver.findElement(By.xpath("//*[@id='fruits']"));

    }
}

