package Day5_LocatorPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class C03_ChormeOptions {
    @Test
    public void chromeOptions(){

        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        //options.addArguments("headless");
      //  options.addArguments("start-maximized");
        options.addArguments("incognito");

        WebDriver driver = new ChromeDriver(options);

    }
}
