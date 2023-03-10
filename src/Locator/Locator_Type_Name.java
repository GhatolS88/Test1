package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_Type_Name
{	
	
	  public static void main(String[] args) throws InterruptedException
	  {
		//Step-I
		//Parameter-1:-Name of the Browser
	    //Parameter-2:-Copy the path of Chromedriver.exe file
		  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		  
		  //Create object of chromedriver class by providing refrence of webdriver interface
		   WebDriver Driver=new ChromeDriver();
		   
		   //Enter URL
		   Driver.get("file:///C:/Users/Shree/Desktop/Automation/selenium/name1.html");
		   //Wait
		   Thread.sleep(2000);
		   //Enter UN
		   Driver.findElement(By.name("1234")).sendKeys("ABC@123");
		   //Wait
		   Thread.sleep(2000);
		   //Enter PSW
		   Driver.findElement(By.name("5678")).sendKeys("53421");
	  }

}
