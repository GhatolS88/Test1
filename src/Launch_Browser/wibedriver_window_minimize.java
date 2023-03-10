package Launch_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class wibedriver_window_minimize 
{
	 //Open browser
	public static void main(String[] args) throws InterruptedException
	{
		//Step-I
		//Parameter-1:-Name of the Browser
		//Copy the path of chromedriver.exe file
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		
		// Create object of chromedriver class by providing refrence of webdriver (interface)
		
		  WebDriver Driver=new ChromeDriver();  //Upcasting
		
		// Enter URL
		
		Driver.get("https://www.facebook.com");   //nonstatic method of webdriver interface
		
		// Wait
		
		Thread.sleep(2000);      //static method of Thread Class
		
		// To minimize the webpage
		
		Driver.manage().window().minimize();
		
		
		
	}

}
