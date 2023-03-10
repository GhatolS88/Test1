package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Noramal_Class
{	
	public static void main(String[] args) throws InterruptedException
	{	
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver  Driver=new  ChromeDriver();
		
		//open URL
		Driver.get("https://demo.automationtesting.in/Frames.html");
		
		//wait
		Thread.sleep(2000
				);
		
	}

}
