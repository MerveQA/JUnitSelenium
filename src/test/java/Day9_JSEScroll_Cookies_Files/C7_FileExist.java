package Day9_JSEScroll_Cookies_Files;

import utilities.BaseTest;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class C7_FileExist extends BaseTest {
    public static void main(String[] args) {
        // projemızın rootunun yolunu veriri
        System.out.println(System.getProperty("user.dir"));

        // projeye kadar olan yol
        String projeRoot = System.getProperty("user.dir");
        // fıle a kadar olan yol
        String filePath = "\\src\\test\\java\\resourses\\fileExist.jpg";

        // absolute path ı olusturduk
        filePath = projeRoot + filePath ;
        // Paths.get(filePath) --> bir stringi path yolunu Path classından bir pathe dondurur.
        // Boyle bir dosya var mı diye baktık bilgisayarımızda --> Files.exists(Paths.get(filePath))
        Files.exists(Paths.get(filePath));

        if (Files.exists(Paths.get(filePath))){
            System.out.println("Dosya bulundu");
        } else {
            System.out.println("Dosya bulunamadı ");
        }

    }

    // aradıgımız dosyalar resoursee da olur


}
