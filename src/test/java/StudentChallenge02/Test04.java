package StudentChallenge02;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.BaseTest;

import java.util.List;
import java.util.Map;

public class Test04 extends BaseTest {
    /*
        ● https://the-internet.herokuapp.com/dropdown adresine gidin.
        1. Index kullanarak Seçenek 1’i (Option 1) seçin ve yazdırın.
        2. Value kullanarak Seçenek 2'yi (Option 2) seçin ve yazdırın.
        3. Visible Text (Görünen metin) kullanarak Seçenek 1’i (Option 1) seçin ve yazdırın.
        4. Tüm dropdown değerleri(value) yazdırın.
        5. Dropdown'un boyutunu bulun, Dropdown'da 4 öğe varsa konsolda True, değilse False yazdırın.
    */
    @Test
    public void test04() {
        driver.get("https://the-internet.herokuapp.com/dropdown");
        Select select = new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));
        select.selectByIndex(1);
        System.out.println(select.getFirstSelectedOption().getText());
        select.selectByValue("2");
        System.out.println(select.getFirstSelectedOption().getText());
        select.selectByVisibleText("Option 1");
        System.out.println(select.getFirstSelectedOption().getText());

        List<WebElement> alloptions = select.getOptions();
        for (WebElement option : alloptions) {
            System.out.println(option.getText());
        }

        String s = alloptions.size() == 4 ? "true" : "false";
        System.out.println(s);






    }
}
