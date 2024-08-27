package FLIPCART;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class testdata_flipcart
{

	WebDriver driver;
	String applicationUrlAddress="https://www.flipkart.com/";

	@BeforeTest
	public void applicationLauch()
	{

       System.setProperty("webdriver.Chrome.driver", "./browerfiles/chromedriver - Copy.exe");
	//WebDriver driver = new ChromeDriver();
	driver = new ChromeDriver();

	driver.get(applicationUrlAddress);

	driver.manage().window().maximize();

	//Thread.sleep(10000);

	}

	@AfterTest
	public void applicationClose()
	{
	driver.close();
	}
}
