package Day5_LocatorPractice;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.BaseTest;

public class C05_CheckBoxes extends BaseTest {

    // Go to URL: https://demoqa.com/
    // Click on Elements.
    // Click on Checkbox.
    // Verify if Home checkbox is selected.
    // Verify that "You have selected" is visible.

    @Test
    public void checkBoxes() {

        // Go to URL: https://demoqa.com/
        driver.get("https://demoqa.com/");

        // Click on Elements.
        WebElement elements = driver.findElement(By.xpath("(//div[@class='card mt-4 top-card'])[1]"));
        elements.click();

        // Click on Checkbox.
        WebElement checkBox = driver.findElement(By.id("item-1"));
        checkBox.click();

        // Verify if Home checkbox is selected.
        WebElement home = driver.findElement(By.xpath("//label[@for='tree-node-home']"));
        if (!home.isSelected()) {
            home.click();
        }

        // Verify that "You have selected" is visible.
        WebElement message = driver.findElement(By.xpath("//span[text()='You have selected :']"));
        Assert.assertTrue(message.isDisplayed());
    }


}
