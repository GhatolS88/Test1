package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelement_object 
{
	  public static void main(String[] args) throws InterruptedException
	  {
		//Step-I
		//Parameter-1:-Name of the browser
		//Parameter-2:-Copy the path of chromedriver.exe file
		  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		  
		//Create object of chromedriver class by providing reference of webdriver interface
		  WebDriver  Driver=new  ChromeDriver();   //Upcasting
		  
		//Enter URL/open Application
		  Driver.get("https://www.facebook.com");
		  
		//wait
		 Thread.sleep(2000);
		 // Enter UN
	      WebElement    U1= Driver.findElement(By.xpath(" //input[@name='email']"));
	     //wait
		 Thread.sleep(2000);
	      
	      //To Enter UN
	      U1.sendKeys("ABC@123");
	      
	      //wait
		 Thread.sleep(2000);
	      //To clear UN
	      U1.clear();
	      //wait
		 Thread.sleep(2000);
	      //To Enter UN
	      U1.sendKeys("Sonali");
		  
		  
		 
	  }
 
}
