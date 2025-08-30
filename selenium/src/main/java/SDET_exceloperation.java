import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


import java.io.FileInputStream;
import java.io.IOException;

public class SDET_exceloperation
{
    public static void main (String[] args) throws IOException
    {
        //  Excel file -----> Workbook ------> sheet -----> Rows ------> Cells

        // Excel file
        FileInputStream file = new FileInputStream("/home/sri-jaya-shankaran/IdeaProjects/java-selenium/selenium/src/main/testdata/test1.xlsx");

        // workbook
        XSSFWorkbook workbook = new XSSFWorkbook(file);

        // sheet
        XSSFSheet sheet = workbook.getSheet("sheet1");

        // Rows
        int row = sheet.getLastRowNum();

        // Cells
        int cell = sheet.getRow(1).getLastCellNum();

        System.out.println("num of row start from 0 index: " + row); // 4    rows are count from 0

        System.out.println("num of cell start from .: " + cell); // 3

        for (int r = 0; r <= row; r++) // it count from 0
        {
            XSSFRow currentrow = sheet.getRow(r);
            for (int c = 0; c < cell; c++) // it count from 1
            {
                XSSFCell celll = currentrow.getCell(c);
                System.out.print(celll.toString()+"\t");
            }
            System.out.println();
        }

        workbook.close();
        file.close();
    }
}
