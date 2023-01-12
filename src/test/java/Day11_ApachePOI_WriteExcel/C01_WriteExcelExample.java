package Day11_ApachePOI_WriteExcel;

import org.apache.poi.ss.usermodel.*;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class C01_WriteExcelExample {

    @Test
    public void test() throws IOException {

     //  Store the path of the file as string and open the file. +
     //  Open the workbook.+
     //  Open the first worksheet.+
     //  Go to the first row.+
     //  Create a cell on the 3rd column (2nd index) on the first row.+
     //  Write “POPULATION” on that cell.+
     //  Create a cell on the 2nd row 3rd cell(index2), and write data.+
     //  Create a cell on the 3rd row 3rd cell(index2), and write data.+
     //  Create a cell on the 4th row 3rd cell(index2), and write data.+
     //  Write and save the workbook.
     //  Close the file.
     //  Close the workbook.

        String path = "src\\test\\java\\resourses\\excelfile.xlsx";
        FileInputStream fis = new FileInputStream(path);
        Workbook wb = WorkbookFactory.create(fis);
        Sheet sheet02 = wb.getSheetAt(1);
        Row row01  = sheet02.getRow(0);
        // Bos olan hucreyi aktif hale getiriyoruz (boş yerleri yok sayıyır)
        Cell row01cell03 = row01.createCell(2);
        row01cell03.setCellValue("POPULATION");
        sheet02.getRow(1).createCell(2).setCellValue("Rusya nıin populasyonu");
        sheet02.getRow(2).createCell(2).setCellValue("ABD nin populasyonu");
        sheet02.getRow(3).createCell(2).setCellValue("Çin in populasyonu");
        //  Write işlemini yapıyoruz + save
        FileOutputStream fos = new FileOutputStream(path);
        wb.write(fos);
        // kapatma
        fis.close();
        fos.close();
        // kullandıgımız wb objesini kapattık
        wb.close();




    }

}
