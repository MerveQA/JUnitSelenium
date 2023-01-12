package Day10_ApachePOI;

import org.apache.poi.ss.usermodel.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class C02_ApachePoiTask {

    //   Add the excel file on the resources folder.
    //   Open the file.
    //   Open the workbook using file input stream.
    //   Open the first worksheet.
    //   Go to first row.
    //   Go to first cell on that first row and print.
    //   Go to second cell on that first row and print.
    //   Go to 2nd row first cell and assert if the data equal to Russia.
    //   Go to 3rd row 2nd cell-chain the row and cell.
    //   Find the number of used row.
    //   Print country, area key value pairs as map object.

    @Test
    public void test() throws IOException {
        //   Add the excel file on the resources folder.
        String path = "src\\test\\java\\resourses\\excelfile.xlsx";
        FileInputStream fis = new FileInputStream(path);
        Workbook workbook = WorkbookFactory.create(fis);
        Sheet sheet01 = workbook.getSheetAt(0);
        Row row01 = sheet01.getRow(0);
        Cell row1cell1 = row01.getCell(0);
        System.out.println("cell01 = " + row1cell1);

        Cell row1cell2 = row01.getCell(1);
        System.out.println("cell02 = " + row1cell2);

        //   Go to 2nd row first cell and assert if the data equal to Russia.
        Row row02 = sheet01.getRow(1);
        Cell row2cell1 = row02.getCell(0);
        Assert.assertEquals("Rusya",row2cell1.toString());

        //   Go to 3rd row 2nd cell-chain the row and cell.
        Row row03 = sheet01.getRow(2);
        Cell row03cell02 = row03.getCell(1);
        // METHODLARI ZİNCİRLE
        // Cell row03cell02 = sheet01.getRow(2).getCell(1);
        System.out.println("row03cell02 = " + row03cell02);

        //   Find the number of used row.
        // getPhysicalNumberOfRows() --> 1 den baslar satır sayısını verir
        System.out.println(sheet01.getPhysicalNumberOfRows());
        // getLastRowNum() -->
        // som satırın indexini dondurur. 0 dan baslar
        System.out.println(sheet01.getLastRowNum());
        //   Print country, area key value pairs as map object.
        int totalRows = sheet01.getPhysicalNumberOfRows();
        Map<String,String > countryAries = new HashMap<String,String>();

        for (int row=1;row<totalRows;row++){
            String country = sheet01.getRow(row).getCell(0).toString();
           // System.out.println((row+1)+".satır =" + country);
            String alan = sheet01.getRow(row).getCell(1).toString();
           // System.out.println((row+1)+".satır =" + alan);
            countryAries.put(country,alan);
        }

        System.out.println(countryAries);




    }

}
