package Launch_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver_Method3
 
    {    
	   // How to open Browser
       public static void main(String[] args) throws InterruptedException
       
       {
    	   //step-I
    	   //parameter-I:- Name of browser
    	   //parameter-II:-copy the path of chromedriver.exe file
		 System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		 
		 //To create object of chromedriver class by providing refrence of webdriver(Interface)
		 
		 WebDriver Driver=new ChromeDriver();   //Upcasting
		 
		 //To enter URL/open application
		 
		 Driver.get("https://www.firstcry.com");
		 
		 // Wait
		 Thread.sleep(2000);
		 
		 // To close all current Tab
		 
		 Driver.quit();
		 
	   }
    }
