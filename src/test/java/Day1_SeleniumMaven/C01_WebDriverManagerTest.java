package Day1_SeleniumMaven;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_WebDriverManagerTest {
    // Set Path.
    // Create chrome driver.
    // Maximize the window.
    // Open google home page https://www.google.com/
    // Verify that you are Google in the title.
    // Quit

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        if (driver.getTitle().contains("Google")) {
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED");
        }

        driver.quit();

    }

}
