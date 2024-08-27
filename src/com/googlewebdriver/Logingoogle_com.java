package com.googlewebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logingoogle_com 
{
	
	public static void main(String[] args) 
	
	
	{
		WebDriver driver;
		String applicationUrlAddress="./https://www.google.com/webhp?authuser=1";

		System.setProperty("webdriver.chrome.driver", "./browerfiles/chromedriver.exe");

		
		driver = new ChromeDriver();

		driver.get(applicationUrlAddress);

	}
	
	
	
}
	
	

