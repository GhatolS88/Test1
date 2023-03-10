package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class parallel1
{	
	@Test
	public void OpenFacebook() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver Driver=new  ChromeDriver();
		
		//open URL
		Driver.get("https://www.facebook.com/");
		
		//wait
		Thread.sleep(2000);
	}

}
