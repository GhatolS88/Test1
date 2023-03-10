package Launch_Browser;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriver_window_SetPosition
{
	// How to open Browser
	public static void main(String[] args)
	{
		//Step-I
		//parameter-I:-Name of the Browser
		//Parameter-II:-Copy the path of Chromedriver.exe file
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		
		//Create the object of Chromedriver class by providing refrence of Webdriver(Interface)
		
		WebDriver Driver=new ChromeDriver(); 
		//Enter Url
		
		Driver.get("https://www.facebook.com");
		
		// To set position create object
		
		Point  P1=new Point(200,300);     
		
		Driver.manage().window().setPosition(P1);    // X----Y position
		
		
	}

}
