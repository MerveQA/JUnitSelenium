package Day12_Screenshots;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import utilities.BaseTest;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class C02_ScreenShotExample extends BaseTest {
    //  Go to URL: https://opensource-demo.orangehrmlive.com/
    //  Saving the image to  the path.
    //  Getting screenshot of Orange HRM Logo.
    //  Getting screenshot of  Orange HRM Page Section.

    @Test
    public void getPageScreenshot() throws IOException {
        // full degilde sayfanın shotunu alacagız
        driver.get("https://www.n11.com/");
        File kaynak = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        // FileHandler.copy(kaynak,new File("test - output/Screenshots/N11FullScreenshots.png"));
        FileUtils.copyFile(kaynak, new File("test - output\\Screenshots\\n11FullScreenshots.png"));
    }


    @Test
    public void getElementScreenshot() throws IOException {
        // Go to URL: https://opensource-demo.orangehrmlive.com/
        driver.get("https://opensource-demo.orangehrmlive.com/");

        // Screenshot u alinacak elementimizi locate ettik
        WebElement logo = driver.findElement(By.className("orangehrm-login-branding"));

        // Element uzerinden screenshot umuzu aldik
        File logoScreenshot = logo.getScreenshotAs(OutputType.FILE);

        // Ozel isimler olabilmesi adina date imizi dosya isimlerimizin yanina ekledik
        String date = new SimpleDateFormat("yyyy-MM-dd_hh-mm-ss").format(new Date());

        String path = "test - output\\Screenshots\\LogoScreenShot" + date + ".png";
        System.out.println(path);

        // Dosyamizi kaydettik
        FileUtils.copyFile(logoScreenshot, new File(path));
    }

    @Test
    public void placeScreenShot() throws IOException {
        // Go to URL: https://opensource-demo.orangehrmlive.com/
        driver.get("https://opensource-demo.orangehrmlive.com/");

        // Screenshot yapacagımız webelementin locate alalım
        WebElement place = driver.findElement(By.className("orangehrm-login-slot"));

        // Element uzerinden screenshot umuzu aldik
        File screenShot = place.getScreenshotAs(OutputType.FILE);

        // Ozel isimler olabilmesi adina date imizi dosya isimlerimizin yanina ekledik
        String date = new SimpleDateFormat("yyyy-MM-dd-hh-mm-ss").format(new Date());

        // path aldık
        String path = "test - output\\Screenshots\\placeScreenshots "+date+".png";

        // Dosyamizi kaydettik
        FileUtils.copyFile(screenShot,new File(path));



    }
}
