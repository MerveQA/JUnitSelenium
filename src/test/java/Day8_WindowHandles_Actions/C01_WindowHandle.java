package Day8_WindowHandles_Actions;

import org.junit.Test;
import org.openqa.selenium.WindowType;
import utilities.BaseTest;

public class C01_WindowHandle extends BaseTest {

    // https://testproject.io/

    // https://blog.testproject.io/


    @Test
    public void newWindow() {

        // ilk url e giris saglandı
        driver.get("https://testproject.io/");

        // 1.yol --> yeni pencere olusturup pencereye geciş yapıyoruz
        driver.switchTo().newWindow(WindowType.WINDOW);
        // 2.yol --> yeni pencere olusturup pencereye geciş yapıyoruz
        // WebDriver newWindow = driver.switchTo().newWindow(WindowType.WINDOW

        driver.get("// https://blog.testproject.io/");
    }

    @Test
    public void newTab() {

    }


    @Test
    public void handleWindow() {

    }
}
