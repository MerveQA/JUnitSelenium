package Day07;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.BaseTest;
import java.util.List;

public class HomeWork_01 extends BaseTest {

    //   Go to URL: http://demo.guru99.com/test/guru99home/
    //   Find the number of iframes on the page.
    //   Link to the fourth iframe (JMeter Made Easy) (https://www.guru99.com/liveseleniumproject.html) click here.
    //   Exit the iframe and return to the main page.


    @Test
    public void test(){
        //   Go to URL: http://demo.guru99.com/test/guru99home/
        driver.get("http://demo.guru99.com/test/guru99home/");

        //   Find the number of iframes on the page.
        List<WebElement> iframeList = driver.findElements(By.xpath("//iframe"));
        System.out.println(iframeList.size());

        //   Link to the fourth iframe (JMeter Made Easy) (https://www.guru99.com/live selenium project.html) click here.
        driver.switchTo().frame(4);
        WebElement frame = driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
        frame.click();

        //   Exit the iframe and return to the main page.
        driver.switchTo().defaultContent();

    }
}
