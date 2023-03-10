package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1
{     
	// How to open Browser
	public static void main(String[] args) throws InterruptedException
     {
	    //Step-I
		//Parameter-1:-Name the Browser
		//Parameter-2:-Copy the path of Chromedriver.exe file
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe"); //static method
		
		// Create the object of Chromedriver class by providing refrence of webdriver(interface)
		
		WebDriver Driver=new ChromeDriver();
		
		//Enter URL
		Driver.get("https://www.facebook.com");  //nonstatic method
		
	   //Wait
		Thread.sleep(2000); //static method
		
		//Enter UN
		Driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc123@gmail.com");  //super context nonstatic method
		
     }
}
