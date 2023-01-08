package StudentChallenge02;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.BaseTest;

import java.util.List;

public class Test01 extends BaseTest {
    /*
   1- https://www.amazon.com/ sayfasına gidelim.
   2- Arama kutusunu locate edelim.
   3- "Samsung headphones" ile arama yapalım.
   4- Bulunan sonuç sayısını yazdıralım.
   5- İlk ürünü tıklayalım.
   6- Sayfadaki tüm ürün başlıklarını yazdıralım.
*/

    @Test
    public void test01() throws InterruptedException {
       // 1- https://www.amazon.com/ sayfasına gidelim.
        driver.get("https://www.amazon.com/");

       // 2- Arama kutusunu locate edelim.
        WebElement amazonPageButton = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));

        // 3- "Samsung headphones" ile arama yapalım.
        // ne yazarsak yazalım test yapar
        amazonPageButton.sendKeys("Apple" + Keys.ENTER );


       // 4- Bulunan sonuç sayısını yazdıralım.;
        WebElement result = driver.findElement(By.xpath("(//div[@class='a-section a-spacing-small a-spacing-top-small'])[1]"));
        System.out.println("result = " + result.getText());

        // 5- İlk ürünü tıklayalım.
        WebElement firstProduct = driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-fixed-height'])[1]"));
        firstProduct.click();

        // 6- Sayfadaki tüm ürün başlıklarını yazdıralım.
        // 6- bunun için urun sayfasına geri geliyorum
        driver.navigate().back();
        List<WebElement> products = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
        System.out.println(products.size());
        for (WebElement product : products) {
            System.out.println(product.getText());
        }



    }
}
