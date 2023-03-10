package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class deselect_by_index 
{	
	public static void main(String[] args) throws InterruptedException
	{	
		//Step-I
		//parameter-1:name of the browser
		//parameter-2:copy the pathe of chromedriver.exe file
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		//create the object of chromedriver class by providing reference of webdriver
		WebDriver Driver=new  ChromeDriver();  //upcasting
		
		//open url
		Driver.get("file:///D:/Automation/selenium/MultiSelectable%20Listbox.html");
		
		//wait
		Thread.sleep(2000);
		////Step-I: Identify listbox and Store it into an object
		 WebElement  Multiselectable=Driver.findElement(By.xpath("//select[@id='1234']"));
		 //step-create object of select class
		 Select S1=new  Select(Multiselectable);
		 
		 //step-2:-call methods
		 S1.selectByIndex(0);
		 Thread.sleep(1000);
		 
		 S1.selectByIndex(1);
		 Thread.sleep(1000);
		 
		 S1.selectByIndex(2);
		 Thread.sleep(1000);
		 
		 S1.selectByIndex(3);
		 Thread.sleep(1000);
		 
		 //To deselect option
		 S1.deselectByIndex(1);
		 S1.deselectByIndex(3);
		 
		
		
		
	}

}
