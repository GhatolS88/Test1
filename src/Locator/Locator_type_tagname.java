package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_type_tagname
{	
		public static void main(String[] args) throws InterruptedException
		{
		 //Step-I
	     //Parameter-1:-Name of the Browser
		 //Parameter-2:-Copy the the chromedriver.exe file
			
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		
		//Create the object of chromedriver class by providing refrence of webdriver
		
		   WebDriver    Driver=new   ChromeDriver();
		   
		//Enter URL
		   Driver.get("file:///C:/Users/Shree/AppData/Local/Microsoft/Windows/INetCache/IE/KXVMSQH7/tagname[1].html");
		   
		 //wait
		   Thread.sleep(2000);
		   
		  //Enter UN
		   Driver.findElement(By.tagName("input")).sendKeys("AGDyRT");
		   
		   //wait
		   Thread.sleep(2000);
		   
		   //Enter Password
		   Driver.findElement(By.tagName("input")).sendKeys("123SDF");
		   
		}	   

}
