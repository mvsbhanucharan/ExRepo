package com.webtable;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WebTable_CapturingCompleWebTableData_exclesheet extends BaseTest {

    @Test
    public void capturingCompleWebTableData() throws IOException {

        // Define Excel file path
    	FileInputStream citynames = new FileInputStream ("./src/com/webtable_excle_data/webtable data.xlsx");

        // Create a new Workbook
       XSSFWorkbook workbook = new XSSFWorkbook();
        // Create a Sheet named "WebTable Data"
        XSSFSheet sheet = workbook.createSheet("All city names");

        // To go through every row
        for (int rowIndex = 1; rowIndex <= 36; rowIndex++) {
        	
        	  // Create a new Row
            Row row = sheet.createRow(rowIndex - 1);
            // To go through every cell of each row
            for (int rowcellIndex = 1; rowcellIndex <= 8; rowcellIndex++) {
                By webTableDataProperty = By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[" + rowIndex + "]/td[" + rowcellIndex + "]");
                WebElement webTableData = driver.findElement(webTableDataProperty);
                String webTableDataText = webTableData.getText();

                // Create a new Row
             //   Row row = sheet.createRow(rowIndex - 1);
                // Create a new Cell and set the web table data as its value
                Cell cell = row.createCell(rowcellIndex - 1);
                   
                cell.setCellValue(webTableDataText);
            }
        }

        // Write the Workbook to the file
        FileOutputStream fileOut = new FileOutputStream("./src/com/webtable_excle_data/webtable data.xlsx");
            workbook.write(fileOut);
        

        // Close the Workbook to release resources
        workbook.close();
    }
}
