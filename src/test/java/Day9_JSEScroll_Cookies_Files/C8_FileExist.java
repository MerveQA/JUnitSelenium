package Day9_JSEScroll_Cookies_Files;

import org.junit.Assert;
import org.junit.Test;
import utilities.BaseTest;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

public class C8_FileExist {
    @Test
    public void fileExist() {
        // projenın dısındaki bir dosya için bunu yapalım
        // bilgisayarda arayaagı
        // C:\Users\Asus\Desktop


        // en genel aranan yer..
        // proje yada bilgisayar
        String homePath = System.getProperty("user.home");
        // dosyanın yolu (file)
        String filePath = "\\Desktop\\fileExist.jpg";

        filePath = homePath + filePath;

        // 1.yol
        Files.exists(Paths.get(filePath));
        Assert.assertTrue(Files.exists(Paths.get(filePath)));
        System.out.println("oldu");

       // 2.yol
        File image = new File(filePath);
        Assert.assertTrue(image.exists());
        System.out.println("pek guzel oldu");


    }

}
