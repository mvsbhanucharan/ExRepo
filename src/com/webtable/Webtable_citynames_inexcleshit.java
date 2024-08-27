
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

public class Webtable_citynames_inexcleshit extends BaseTest {

    @Test(priority=1, description="Capturing First Column City Names from the WebTable")
    public void capturingFirstColumnCityNames() throws IOException {

        // Define Excel file path
    	FileInputStream citenames = new FileInputStream("./src/com/webtable_excle_data/Webtable row.xlsx");

        // Create a new Workbook
       XSSFWorkbook  workbook = new XSSFWorkbook();
        // Create a Sheet named "City Names"
        XSSFSheet sheet = workbook.createSheet("City Names");

        // /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]
       
        
        String xpathExpressionPart1 = "/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[";
        String xpathExpressionPart2 = "]/td[1]";

        for (int rowIndex = 1; rowIndex <= 36; rowIndex++) {
            By cityNameProperty = By.xpath(xpathExpressionPart1 + rowIndex + xpathExpressionPart2);
            WebElement cityNameElement = driver.findElement(cityNameProperty);
            String cityNameText = cityNameElement.getText();

            // Create a new Row
            Row row = sheet.createRow(rowIndex - 1);
            // Create a new Cell and set the city name as its value
            Cell cell = row.createCell(0);
            cell.setCellValue(cityNameText);
        }

        // Write the Workbook to the file
        FileOutputStream fileOut = new FileOutputStream("./src/com/webtable_excle_data/Webtable row.xlsx");
            workbook.write(fileOut);
        

        // Close the Workbook to release resources
        workbook.close();
    
}
	
}	
	
	


