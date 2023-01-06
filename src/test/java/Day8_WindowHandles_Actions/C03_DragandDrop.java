package Day8_WindowHandles_Actions;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.BaseTest;

public class C03_DragandDrop extends BaseTest {
    // http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html
    // ulkeleri yelerine yerlestr

    @Test
    public void dragTest() {
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

        // drag elements
        WebElement Washington = driver.findElement(By.id("box3"));
        WebElement oslo = driver.findElement(By.id("box1"));
        WebElement copenhagen = driver.findElement(By.id("box4"));
        WebElement rome = driver.findElement(By.id("box6"));
        WebElement madrid = driver.findElement(By.id("box7"));
        WebElement stoclhom = driver.findElement(By.id("box2"));
        WebElement seoul = driver.findElement(By.id("box5"));

        // drop elements
        WebElement italy = driver.findElement(By.id("box106"));
        WebElement spain = driver.findElement(By.id("box107"));
        WebElement norway = driver.findElement(By.id("box101"));
        WebElement denmark = driver.findElement(By.id("box104"));
        WebElement southkore = driver.findElement(By.id("box105"));
        WebElement sweden = driver.findElement(By.id("box102"));
        WebElement unitedStates = driver.findElement(By.id("box103"));


        Actions action = new Actions(driver);

        // 1.yol (tekli işlem)
        action.dragAndDrop(Washington,unitedStates).perform();
        action.dragAndDrop(oslo,norway).perform();
        action.dragAndDrop(rome,italy).perform();
        action.dragAndDrop(madrid,spain).perform();
        action.dragAndDrop(stoclhom,sweden).perform();
        action.dragAndDrop(seoul,southkore).perform();
        action.dragAndDrop(copenhagen,denmark).perform();

        // 2.yol (cogul işlem)
        // action.dragAndDrop(Washington,unitedStates).
        //         dragAndDrop(oslo,norway).
        //         dragAndDrop(rome,italy).
        //         dragAndDrop(madrid,spain).perform();
        //



    }

}
