package Day11_ApachePOI_WriteExcel;

import org.apache.poi.ss.usermodel.*;
import org.junit.Test;

import java.io.*;

public class C02_WriteExcelExample02 {
  // Create an object of File class to open xlsx file.+
  // Create an object of FileInputStream class to read excel file.+
  // Create an object of FileInputStream class to write excel file.+
  // Creating workbook instance that refers to .xlsx file.+
  // Creating a Sheet object.+
  // Get all rows in the sheet.+
  // Create a row object to retrieve row at index 3.+
  // Create a cell object to enter value in it using cell Index.
  // Write the data in excel using output stream.

    @Test
            public void changeExcelData() throws IOException {
        String path = "src\\test\\java\\resourses\\excelData.xlsx";

        // FileInputStream in farklı kulanımı bu sekilde de yapılabilir
        File file = new File(path);
        FileInputStream fis = new FileInputStream(file);


       // FileInputStream fis = new FileInputStream(path);
        FileOutputStream fos = new FileOutputStream(path);
        Workbook wb = WorkbookFactory.create(fis);
        Sheet informationData = wb.getSheet("informationData");
       // informationData.getLastRowNum(); // son satırı veir
        int totalRows = informationData.getLastRowNum()-informationData.getFirstRowNum();

        Row row05 = informationData.createRow(4);
        row05.createCell




    }


}
