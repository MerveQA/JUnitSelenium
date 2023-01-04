package Day7_Iframe_WindowHandles;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.BaseTest;

public class C01_IframeExample extends BaseTest {

    //        Go to URL: https://the-internet.herokuapp.com/iframe
    //        Verify the Bolded text contains "Editor"
    //        Locate the text box
    //        Delete the text in the text box
    //        Type "Hi everyone"
    //        Verify the text Elemental Selenium text is displayed on the page.

    @Test
    public void iframeTest() {

        // Go to URL: https://the-internet.herokuapp.com/iframe
        driver.get("https://the-internet.herokuapp.com/iframe");

        // Verify the Bolded text contains "Editor"
        WebElement e = driver.findElement(By.tagName("h3"));
        String el = e.getText();

        Assert.assertTrue(el.contains("Editor"));

        // Locate the text box
        driver.switchTo().frame(0);
        WebElement textBox = driver.findElement(By.id("tinymce"));

        // Delete the text in the text box
        textBox.clear();

        // Type "Hi everyone"
        WebElement textBoxc = driver.findElement(By.id("tinymce"));
        textBoxc.sendKeys("Hi everyone");

        // Verify the text Elemental Selenium text is displayed on the page.
        driver.switchTo().defaultContent();
        Assert.assertTrue(driver.findElement(By.xpath("//a[text()='Elemental Selenium']")).isDisplayed());

    }
}
