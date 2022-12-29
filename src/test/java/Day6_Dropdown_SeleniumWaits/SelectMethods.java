package Day6_Dropdown_SeleniumWaits;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import utilities.BaseTest;

public class SelectMethods extends BaseTest {

    @Test
    public void selectByVisible() {
        driver.get("https://demoqa.com/select-menu");
        Select sel = new Select(driver.findElement(By.xpath("//*[@id='oldSelectMenu']")));
        sel.selectByVisibleText("White");
        driver.close();
    }

    @Test
    public void selectByIndex() {
        driver.get("https://demoqa.com/select-menu");
        Select se = new Select(driver.findElement(By.xpath("//*[@id='oldSelectMenu']")));
        se.selectByIndex(3);
        driver.close();
    }

    @Test
    public void selectByValue() {
        driver.get("https://demoqa.com/select-menu");
        Select se = new Select(driver.findElement(By.xpath("//*[@id='oldSelectMenu']")));
        se.selectByValue("4");
        driver.close();
    }

}
