package Launch_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_Method4
{
	//How to open the Browser

	      public static void main(String[] args) throws InterruptedException
           {
	            //Step-I
	            //Parameter-1:-Name of the Browser
	            //Parameter-2:-Copy the path of Chromedriver.exe.file
	        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
	  
	        //Create the object of chromedriver by providing reference of Webdriver
            WebDriver Driver=new ChromeDriver();   //Upcasting
            
	        // To Enter URL/ open application
            Driver.navigate().to("https://www.swiggy.com");
        
           }
	
    }
