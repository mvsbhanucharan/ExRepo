package com.LinksTesting;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TSRTC_HomePage_HeaderBlock_LinksTesting
{

public static void main(String[] args) {


System.setProperty("webdriver.chrome.driver", "./browerfiles/chromedriver - Copy.exe");
WebDriver driver = new ChromeDriver();

String applicationUrlAddress="https://www.tsrtconline.in/oprs-web/";
driver.get(applicationUrlAddress);

// Identifying the Header Block of the Webpage
// class="menu-wrap" - property of header Block

By tsrtcHomePageHeaderBlockProperty=By.className("menu-wrap");
WebElement tsrtcHomePageHeaderBlock=driver.findElement(tsrtcHomePageHeaderBlockProperty);

// <a class="selectedtabcopy" href="/oprs-web/guest/home.do?h=1" target="_top" title="Home">Home</a>
// <a class="tabcopy" href="/oprs-web/ticket/waitlist.do" target="_top" title="Enquiry">Enquiry</a>
//<a class="tabcopy blinking" href="/oprs-web/services/packagetours.do" target="_top" title="Tourism">Tourism</a>

// Header Block ELement Common property is a- tag
By tsrtcHomePageHeaderBlockLinksProperty=By.tagName("a");
// going the the Header Block and identifying the elements of the Header Block
List<WebElement>tsrtcHomePageHeaderBlockLinks=tsrtcHomePageHeaderBlock.findElements(tsrtcHomePageHeaderBlockLinksProperty);

int tsrtcHeaderBlockLinksCount=tsrtcHomePageHeaderBlockLinks.size();
System.out.println(tsrtcHeaderBlockLinksCount);

String[] expectedUrls = {
		
		"https://www.tsrtconline.in/oprs-web/",//home page
		"https://www.tsrtconline.in/oprs-web/guest/specialHire.do", //bus on contact
"https://www.tsrtconline.in/oprs-web/ticket/waitlist.do ",//Enquire page
		"https://www.tsrtconline.in/oprs-web/guest/ticket/cancel.do", // Cancel ticket
		"https://www.tsrtconline.in/oprs-web/services/cancel.do", //cancelled series
		"https://www.tsrtconline.in/oprs-web/home/aboutus.do", //about us
		"https://www.tsrtconline.in/oprs-web/services/packagetours.do", //Truism
		"https://www.tsrtconline.in/oprs-web/services/driverInfo.do" //drive info

		
	
		
		
};



// Displaying the Names of the Header Block
for(int arrayIndex=0;arrayIndex<tsrtcHeaderBlockLinksCount;arrayIndex++)
{
String tsrtcHomePageHeaderBlocLinkName=
        tsrtcHomePageHeaderBlockLinks.get(arrayIndex).getText();
System.out.println(arrayIndex+" - "+tsrtcHomePageHeaderBlocLinkName);

// Performing an Operation on the Header Block Links

tsrtcHomePageHeaderBlockLinks.get(arrayIndex).click();

// once click operation is done the webPage will be moved to the corresponding Next Page

String actual_WebPageTitle=driver.getTitle();
System.out.println(" The Title of the Navigated WebPage is:-  "+actual_WebPageTitle);

String actual_WebPageCurrentUrlAddress=driver.getCurrentUrl();
System.out.println(" The Current Url Address of the Navigated WebPage is:-  "+actual_WebPageCurrentUrlAddress);


System.out.println(" The current url adress of the navigated web page is Expected URL: " + expectedUrls[arrayIndex]);


if (actual_WebPageCurrentUrlAddress.equals(expectedUrls[arrayIndex])) {
    System.out.println("Verification successful - Expected URL matched: " + actual_WebPageCurrentUrlAddress);
} else {
    System.out.println("Verification failed - Expected URL: " + expectedUrls[arrayIndex] + ", Actual URL: " + actual_WebPageCurrentUrlAddress);
}


  // Once a Click operation is done on the WebElement - the driver focus is shifted
  //     to the very next Page

driver.navigate().back();

// since the driver focus is on the next Webpage - driver is redirected to the Previous WebPage


// Once the driver focus is shifted to very next WebPage - the information
// stored in the ArrayList will be immediately cleared Off - so is the
//    the script is then instructed to re-identify the Header Block again
tsrtcHomePageHeaderBlockProperty=By.className("menu-wrap");
tsrtcHomePageHeaderBlock=driver.findElement(tsrtcHomePageHeaderBlockProperty);

// finding all the WelElements of the Header Block and storing back to the
//   arrayList for another Time

// Header Block ELement Common property is a- tag
tsrtcHomePageHeaderBlockLinksProperty=By.tagName("a");
// going the the Header Block and identifying the elements of the Header Block
tsrtcHomePageHeaderBlockLinks=tsrtcHomePageHeaderBlock.findElements(tsrtcHomePageHeaderBlockLinksProperty);

System.out.println();


}

driver.quit();



}


}

	
	
	
	
	


