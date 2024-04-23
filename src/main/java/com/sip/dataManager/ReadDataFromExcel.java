package com.sip.dataManager;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;

public class ReadDataFromExcel {

    @Test
    public void readData() throws IOException {
        File file = new File(System.getProperty("user.dir") + "/CCInfo.xlsx");

        // FileInputStream
        // WorkBook
        // Sheet
        // Cell

        FileInputStream fileInputStream = new FileInputStream(file);
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
        XSSFSheet xssfSheet = xssfWorkbook.getSheet("ProdData");

        Cell cell1 = xssfSheet.getRow(10).getCell(2);
        //Cell cell1 = xssfSheet.getRow("email address").getCell("ProdCompany");
        System.out.println(cell1);

        int rowNumber = 0, colNumber = 0;

        /**
         * Iteration of all rows in the sheet
         */

        for(Row row: xssfSheet){
            Cell cell = row.getCell(0); // first cell in the row
            System.out.println(cell);

            if(cell != null
            && cell.getCellType() == CellType.STRING
            && cell.getStringCellValue().equals("Phone Number")){
                rowNumber = row.getRowNum();
                System.out.println(rowNumber);
            }
        }

        /**
         * Iteration of cells on header row
         */
        Row headerRow = xssfSheet.getRow(0); // first cell in the header row
        for(Cell cell: headerRow){

            System.out.println(cell);

            if(cell != null
                    && cell.getCellType() == CellType.STRING
                    && cell.getStringCellValue().equals("ProdCompany")){
                colNumber = cell.getColumnIndex();
                System.out.println(colNumber);
            }

        }

        Cell cellValue = xssfSheet.getRow(rowNumber).getCell(colNumber);

        System.out.println(cellValue);
        String actualCellValue = cellValue.toString();

        BigDecimal bigDecimal = new BigDecimal(actualCellValue);
        long valueX = bigDecimal.longValue();
        System.out.println(valueX);

    }

}
