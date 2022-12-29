package Day4_LocatorPractice;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.BaseTest;

import java.util.List;

public class C02_CssPractice extends BaseTest {

    //  http://the-internet.herokuapp.com/add_remove_elements/
    //  Click on the "Add Element" button 100 times.
    //  Write a function that takes a number, and clicks the "Delete" button.
    //  Given number of times, and then validates that given number of buttons was deleted.
    //  1. Method: createButtons(100)
    //  2. Method: DeleteButtonsAndValidate()

    @Test
    public void test() {
        //  http://the-internet.herokuapp.com/add_remove_elements/
        driver.get("http://the-internet.herokuapp.com/add_remove_elements/");

        //  Click on the "Add Element" button 100 times.
        createButtons(100);
        //  2. Method: DeleteButtonsAndValidate()
        deleteButtonsAndValidate(40);


    }

    public void createButtons(int sayi) {
        for (int i = 0; i < sayi; i++) {
            // WebElement addElmnt = driver.findElement(By.xpath("//button[text()='Add Element']"));
            // cssSelector la alındı locate ama fındelements calısmıyor !!!
            WebElement addElmnt1 = driver.findElement(By.cssSelector("button[onclick='addElement()']"));

            //  1. Method: createButtons(100)
            addElmnt1.click();
        }
    }


    public void deleteButtonsAndValidate(int number) {

        // sayfadaki delete button sayısını saklarız.
        List<WebElement> listOfButtons = driver.findElements(By.cssSelector("button[class='added-manually']"));
        int beforeListSize = listOfButtons.size();

        // bizden istenen sayı kadar butonu sileriz
        for (int i = 0; i < number; i++) {
            listOfButtons.get(i).click();
        }
        // silindikten sonraki button sayısını buluruz
        int silindiktenSonraButtonSayisi = listOfButtons.size();

        // ilk sayi ile son sayi rasindaki farki dogrularız
        Assert.assertEquals(beforeListSize, silindiktenSonraButtonSayisi);

    }
}

