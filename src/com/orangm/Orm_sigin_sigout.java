 package com.orangm;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orm_sigin_sigout {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\java programe testing\\BasicProgramJava\\browerfiles\\.exe");
		ChromeDriver driver = new ChromeDriver();
		
		String applicatioString ="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
		
	//	driver.get("https://www.google.com/webhp?authuser=1");
		driver.get(applicatioString);
 String actual_orangehramhomepagetitle=driver.getTitle();
 System.out.println("The title of the orangehram home page is :-"+actual_orangehramhomepagetitle);
 
 String expected_orangehramhomePageTitle="OrangeHRM";//should be
 System.out.println(" The Expected title of the orangehram Home Page is :- "+expected_orangehramhomePageTitle);


if(actual_orangehramhomepagetitle.equals(expected_orangehramhomePageTitle))
 
 {
 System.out.println(" Title of the Orangehram HomePage matched - PASS ");
 }
 else
 {
 System.out.println(" Title of the Orangehram HomePage NOT matched - FAIL ");
 
 
System.out.println(" The User/TestEngineer Given Url address is :- applicatioString  ");


//Get the current URL of Login Page

String expected_OrangeHRMLoginpageURL="orangehrm-4.2.0.1";
System.out.println(" The Expected Current URL of the OrangeHRM Login Page is :- "+expected_OrangeHRMLoginpageURL);

String actual_OrangeHRMLoginpageURL=driver.getCurrentUrl();
System.out.println("The actual current url of the OrangeHRM login page" +actual_OrangeHRMLoginpageURL);
if(actual_OrangeHRMLoginpageURL.contains(expected_OrangeHRMLoginpageURL))
{
System.out.println("The current URL of the Loginpage is Found - Pass");
}
else
{
System.out.println("The current URL of the Loginpage is Not Found - Fail");
}

//user name 
driver.findElement(By.id("txtUsername")).sendKeys("Charan");
driver.findElement(By.id("txtPassword")).sendKeys("Bhanu@123");
driver.findElement(By.id("btnLogin")).click();
driver.findElement(By.id("welcome")).click();
Thread.sleep(5000);
//<a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a
driver.findElement(By.linkText("Logout")).click();
//	driver.findElement(By.id("welcome")).click();

 
 
 
 
 
 
 
 
 
 
 
 
 
 
 }

 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
		
		
		
	}

}
