package Launch_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriver_window_maximize_method

	{
	
	   public static void main(String[] args) throws InterruptedException
	   	{
		  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		  
		  WebDriver  Driver=new ChromeDriver();
		  
		  //Enter URL
		  
		  Driver.get("https://www.facebook.com");
		  
		  // Wait
		  Thread.sleep(2000);
		  
		  //To maximize the webpage
		  Driver.manage().window().maximize();
		  
		  
	    } 
	   
       
	
    }
