package Day6_Dropdown_SeleniumWaits;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.BaseTest;

import java.util.List;

public class H2 extends BaseTest {

    /*
    - https://demoqa.com/select-menu sitesine gidin
    - Multiple select yapabileceginiz <select> elementini locate edin
    - Birden fazla secim yapip secimlerinizi DOGRULAyin
     */

    @Test
    public void select() {
        // https://demoqa.com/select-menu sitesine gidin
        driver.get("https://demoqa.com/select-menu");

        // Multiple select yapabileceginiz <select> elementini locate edin
        Select select = new Select(driver.findElement(By.xpath("//select[@id='cars']")));

        // Birden fazla secim yapip secimlerinizi DOGRULAyin
        select.selectByValue("volvo");
        select.selectByIndex(2);

        // secili seceneklerin texti alınarak dogrulandı
        List<WebElement> liste = select.getAllSelectedOptions();


        for (WebElement element : liste){
            if (element.getText().contains("Volvo") || element.getText().contains("Opel")) {
                System.out.println("Dorulandı");
            } else {
                System.out.println("Doğrulanamadı");
            }
        }


    }
}
