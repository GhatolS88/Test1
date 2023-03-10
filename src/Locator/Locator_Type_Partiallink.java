package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_Type_Partiallink
{
	   public static void main(String[] args) throws InterruptedException
	   {
		//Step-I
		   //parameter-1:-name of the Browser
		   //Parameter-2:-Copy the path of chromedriver.exe file 
		   System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		   //create the object of chromedriver class by providing refrence of webdriver interface
		   WebDriver  Driver=new ChromeDriver();
		   
		   //Enter URL
		   
		   Driver.get("file:///D:/Automation/selenium/linktext.html");
		   //Wait
		   Thread.sleep(2000);
		   //Click on facebook link
		   Driver.findElement(By.partialLinkText("face")).click();
		   
		   
	   }

}
