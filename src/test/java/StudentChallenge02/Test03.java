package StudentChallenge02;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.BaseTest;

import java.security.Key;

public class Test03 extends BaseTest {

/*
    ● https://the-internet.herokuapp.com/javascript_alerts adresine gidin.
    ● Bir method oluşturun: acceptAlert
        ○ 1. butona tıklayın, uyarıdaki OK butonuna tıklayın ve result mesajının "You successfully clicked an alert" olduğunu test edin.
    ● Bir method oluşturun: dismissAlert
        ○ 2. butona tıklayın, uyarıdaki Cancel butonuna tıklayın ve result mesajının "successfuly" içermediğini test edin.
    ● Bir method oluşturun: sendKeysAlert
        ○ 3. butona tıklayın, uyarıdaki metin kutusuna isminizi yazin, OK butonuna tıklayın ve result mesajında isminizin içerdiğini doğrulayın.
 */


    @Test
    public void acceptAlert() {
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        WebElement click = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
        click.click();
        driver.switchTo().alert().accept();
        WebElement message =  driver.findElement(By.xpath("//p[@id='result']"));
        Assert.assertEquals("You successfully clicked an alert",message.getText());
    }

    @Test
    public void dismissAlert() {
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        WebElement click = driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
        click.click();
        driver.switchTo().alert().dismiss();
        WebElement message =  driver.findElement(By.xpath("//p[@id='result']"));
        Assert.assertFalse(message.getText().contains("successfuly"));
    }

    @Test
    public void sendKeysAlert() {
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        WebElement click = driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
        click.click();
        driver.switchTo().alert().sendKeys("MeRvE" );
        driver.switchTo().alert().accept();
        WebElement message =  driver.findElement(By.xpath("//p[@id='result']"));
        Assert.assertTrue(message.getText().contains("MeRvE"));
    }
}
