package com.webtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WebTable_GetCityName_FirstRowOfFirstCell extends BaseTest
{
	@Test(priority=1,description="Getting the City Name from the WebTable")
	public void webTable_getCityName()
	{

	// Locator - xpath
	// Selector - xpath Expression -( is the sequience of the HTML Tags from the Top of the Source code till the inspected WebElement Tag Name)
	 // /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1] - Xpath Expression


	/* xpath is of 2 types
	   
	   1. Absolute Xpath - html tag
	   2. Relative Xpath - //
	       
	*/

	By cityNameProperty=By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]");
	WebElement cityName=driver.findElement(cityNameProperty);
	String cityNameText=cityName.getText();

	System.out.println(cityNameText);

	}

	
	
}
