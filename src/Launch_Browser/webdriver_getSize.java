package Launch_Browser;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriver_getSize
{
	public static void main(String[] args)	
		{
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver Driver=new ChromeDriver();
			
			// Enter URL
			Driver.get("https://www.facebook.com");
			
			// Calling getsize method 
		Dimension	Size=Driver.manage().window().getSize();
		
		System.out.println(Size);
			
			
        }
	
  }
