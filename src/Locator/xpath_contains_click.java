package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_contains_click
	{
		public static void main(String[] args) throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver  Driver=new  ChromeDriver();
			
			//Enter URL
			
			Driver.get("https://kite.zerodha.com");
			
			//Wait
			Thread.sleep(2000);
			
			//Click "Forgot UserID or Password"
			
			Driver.findElement(By.xpath("//a[contains(text(),'Forgot user ID' )]")).click();
			
	
} 
    }
