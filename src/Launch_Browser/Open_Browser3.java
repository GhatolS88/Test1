package Launch_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open_Browser3
{  
	// How to open Launch/browser
	
   public static void main(String[] args) 

   {
	
	   //Step-I
	   //parameter-I:-Name of Browser
	   //parameter-II:-Copy the path of chromedriver.exe.file
	   
	   System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
	   
	   //Create object of chromedriver by providing refrence of webdriver
	   
	   WebDriver  Driver=new  ChromeDriver();
	   
	   // Enter Url
	   Driver.get("https://www.instagram.com");
	   
	  	  
	
    }
}
