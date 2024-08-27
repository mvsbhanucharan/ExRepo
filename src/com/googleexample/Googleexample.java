package com.googleexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Googleexample {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\java programe testing\\BasicProgramJava\\browerfiles\\chromedriver - Copy.exe");
		ChromeDriver driver = new ChromeDriver();
		
		String applicatioString ="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
		
	//	driver.get("https://www.google.com/webhp?authuser=1");
		driver.get(applicatioString);

		driver.findElement(By.id("txtUsername")).sendKeys("Charan");
		driver.findElement(By.id("txtPassword")).sendKeys("Bhanu@123");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("welcome")).click();
		Thread.sleep(10000);
		//<a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a
		driver.findElement(By.linkText("Logout")).click();
	//	driver.findElement(By.id("welcome")).click();
		
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
		 }
		
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
		
		//<div id="logInPanelHeading">LOGIN Panel</div>


		By logInPanelProperty=By.id("logInPanelHeading");
		   WebElement loginPanel=driver.findElement(logInPanelProperty);
		   loginPanel.click();
		   String expected_OrangeHRMApplicationLoginPageText="LOGIN Panel";
		   System.out.println("The expected text of Orange HRM Application Login Page Is:-"+ expected_OrangeHRMApplicationLoginPageText);
		   String actual_OrangeHRMApplicationLoginPageText=loginPanel.getText();
		   System.out.println("The actual text of Orange HRM Application Login Page Is:-"+ actual_OrangeHRMApplicationLoginPageText);
		   if(actual_OrangeHRMApplicationLoginPageText.equals(expected_OrangeHRMApplicationLoginPageText))
		   {
		    System.out.println("Orange HRM Application Login Page is as expected - Pass ");
		   }
		   else
		   {
		    System.out.println("Orange HRM Application Login Page is as Not expected - Fail ");
		   }
		   
		 //Validate the title of Home Page
	         
	          String expected_OrangeHRMHomepageTitle="OrangeHRM";
	         
	          System.out.println(" The Expected title of the OrangeHRM Home Page is :- "+expected_OrangeHRMHomepageTitle);
	 
	   String actual_OrangeHRMHomePageTitle=driver.getTitle();
	   System.out.println(" The Actual title of the OrangeHRM Application Login Page is :- "+actual_OrangeHRMHomePageTitle);
	   if(actual_OrangeHRMHomePageTitle.equals(expected_OrangeHRMHomepageTitle))
	  {
	  System.out.println("Title of OrangeHRM Homepage is Matched:- Pass");
	  }
	  else
	  {
	  System.out.println("Title of OrangeHRM Homepage is Not Matched:- Fail");
	  }
	 
	  //Get the current URL of Home Page
	   
	  String expected_OrangeHRMHomepageURL="orangehrm-4.2.0.1";
	  System.out.println(" The Expected Current URL of the OrangeHRM Home Page is :- "+expected_OrangeHRMHomepageURL);
	 
	  String actual_OrangeHRMHomepageURL=driver.getCurrentUrl();
	  System.out.println("The actual current url of the OrangeHRM loginpage" +actual_OrangeHRMHomepageURL);
	  if(actual_OrangeHRMHomepageURL.contains(expected_OrangeHRMHomepageURL))
	  {
	  System.out.println("The current URL of the Homepage is Found - Pass");
	  }
	  else
	  {
	  System.out.println("The current URL of the Homepage is Not Found - Fail");
	  }
	 
		 
	driver.quit();


		}

}
