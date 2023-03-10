package Scrrenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Sample1
{	
	
	public static void main(String[] args) throws InterruptedException, IOException
	{	
		//Step-I
		//parameter-1:-Name of the browser
		//parameter-2:-Copy the path of chromedriver.exe file
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		
		//create the object of chromedriver class by providing reference of webdriver interface
		WebDriver  Driver=new ChromeDriver();   // Upcasting
		
		//enter url/open application
		Driver.get("https://www.facebook.com/");
		
		//wait
		Thread.sleep(2000);
		
		//To take screenshot of webpage
		//downcasting/convert/Typecast
		
		     File     Source =((TakesScreenshot)Driver).getScreenshotAs(OutputType.FILE);
		     
		     System.out.println(Source);
		     
		     File     Destination=new       File("D:\\Automation\\selenium\\screenshot1\\sample1.jpg");
		    		 
		    FileHandler.copy(Source, Destination);   //FileHandler is inbuilt class
	}

}
