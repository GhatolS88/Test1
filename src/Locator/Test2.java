package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2
{    
	public static void main(String[] args) throws InterruptedException 
	{
	      //Step-I
	     //Parameter-1:-Name of the Browser
	     // Parameter-2:-Copy the path of Chromedriver.exe file
	    System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
	
	     // create the Object of Chromedriver class by providing refrence of webdriver (interface)
	
	    WebDriver   Driver=new  ChromeDriver();
	    
	    //To Enter URL/open application
	    Driver.get("https://www.facebook.com");
	    
	    //Wait
	    Thread.sleep(2000);
	    	   
	    //Enter password
	    Driver.findElement(By.xpath("//input[@ Class='inputtext_55r1_61uy_9npi']")).sendKeys("54321@viraj");
    }
}
