package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Xpath_click
{
	public static void main(String[] args) throws InterruptedException
		{
		 System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		 
		 WebDriver  Driver=new ChromeDriver();  //upcasting
		 
		 // Enter URL
		 Driver.get("https://www.facebook.com");
		 
		 //Wait
		 Thread.sleep(2000);
		 
		 //Click "Create New Account" Button
		 Driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	    }

}
