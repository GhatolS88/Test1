package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel3
{	
	@Test
	public void OpenKite() throws InterruptedException
	{	
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver  Driver=new  ChromeDriver();
		
		Driver.get("https://kite.zerodha.com");
		
		//wait
		Thread.sleep(2000);
				
		
	}

}
