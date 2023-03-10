package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_contains_Attribute
	{
       public static void main(String[] args) throws InterruptedException
       {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver  Driver=new  ChromeDriver();
		
		//Enter Url
		Driver.get("https://kite.zerodha.com");
		
		//wait
		Thread.sleep(2000);
		
		//Eneter User ID
		
		Driver.findElement(By.xpath("//input[contains(@id,'userid')]")).sendKeys("GTOB90");
	   }
	}
