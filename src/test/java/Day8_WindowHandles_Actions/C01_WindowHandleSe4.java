package Day8_WindowHandles_Actions;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import utilities.BaseTest;

import java.util.Set;

public class C01_WindowHandleSe4 extends BaseTest {

    // Go to URL: https://testproject.io/
    // Selenium's 4 newWindow() method to open a new Window for TestProject's Blog page.
    // https://blog.testproject.io/

    @Test
    public void newWindow() {
        // Go to URL: https://testproject.io/
        driver.get("https://testproject.io/");
        // Selenium's 4 newWindow() method to open a new Window for TestProject's Blog page.
        WebDriver newWindow = driver.switchTo().newWindow(WindowType.WINDOW);
        // https://blog.testproject.io/
        newWindow.get("https://blog.testproject.io/");
    }

    @Test
    public void windowTab() {
        // https://testproject.io/
        driver.get("https://testproject.io/");
        // Selenium's 4 newTab() method to open a new Window for TestProject's Blog page.
        WebDriver newTab = driver.switchTo().newWindow(WindowType.TAB);
        // https://www.amazon.com.tr/
        newTab.get("https://www.amazon.com.tr/");

    }

    @Test
    public void handleWindows() {
        // 1.amazona git
        driver.get("https://www.amazon.com.tr/");

        // 2.anasayfayı sakla
        String mainWindow = driver.getWindowHandle();

        // 3. yeni bir tab acalım
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.amazon.com/");

        // yeni pencere olustur
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.google.com.tr/?hl=tr");

        // target ları yanı tum baska syfada acılacak linkleri sete atma
        Set<String> targets = driver.getWindowHandles();

        for (String t : targets ){
          driver.switchTo().window(t);
          if (!t.equalsIgnoreCase(mainWindow)){
              System.out.println(driver.getTitle());
              driver.close();
          }

        }
    }
}

