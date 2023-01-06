package Day8_WindowHandles_Actions;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.BaseTest;

import java.util.ArrayList;
import java.util.List;

public class C03_Drags_Ek extends BaseTest {

    @Test
    public void drag() {
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        List<WebElement> cities = new ArrayList<>();
        for (int i = 1; i <= 7; i++) {
            cities.add(driver.findElement(By.id("box" + i)));
        }
        List<WebElement> countrys = new ArrayList<>();
        for (int i = 101; i <= 107; i++) {
            countrys.add(driver.findElement(By.id("box" + i)));
        }
        Actions actions = new Actions(driver);
        for (int i = 0; i < cities.size(); i++) {
            actions.dragAndDrop(cities.get(i), countrys.get(i)).perform();
        }
    }
}