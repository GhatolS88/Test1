package Launch_Browser;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriver_window_getPosition
{     
	// How to open browser
	 public static void main(String[] args)
	 {	
		 System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		 
		 WebDriver  Driver=new ChromeDriver();
		 
		 Driver.get("https://www.facebook.com");
		 
		 
		   Point   Position=Driver.manage().window().getPosition();   //to get position create object of point class
		   
		   System.out.println(Position);
		  
		  
		
	}

}
