package Day10_ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C01_ExcelMethods {
    public static void main(String[] args) throws IOException {

        // excel dosyamızın pathını aldık
        String path = "src\\test\\java\\resourses\\excelfile.xlsx";
        // dosyamızı actık
        FileInputStream fileInputStream = new FileInputStream(path);

        // apachi kullanarak exceli acıyoruz
        // actıgımız dosyayı excel workbookuba cevirdik
        Workbook workbook = WorkbookFactory.create(fileInputStream);
        // sheetimize geciş yaptık
        Sheet sheet = workbook.getSheetAt(0);
        // satıra gececegiz
        Row row1 = sheet.getRow(0);
        // celle imize ulasalım
        Cell cell01 = row1.getCell(0);

        System.out.println("cell01 = " + cell01);// direk yazdırır
        System.out.println("cell01.toString() = " + cell01.toString()); // stringe cevirir


    }
}
