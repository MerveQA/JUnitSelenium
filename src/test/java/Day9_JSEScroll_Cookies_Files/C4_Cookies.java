package Day9_JSEScroll_Cookies_Files;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebElement;
import utilities.BaseTest;

import java.util.List;
import java.util.Set;

public class C4_Cookies extends BaseTest {

    //  Go to URL: https://kitchen.applitools.com/ingredients/cookie
    //  Get Cookie.
    //  Find the total number of cookies.
    //  Print all the cookies.
    //  Add Cookie.
    //  Edit Cookie.
    //  Delete Cookie.
    //  Delete All Cookies.

    @Test
    public void test() {
        //  Go to URL: https://kitchen.applitools.com/ingredients/cookie
        driver.get("https://kitchen.applitools.com/ingredients/cookie");

        //  Get Cookie.
        System.out.println("test get cookie");
        Cookie cookie = driver.manage().getCookieNamed("protein");
        Assert.assertEquals("chicken", cookie.getValue());

        //  Find the total number of cookies.
        Set<Cookie> allCookies = driver.manage().getCookies();
        System.out.println("Cookies size : " + allCookies.size());

        //  Print all the cookies.
        for (Cookie c : allCookies) {
            System.out.println("Cookie       : " + c);
            System.out.println("Cookie name  : " + c.getName());
            System.out.println("Cookie value : " + c.getValue() + "\n");

        }

        //  Add Cookie.
        Cookie cookie01 = new Cookie("Et", "kırmızı");  // cookie olusturduk
        driver.manage().addCookie(cookie01);
        Assert.assertEquals(cookie01.getValue(), driver.manage().getCookieNamed(cookie01.getName()).getValue());
        allCookies = driver.manage().getCookies();
        System.out.println("allCookies.size() = " + allCookies.size());

        //  Edit Cookie.
        Cookie editCookie = new Cookie(cookie01.getName(), "beyaz");
        driver.manage().addCookie(editCookie);
        Assert.assertEquals(editCookie.getValue(), driver.manage().getCookieNamed(editCookie.getName()).getValue());
        allCookies = driver.manage().getCookies();
        for (Cookie c : allCookies) {
            System.out.println("Cookie       : " + c);
            System.out.println("Cookie name  : " + c.getName());
            System.out.println("Cookie value : " + c.getValue() + "\n");

        }

        //  Delete Cookie.
        driver.manage().deleteCookie(editCookie);
        allCookies = driver.manage().getCookies();
        for (Cookie c : allCookies) {
            System.out.println("Cookie       : " + c);
            System.out.println("Cookie name  : " + c.getName());
            System.out.println("Cookie value : " + c.getValue() + "\n");
        }
    }

    // cookie leri silmek için method olusturulabilir
    @Test
    public void deleteMethod() {
        driver.get("https://kitchen.applitools.com/ingredients/cookie");
        Set<Cookie> allCookies = driver.manage().getCookies();
        System.out.println("Cookies size : " + allCookies.size()+"\n");

        Cookie c01 = new Cookie("fruit","waterMelon");
        driver.manage().addCookie(c01);
        System.out.println(c01.getValue());  // eklendı "waterMelon döndürdü"
        allCookies = driver.manage().getCookies();
        System.out.println("Cookies size : " + allCookies.size()+"\n");

        driver.manage().deleteCookie(c01);
        Assert.assertNull("hala silinmemis",driver.manage().getCookieNamed(c01.getName())); // PASSED
        allCookies = driver.manage().getCookies();
        System.out.println("Cookies size : " + allCookies.size()+"\n");

        driver.manage().deleteAllCookies();
        allCookies = driver.manage().getCookies();
        System.out.println("Cookies size : " + allCookies.size()+"\n");


    }

}

