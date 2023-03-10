package Launch_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open_Browser_2
{
	//How to Launch/open Browser
	
	public static void main(String[] args)
	{    
		//Step-I:
		//Parameter-I:-Name of the Browser
		//parameter-II:-Path of chromeDriver.exe.file
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		
		// create object of ChromeDriver Class  by providing reference of  WebDriver(Interface)
		
		WebDriver Driver=new ChromeDriver();     // UpCasting  //Webdriver (interface having 13 method)------>Driver contain WebDriver method
		
		// To Enter Url
		
		 
		Driver.get("https://www.hotstar.com/in");
		
	}

}
