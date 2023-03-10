package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_type_id
{	
	  	public static void main(String[] args) throws InterruptedException
	  	{
		 System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		 //To create object of chromedriver class by providing refrence of webdriver
		 
		 WebDriver  Driver=new  ChromeDriver();
		 
		 //Enter URL
		 Driver.get("file:///D:/Automation/selenium/id1.html");
		 
		 //Wait
		 Thread.sleep(2000);
		 
		 //Enter UN
		 Driver.findElement(By.id("abc123")).sendKeys("ABCDFG");
		 
		 //wait
		 Thread.sleep(2000);
		 //Enter Psw
		 Driver.findElement(By.id("abc456")).sendKeys("ASD@123");
		 		
		 
		 
	    }

}
