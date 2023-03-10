package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiselectable
{	
	public static void main(String[] args) throws InterruptedException 
	{	
		//open browser
		//step-1
		//parameter-I:name of the browser
		//parameter-II:-copy the path of chromedriver.exe file
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		//create object of chromedriver class by providing reference of webdriver interface 
		
		WebDriver  Driver=new   ChromeDriver();  //upcasting
		
		//open application
		Driver.get("file:///D:/Automation/selenium/MultiSelectable%20Listbox.html");
		//wait
		Thread.sleep(2000);
		
		//Step-I: Identify listbox and Store it into an object
		WebElement     Multiselectable=Driver.findElement(By.xpath("//select[@id='1234']"));  //findElement method cha returntype Webelement
		
		//step-II:-create the object of select class   
		Select  S1=new  Select(Multiselectable);     
		//call method
		S1.selectByVisibleText("IND");
		Thread.sleep(2000);
		
		S1.selectByVisibleText("PAK");
		Thread.sleep(2000);
		
		S1.selectByVisibleText("AUS");
		
	}

}
