package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Attribute 
{
		public static void main(String[] args) throws InterruptedException
		{	
		  //Step-I
		  //Parameter-1:-Name of the Browser
		  //parameter-2:-Copy the path of the chromedriver.exe file
			
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
			
	    	//create object of chromedriver by providing refrence of webdriver
			WebDriver  Driver=new  ChromeDriver();  //upcasting
			
			//Enter URL
			Driver.get("https://www.facebook.com");
			//Wait
			Thread.sleep(2000);
			
			// click on "Forget Password" 
			Driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
			
			
			
		}

}
