import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class SDET_excel_util
{
    public static FileInputStream fi;
    public static FileOutputStream fo;
    public static XSSFWorkbook wb;
    public static XSSFSheet ws;
    public static XSSFRow row;
    public static XSSFCell cell;
    public static CellStyle style;

    // Excel file -----> Workbook ------> sheet -----> Rows ------> Cells

    public static int getRowCount(String xlfile , String xlsheet) throws IOException
    {
        fi = new FileInputStream(xlfile);
        wb = new XSSFWorkbook(fi);
        ws = wb.getSheet(xlsheet);
        int rowCount = ws.getLastRowNum();
        wb.close();
        fi.close();
        return rowCount;
    }

    //  Excel file -----> Workbook ------> sheet -----> Rows ------> Cells

    public static int getCellCount(String xlfile , String xlsheet , int rownum) throws IOException
    {
        fi = new FileInputStream(xlfile);
        wb = new XSSFWorkbook(fi);
        ws = wb.getSheet(xlsheet);
        row = ws.getRow(rownum);
        int cellcount = row.getLastCellNum();
        wb.close();
        fi.close();
        return cellcount;
    }

    //  Excel file -----> Workbook ------> sheet -----> Rows ------> Cells

    public static String getcelldata(String xlfile , String xlsheet , int rownum, int colnum) throws IOException
    {
        fi = new FileInputStream(xlfile);
        wb = new XSSFWorkbook(fi);
        ws = wb.getSheet(xlsheet);
        row = ws.getRow(rownum);
        cell = row.getCell(colnum);

        String data;
        try
        {
            //data= cell.toString();
            DataFormatter formatter = new DataFormatter(); // additional method of apache poi
            data = formatter.formatCellValue(cell); // Returns the formated value to cell as string regard less of cell type
        }
        catch (Exception e)
        {
            data = "";
        }
        wb.close();
        fi.close();
        return data;
    }

    public static int setCellData(String xlfile , String xlsheet , int rownum, int colnum, String data) throws IOException
    {
        fi = new FileInputStream(xlfile);
        wb = new XSSFWorkbook(fi);
        ws = wb.getSheet(xlsheet);
        row = ws.getRow(rownum);

        cell = row.createCell(colnum);
        cell.setCellValue(data);
        fo = new FileOutputStream(xlfile);
        wb.write(fo);
        wb.close();
        fi.close();
        fo.close();
        return rownum;
    }
}
