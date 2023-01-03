package StudentChallenge01;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.BaseTest;

import javax.print.DocFlavor;

public class TestAmazon extends BaseTest {

    //1-->git->"https://amazon.com"
    //2-->arama kutusundan "Electronic" seç
    //3-->"tv" yazdır
    //4-->"2. sayfaya" git
    //5-->tv  sepete ekle
    //6-->sepete git
    //7-->Proceed to checkout' a tıkla
    //8-->"Email or mobile phone number" gir
    //9-->"continue" butonuna tıkla
    //10--->"There was a problem" yazısının görüntülendiğini kontrol et
    //11-->Taraycı kapat

    @Test
    public void test() {
        //1-->git->"https://amazon.com"
        driver.get("https://amazon.com");

        //2-->arama kutusundan "Electronic" seç
        Select select = new Select(driver.findElement(By.xpath("//select[@id='searchDropdownBox']")));
        select.selectByVisibleText("Electronics");

        //3-->"tv" yazdır
        WebElement giris = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        giris.sendKeys("tv" + Keys.ENTER);


        //4-->"2. sayfaya" git
        WebElement pageTwo = driver.findElement(By.xpath("//a[@aria-label='Go to page 2']"));
        pageTwo.click();

        //5-->tv  sepete ekle
        WebElement page = driver.findElement(By.partialLinkText("Skyworth S3G 32-inch 720p HD LED Smart Android TV with Google Assistant"));
        page.click();
        // sepete ekle butonuna bastık
        WebElement cart = driver.findElement(By.id("add-to-cart-button"));
        cart.click();

        //6-->sepete git
        WebElement button = driver.findElement(By.xpath("//span[@class='a-button a-spacing-top-base a-button-span12 a-button-base celwidget']"));
        button.click();

        //7-->Proceed to checkout' a tıkla
        WebElement checkout = driver.findElement(By.xpath("//input[@name='proceedToRetailCheckout']"));
        checkout.click();

        //8-->"Email or mobile phone number" gir
        driver.findElement(By.id("ap_email")).sendKeys("hane@hotmail");

        //9-->"continue" butonuna tıkla
        driver.findElement(By.id("continue")).click();

        //10--->"There was a problem" yazısının görüntülendiğini kontrol et
        WebElement message = driver.findElement(By.xpath("//h4[@class='a-alert-heading']"));
        Assert.assertTrue(message.isDisplayed());


        //11-->Taraycı kapat
        driver.close();

    }

}
