package Day10_ApachePOI;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.BaseTest;

public class HoMeWoRk01 extends BaseTest {
   // Go to URL: https://www.monsterindia.com/seeker/registration
   // Upload file.

    @Test
    public void upLoad() throws InterruptedException {
        driver.get("https://www.monsterindia.com/seeker/registration");
        WebElement choose = driver.findElement(By.id("file-upload"));
        String path = "C:\\Users\\Asus\\Desktop\\CV.docx";
        choose.sendKeys(path);

    }
}
