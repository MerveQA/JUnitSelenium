package StudentChallenge02;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.BaseTest;

public class Test08 extends BaseTest {

    @Test
    public void test08() {
        /*
    1- https://demoqa.com/droppable adresine gidelim.
    2- "Drag me" butonunu tutup "Drop here" kutusunun üstüne bırakalım.
    3- "Drop here" yazısı yerine "Dropped!" olduğunu test edin.
*/
        // 1- https://demoqa.com/droppable adresine gidelim.
        driver.get("https://demoqa.com/droppable");

        // 2- "Drag me" butonunu tutup "Drop here" kutusunun üstüne bırakalım.
        Actions action = new Actions(driver);
        WebElement hold = driver.findElement(By.id("draggable"));
        WebElement move = driver.findElement(By.id("droppable"));
        action.dragAndDrop(hold,move).perform();
        Assert.assertEquals("Dropped!",driver.findElement(By.xpath("//*[text()='Dropped!']")).getText());

    }

}

