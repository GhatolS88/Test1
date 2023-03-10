package POM_DDF_TestNG_BaseClass_UtilityClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class POM_FB_Baseclass1
{	
	WebDriver   driver;
	public void InitializedBrowser() throws InterruptedException
	{
		
	
	
	System.setProperty("Webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	
	
    driver=new  ChromeDriver();  //upcasting
    
    //open Url
    driver.get("https://www.facebook.com");
    
    Thread.sleep(2000);
	}

}
