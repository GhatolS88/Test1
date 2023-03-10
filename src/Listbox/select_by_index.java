package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class select_by_index
{	
	public static void main(String[] args) throws InterruptedException
	{	
		//step-1
		//parameter-1:-name of the browser
		//parameter-2:copy the path of chromedriver.exe file
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		//create the object of chromedriverclass by providing reference of webdriver interface
		WebDriver   Driver=new  ChromeDriver();
		//open url
		Driver.get("file:///D:/Automation/selenium/MultiSelectable%20Listbox.html");
		//wait
		Thread.sleep(2000);
		////Step-I: Identify listbox and Store it into an object
	    WebElement        Index =Driver.findElement(By.xpath("//select[@id='1234']"));
	    
	    //step-II:create the object of select class
	    
	    Select  S1=new  Select(Index);
	    // step-III:-call method
	    S1.selectByIndex(0);
	    Thread.sleep(2000);
	    
	    S1.selectByIndex(1);
	   Thread.sleep(2000);
	   
	    S1.selectByIndex(2);
	   Thread.sleep(2000);
	   
	    S1.selectByIndex(3);
	    
	    
	    
	
		
	}

}
