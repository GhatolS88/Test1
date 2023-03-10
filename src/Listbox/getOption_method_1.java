package Listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getOption_method_1
{	
	public static void main(String[] args) throws InterruptedException
	{	
		//Step-1
		//parameter-I:-name of the browser
		//parameter-II:-copy the path of chromedriver.exe file
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		
		//create the object of chromedriver class by providing reference of webdriver interface
		 WebDriver    Driver=new   ChromeDriver();  //upcasting
		 
	    //Open application
		 Driver.get("file:///D:/Automation/selenium/MultiselectableListbox.html");
		 
		//wait
		 Thread.sleep(2000);
		 //identify the list box and store it into object
		 
		  WebElement   Multiselectable= Driver.findElement(By.xpath("//select[@id='1234']"));
		  
		  //create the object of select class
		  
		  Select  S1=new  Select(Multiselectable);
		  
		  //call methods
		  List<WebElement>    S2=S1.getOptions();   //Address----->4
		  
		  for(WebElement  S3:S2)                 //Ind(1)  Sri(2) Pak(3)  Aus(4)
		  {
			String   Text =S3.getText();  //Ind  Sri  Pak   Aus
			
			System.out.println(Text);   //Ind  Sri  Pak  Aus
		  }
		  
		 
		 
		
	}

}
