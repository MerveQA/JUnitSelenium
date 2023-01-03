package Day6_Dropdown_SeleniumWaits;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.BaseTest;

import java.util.List;

public class H1 extends BaseTest {
/*
            - https://demoqa.com/select-menu sitesine gidin
            - <select> elementini locate edin
            - <select> elementinin seceneklerini yazdirin
            - Sirasiyla selectByIndex, selectByValue, selectByVisibleText methodlarini kullanarak;
              * Yellow (index)
              * Purple (value)
              * Black  (text)
             seceneklerini secin    */

    @Test
    public void select() {
        // https://demoqa.com/select-menu sitesine gidin
        driver.get("https://demoqa.com/select-menu");

        // <select> elementini locate edin
        Select select = new Select(driver.findElement(By.xpath("//select[@id='oldSelectMenu']")));

        //<select> elementinin seceneklerini yazdirin
        List <WebElement> list  = select.getOptions();

        for (WebElement options : list){
            System.out.println(options.getText());
        }

        // selectByIndex -->  yellow
        select.selectByIndex(3);
        // selectByValue -->  purple
        select.selectByValue("4");
        // selectByVisibleText -->  Black
        select.selectByVisibleText("Black");
    }
}
