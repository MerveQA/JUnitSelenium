package StudentChallenge02;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.BaseTest;

import java.util.Set;

public class Test05 extends BaseTest {
    /*
    ● https://the-internet.herokuapp.com/windows adresine gidin.          --> done
    ● Sayfadaki textin "Opening a new window" olduğunu doğrulayın.        --> done
    ● Sayfa başlığının (title) "The Internet" olduğunu doğrulayın.        --> done
    ● Click Here butonuna basın.                                          --> done
    ● Açılan yeni pencerenin sayfa başlığının (title) "New Window" olduğunu doğrulayın.
    ● Sayfadaki textin "New Window" olduğunu doğrulayın.
    ● Bir önceki pencereye geri döndükten sonra sayfa başlığının "The Internet" olduğunu doğrulayın.
*/
    @Test
    public void test05() {
        driver.get("https://the-internet.herokuapp.com/windows");
        WebElement text = driver.findElement(By.tagName("h3"));
        Assert.assertEquals("text istendiği gibi degil", "Opening a new window", text.getText());
        Assert.assertEquals("The Internet", driver.getTitle());

        // 2. sayfaya gecmeden önce hemen ana sayfayı korumaya alıyoruz
        String homePage = driver.getWindowHandle();
        WebElement act = driver.findElement(By.tagName("h3"));
        act.click();
        Assert.assertEquals("The Internet",driver.getTitle());

       driver.findElement(By.linkText("Click Here")).click();


        //   Arraylist ile cozumu
        //  ArrayList<String> allHandles = new ArrayList<>(driver.getWindowHandles());
        //  allHandles.get(0); // => 1. sayfa handle
        //  allHandles.get(1); //2. sayfa

        //  ● Açılan yeni pencerenin sayfa başlığının (title) "New Window" olduğunu doğrulayın.
        Set<String > handles = driver.getWindowHandles();
        String secondHandles = "";

        for (String handle : handles) {
            if (!handle.equals(homePage)){
                secondHandles = handle;
            }
        }
        driver.switchTo().window(secondHandles);
       Assert.assertEquals("Esitlik yok",driver.getTitle(),"New Window");
// ● Sayfadaki textin "New Window" olduğunu doğrulayın.
        WebElement textsecondPage = driver.findElement(By.tagName("h3"));
        Assert.assertEquals("Text yok",textsecondPage.getText(),"New Window");

        //● Bir önceki pencereye geri döndükten sonra sayfa başlığının "The Internet" olduğunu doğrulayın.
        driver.switchTo().window(homePage);
        Assert.assertEquals("title aynı degıl",driver.getTitle(),"The Internet");

    }
}
