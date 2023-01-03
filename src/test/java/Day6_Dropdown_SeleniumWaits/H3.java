package Day6_Dropdown_SeleniumWaits;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.BaseTest;

import java.util.List;

public class H3 extends BaseTest {

    /*
    - https://demoqa.com/select-menu sitesine gidin
    - multiple <select> elementini locate edin
    - getOptions(), getFirstSelectedOption(), getAllSelected() methodlarini kullanmak adina:
    * Farkli secimler yaparak methodlarinizi kullanin ve Assertion yapmayi unutmayin
     */

    @Test
    public void selectTest() {
        // https://demoqa.com/select-menu sitesine gidin
        driver.get("https://demoqa.com/select-menu");

        // Multiple select yapabileceginiz <select> elementini locate edin
        Select select = new Select(driver.findElement(By.xpath("//select[@id='cars']")));

        select.selectByIndex(2);  // opel
        select.selectByValue("volvo");

        WebElement e = select.getFirstSelectedOption();
        Assert.assertTrue(e.getText().contains("Volvo"));

        List<WebElement> liste = select.getAllSelectedOptions();
        List<WebElement> lis = select.getOptions();

        }
    }

