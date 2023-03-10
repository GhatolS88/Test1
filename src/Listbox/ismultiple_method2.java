package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ismultiple_method2
{	
	public static void main(String[] args) throws InterruptedException
	{	
		//step-1
		//parameter-1:name of the browser
		//parameter-2:copy the path of chromedriver.exe file
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		
		//create the object of chromedriver class by providing webdriver interface
		WebDriver  Driver=new  ChromeDriver();
		//open application
		Driver.get("file:///D:/Automation/selenium/MultiselectableListbox.html");
		//wait
		Thread.sleep(2000);
		//identify the list box nd store it into object
	     WebElement   Multiselectable=Driver.findElement(By.xpath("//select[@id='1234']"));
	     
	     //create the object of select
	     Select  S1=new  Select(Multiselectable);
	     //call methods
	       Boolean   S2=S1.isMultiple();  //single---->false,//multi--->true 
	       
	       System.out.println(S2);
	     
	     
		
	}

}
