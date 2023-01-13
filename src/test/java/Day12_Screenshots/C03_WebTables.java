package Day12_Screenshots;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.BaseTest;

public class C03_WebTables extends BaseTest {

    // Go to URL: http://demo.guru99.com/test/web-table-element.php
    // To find third row of table
    // To get 3rd row's 3nd column data
    // Get all the values of a Dynamic Table

    @Test
    public void webTableExamples() {

        // Go to URL: http://demo.guru99.com/test/web-table-element.php
        driver.get("http://demo.guru99.com/test/web-table-element.php");

        // Table ı locate edelim
        WebElement table = driver.findElement(By.className("dataTable"));

        // To find third row of table
        WebElement row3 = table.findElement(By.xpath(".//tr[3]"));
        System.out.println(row3.getText());

        // To get 3rd row's 2nd column data
        WebElement row3cell3 = row3.findElement(By.xpath(".//td[3]"));
        System.out.println(row3cell3.getText());

        // Get all the values of a Dynamic Table
        int satirSayici = table.findElements(By.xpath(".//tr")).size();
        System.out.println(satirSayici);

        int sutunSayici = row3.findElements(By.xpath(".//td")).size();
        System.out.println(sutunSayici);

        for (int row=1; row<=satirSayici; row++) {
            for (int cell=1; cell<=sutunSayici; cell++) {
                By locater = By.xpath(".//tr["+row+"]//td["+cell+"]");
                WebElement tableData = table.findElement(locater);

                System.out.print(tableData.getText() + " ");
            }
            System.out.println();
        }
    }
}
