package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_type_id_duplicate
{	
	 public static void main(String[] args) throws InterruptedException
	 {	
		 //Step-I
		 //Parameter-1:-Name of Browser
		 //parameter-2:-Copy the path of Chromedriver.exe file
		 System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		 //Create object of chromedriver class by providing webdriver interface
		 WebDriver Driver=new ChromeDriver();  //upcasting
		 //Enter URL
		 Driver.get("file:///C:/Users/Shree/AppData/Local/Microsoft/Windows/INetCache/IE/YC2W5OLR/id1[1].html");
		 
		 //Enter UN
		 Driver.findElement(By.id("abc123")).sendKeys("ASFGNJ");
		 
		 //Wait
		 Thread.sleep(2000);
		 
		 // Enter PSW
		 Driver.findElement(By.id("abc123")).sendKeys("VBMVC");
		
	}

}
