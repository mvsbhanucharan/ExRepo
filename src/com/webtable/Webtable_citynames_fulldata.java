 package com.webtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Webtable_citynames_fulldata extends BaseTest
{
	@Test
	public void capturingCompleWebTableData()
	{

	// First Row of First Cell Property
	// /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]


	// Last Row of Last Cell Property
	// /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[8]

	// To goto every Row
	for(int rowIndex=1;rowIndex<=36;rowIndex++)
	{
	// to goto every Row of all its Corresponding Cells
	for(int rowOfCellIndex=1;rowOfCellIndex<=8;rowOfCellIndex++)
	{
	By webTableDataProperty=By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr["+rowIndex+"]/td["+rowOfCellIndex+"]");
	WebElement webTableData=driver.findElement(webTableDataProperty);
	String webTableDataText=webTableData.getText();
	System.out.print(webTableDataText+" | ");
	}
	System.out.println();
	}


	}

	
	
	
	
	
}
