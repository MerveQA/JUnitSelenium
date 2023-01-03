package Day6_Dropdown_SeleniumWaits;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.BaseTest;

public class C04_BasicAuthentication extends BaseTest {

    @Test
    public void basicAut() {

        // https:// USERNAME : PASSWORD @ URL

        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

        WebElement content = driver.findElement(By.id("content"));

        Assert.assertTrue(content.getText().contains("Congratulations"));
    }
}
