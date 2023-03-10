package Listbox;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select1
{	
	public static void main(String[] args) throws InterruptedException,IOException
	{	
		//Open Browser
		//Step-1
		//parameter-1:-Name of the Browser
		//parameter-2:Copy the path of chromedriver.exe file
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		
		//Create the object of chromedriver class byproviding refrence of webdriver interface
		
		WebDriver  Driver=new  ChromeDriver();  //upcasting
		
		//open application
		
		Driver.get("https://www.facebook.com/");
		
		//wait
		Thread.sleep(2000);
		
		//Click create new Account Button
		Driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		//wait
		Thread.sleep(2000);
		
		// //Step-I: Identify Listbox and Store it into an object  
		
	    WebElement	Month=Driver.findElement(By.xpath("//select[@title='Month']"));
	    
	    //Step-II:Create the object of select class
	    
	    Select         S1=new  Select(Month);
	    //step-III:-call method
	      S1.selectByIndex(11);
	    
	               
		
		
	}

}
