package Listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class getAllSelectedOption_1
{	
	public static void main(String[] args) throws InterruptedException
	{	
		//step-1
		//parameter-1:name of the browser
		//parameter-2:copy the path of chromedriver.exe file
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\\\chromedriver.exe");
		//create the object of chromedriver class by providing reference of webdriver interface
		
		WebDriver   Driver=new  ChromeDriver();   //upcasting
		
		//open url
		Driver.get("file:///D:/Automation/selenium/MultiselectableListbox.html");
		
		//wait
		Thread.sleep(2000);
		//identify listbox and store it into object
		
		WebElement   Multiselectable=Driver.findElement(By.xpath("//select[@id='1234']"));
		
		//create object of select class
		
		Select  S1=new  Select(Multiselectable);
		
		//call methods
		S1.selectByIndex(0);
		Thread.sleep(1000);
		
		S1.selectByIndex(1);
		Thread.sleep(1000);
		
		S1.selectByIndex(2);
		//To get Text of all selected option
		
		
		List<WebElement>  Address=S1.getAllSelectedOptions();
		
		for(  WebElement  S3:Address)   //ind(0) 
			
		{
			String   S4=S3.getText();
			System.out.println(S4);
		}
		
		
		
		
	}

}
