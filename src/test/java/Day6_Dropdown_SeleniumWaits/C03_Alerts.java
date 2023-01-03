package Day6_Dropdown_SeleniumWaits;

import org.junit.Test;
import org.openqa.selenium.By;
import utilities.BaseTest;

public class C03_Alerts extends BaseTest {

    @Test
    public void alertsMethod() {
        // siteye gidelim
        driver.get("http://demo.guru99.com/test/delete_customer.php");

        // girdimizi yapalım
        driver.findElement(By.name("cusid")).sendKeys("123");

        // Alanı kabul edelim
        driver.findElement(By.name("submit")).click();

        // Alertleri handle edelim
        driver.switchTo().alert().accept();
        // 1. alertin mesajını getır
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
        // 2. alertin mesajını getır
        System.out.println(driver.switchTo().alert().getText());

    }
}
