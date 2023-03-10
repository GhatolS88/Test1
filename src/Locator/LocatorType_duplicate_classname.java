package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorType_duplicate_classname 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver   Driver=new  ChromeDriver();
		
		//Enter URL
		Driver.get("file:///C:/Users/Shree/Desktop/Automation/selenium/class2.html");
		//wait
		Thread.sleep(2000);
		//Enter UN
		Driver.findElement(By.className("xyz12")).sendKeys("SGGGGGG");
		//wait
		Thread.sleep(2000);
		//Enter PSW
		Driver.findElement(By.className("xyz12")).sendKeys("123@RT");
				
		
		
	}

}
