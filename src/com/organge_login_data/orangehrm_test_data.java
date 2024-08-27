package com.organge_login_data;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class orangehrm_test_data
{

	public static void main(String[] args) throws IOException, InterruptedException {


		WebDriver driver;
		String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";

		System.setProperty("webdriver.chrome.driver", "./browerfiles/chromedriver - Copy.exe");

		
		 driver = new ChromeDriver();

		driver.get(applicationUrlAddress);

		String expected_OrangeHRMApplicationLogInPageTitle="OrangeHRM";
		System.out.println(" The expected Title of the OrangeHRM Application LogIN Page is :- "+expected_OrangeHRMApplicationLogInPageTitle);   
		 


		String actual_OrangeHRMApplicationLogInPageTitle=driver.getTitle();
		System.out.println(" The actual Title of the OrangeHRM Application LogIN Page is :- "+actual_OrangeHRMApplicationLogInPageTitle);

		if(actual_OrangeHRMApplicationLogInPageTitle.equals(expected_OrangeHRMApplicationLogInPageTitle))
		{
		System.out.println(" Successfully Navigated to the OrangeHRM Application LogIN Page - PASS ");
		}
		else
		{
		System.out.println(" Failed to Navigate to the OrangeHRM Application LogIN Page - FAIL ");
		}

		System.out.println();
		


		String expected_OrangeHRMApplicationLogInPageUrlAddress="orangehrm-4.2.0.1";
		System.out.println(" The Expected URL address of the OrangeHRM Application LogIN Page is :- "+expected_OrangeHRMApplicationLogInPageUrlAddress);

		String actual_OrangeHRMApplicationLogInPageUrlAddress=driver.getCurrentUrl();
		System.out.println(" The Actual URL address of the OrangeHRM Application LogIN Page is :- "+actual_OrangeHRMApplicationLogInPageUrlAddress);

		if(actual_OrangeHRMApplicationLogInPageUrlAddress.contains(expected_OrangeHRMApplicationLogInPageUrlAddress))
		{
		System.out.println(" Successfully Navigated to the OrangeHRM Application LogIN Page - PASS ");
		}
		else
		{
		System.out.println(" Failed to Navigate to the OrangeHRM Application LogIN Page - FAIL ");
		}

		System.out.println();

	

		String expected_OrangeHRMApplicationLogInPageText="LOGIN Panel";
		System.out.println(" The Expected TEXT of the OrangeHRM Application LogIN page is :- "+expected_OrangeHRMApplicationLogInPageText);

	
		By orangeHRMApplicationLogInPageLogInPanelTextProperty=By.id("logInPanelHeading");
		WebElement orangeHRMApplicationLogInPageLogInPanel=driver.findElement(orangeHRMApplicationLogInPageLogInPanelTextProperty);

		String actual_OrangeHRMApplicationLogInPageLogInPanelText=orangeHRMApplicationLogInPageLogInPanel.getText();

		System.out.println(" The Acutal Text of OrangeHRM Application LogIn Page TEXT is :- "+actual_OrangeHRMApplicationLogInPageLogInPanelText);

		if(actual_OrangeHRMApplicationLogInPageLogInPanelText.equals(expected_OrangeHRMApplicationLogInPageText))
		{
		System.out.println(" Successfully Navigated to the OrangeHRM Application LogIN Page - TEXT Found - PASS ");
		}
		else
		{
		System.out.println(" Failed to Navigate to the OrangeHRM Application LogIN Page - TEXT NOT Found - FAIL ");
		}

		System.out.println();

		// getting the Test Data from the External File


		FileInputStream logInTestDataFile = new FileInputStream("./src/com/excle_testdata/OrangeHRM_LogInTestData.xlsx");
	
		XSSFWorkbook workBook = new XSSFWorkbook(logInTestDataFile);
		XSSFSheet logInTestDataSheet = workBook.getSheet("orange hrm test data");
		
		int rowsCount=logInTestDataSheet.getLastRowNum();

		for(int rowIndex=1;rowIndex<=rowsCount;rowIndex++)
		{
			
			Row row=logInTestDataSheet.getRow(rowIndex);

			
			int rowOfCellsCount=row.getLastCellNum();
			
			Cell rowofcell=row.getCell(0);
		String usernametestdata=rowofcell.getStringCellValue();

		
	try {
	
		By userNameProperty=By.id("txtUsername"); // Property of an element assigned to a variable
		WebElement userName=driver.findElement(userNameProperty); // Identify the element in the Current WebPage
		userName.sendKeys(usernametestdata);// Operation on the Identified WebElement

		// <input name="txtPassword" id="txtPassword" autocomplete="off" type="password">

		
		rowofcell=row.getCell(1);
		String passwordtestdata=rowofcell.getStringCellValue();

		By passwordProperty=By.name("txtPassword");
		WebElement password=driver.findElement(passwordProperty);
		password.sendKeys(passwordtestdata);

		// <input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">

		By logInButtonProperty=By.className("button");
		WebElement logInButton=driver.findElement(logInButtonProperty);
		logInButton.click();

		System.out.println();

		// Expected Title should be - OrangeHRM


		String expected_OrangeHRMApplicationHomePageTitle="OrangeHRM";
		System.out.println(" The expected Title of the OrangeHRM Application HOME Page is :- "+expected_OrangeHRMApplicationHomePageTitle);


		String actual_OrangeHRMApplicationHomePageTitle=driver.getTitle();
		System.out.println(" The actual Title of the OrangeHRM Application Home Page is :- "+actual_OrangeHRMApplicationHomePageTitle);

		if(actual_OrangeHRMApplicationHomePageTitle.equals(expected_OrangeHRMApplicationHomePageTitle))
		{
		System.out.println(" Successfully Navigated to the OrangeHRM Application HOME Page - PASS ");
		}
		else
		{
		System.out.println(" Failed to Navigate to the OrangeHRM Application HOME Page - FAIL ");
		}


		String expected_url="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";
		System.out.println(expected_url);
		
		String actual_url=driver.getCurrentUrl();
		System.out.println(actual_url);
		
		if(actual_url.equals(expected_url)) {
			System.out.println("Successfully navigated to the orangehrm application homepage- PASS");
			 Cell testresultcell=row.createCell(2);
			 testresultcell.setCellValue("Successfully navigated to the orangehrm application homepage- PASS");
			 
		}
		else {
			System.out.println("Failed to navigate to the orangehrm application homepage- FAIL");
			Cell testresultcell = row.createCell(2);
			testresultcell.setCellValue("Failed to navigate to the orangehrm application homepage- FAIL");
		}
	
		
		
		

		FileOutputStream testResultFile = new FileOutputStream("./src/com/excle_testdata/OrangeHRM_LogInTestData.xlsx");
		workBook.write(testResultFile);

		By welComeAdminProperty=By.partialLinkText("Welcome");

		WebElement welComeAdmin=driver.findElement(welComeAdminProperty);

		welComeAdmin.click();

		Thread.sleep(5000);


		By logOutProperty=By.partialLinkText("Logo"); // considering a part of the Text of the LINK as Selector
		WebElement logOut=driver.findElement(logOutProperty);
		logOut.click();

		
		
	}	
	catch (Exception bhanu) {
		
		System.out.println(bhanu);
	}	
	
	}
		driver.quit();
	 ;
		}
	
	
	
	
	
	
	
	
	
}
