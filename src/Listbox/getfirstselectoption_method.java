package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getfirstselectoption_method
{	
	public static void main(String[] args) throws InterruptedException
	{
	  //step-1
	  // parameter-1:name of the browser
	  // parameter-2:copy the path of chromedriver.exe file
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	 //create object of chromedriver class by providing reference of webdriver interface
		
		WebDriver   Driver=new  ChromeDriver();
		
		//open application
		Driver.get("file:///D:/Automation/selenium/MultiselectableListbox.html");
		//wait
		Thread.sleep(2000);
		
		//identify listbox and store it into object
		 WebElement       Multiselect=Driver.findElement(By.xpath("//select[@id='1234']"));
		 
		//Create object of select class
		 
		 Select  S1=new Select(Multiselect);
		 
		 //call methods
          S1.selectByIndex(0);  //Ind
          
          Thread.sleep(1000);
          S1.selectByIndex(1); //sri
          
          //To get the text of options
          
           WebElement     S2=S1.getFirstSelectedOption();  //address
           
                  String       Text=S2.getText();
                  
                  System.out.println(Text);
          
          
		
		
		
		
		
	}

}
