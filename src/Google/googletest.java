package Google;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class googletest
{
public static void main(String[] args) {
	WebDriver driver;
	String applicationUrlAddress="https://www.youtube.com/";

	System.setProperty("webdriver.chrome.driver", "./browerfiles/chromedriver - Copy.exe");

	
	driver = new ChromeDriver();

	driver.get(applicationUrlAddress);

}
}
