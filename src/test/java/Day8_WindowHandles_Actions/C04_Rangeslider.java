package Day8_WindowHandles_Actions;

import com.beust.ah.A;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.BaseTest;

public class C04_Rangeslider extends BaseTest {


    @Test
    public void draganddropOffset() {
    driver.get("https://rangeslider.js.org/");
    WebElement slide = driver.findElement(By.xpath("//div[@class='rangeslider__handle'][1]"));

    Actions action = new Actions(driver);
    action.dragAndDropBy(slide,100,40).perform();
    action.dragAndDropBy(slide,-100,0).perform();

    }

    @Test
    public void draganddropOffsetVertical() {
        // yukarı --> pozitif
        // asagı --> nehgatif
    }


}
