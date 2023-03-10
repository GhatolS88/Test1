package Listbox;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_by_value
{	
	//Open Browser
	public static void main(String[] args) throws InterruptedException,IOException
	{	
		//Step-1
		//Parameter-1:Name of the browser
		//parameter-2:Copy the path of chromedriver.exe file
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		
		//Create the object of chromedriver class by providing reference of webdriver interface
		 WebDriver Driver=new  ChromeDriver();
		 
		 //Open application
		 Driver.get("https://www.facebook.com");
		 
		 //Wait
		 Thread.sleep(2000);
		 
		 //click on create new account button
		 
		 
		 Driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		 //wait
		 Thread.sleep(2000);
		 
		 //Step-I: Identify Listbox and Store it into an object 
         WebElement       Month=Driver.findElement(By.xpath("//select[@id='month']"));
         
         //step-II : create object of select class
         
         Select S1=new  Select(Month);
         
         //step-III:call method
         S1.selectByValue("9");  //sep
         
		 
		
	}

}
