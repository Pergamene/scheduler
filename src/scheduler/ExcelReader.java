package scheduler;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;

import java.io.*;

public class ExcelReader {

    public static void main(String[] args) {
        try {
            HSSFWorkbook workbook = new HSSFWorkbook();
            HSSFSheet sheet = workbook.createSheet("FirstExcelSheet");
            HSSFRow row = sheet.createRow(0);
            HSSFCell cell = row.createCell(0);
            cell.setCellValue("1. Cell");

            cell = row.createCell(1);
            DataFormat format = workbook.createDataFormat();
            CellStyle dateStyle = workbook.createCellStyle();
            //dateStyle.setDataFormat(format.getFormat("dd.mm.yyyy"));
            //cell.setCellStyle(dateStyle);
            cell.setCellValue(3);

            row.createCell(2).setCellValue("3.Cell");

            workbook.write(new FileOutputStream("excel.xls"));
            workbook.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}