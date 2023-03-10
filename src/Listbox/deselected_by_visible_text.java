package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class deselected_by_visible_text
{	
	public static void main(String[] args) throws InterruptedException
	{
		
	//step-1
	//parameter-1:name of the browser
	//parameter-2:copy the path of chromedriver.exe file
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	
	//create the object of chromedriver class by providing webdriver interface
	WebDriver  Driver=new  ChromeDriver();  //upcasting
	//open url
	Driver.get("file:///D:/Automation/selenium/MultiSelectable%20Listbox.html");
	//wait
	Thread.sleep(2000);
	//Step-I: Identify listbox and Store it into an object
	WebElement      Multiselectable=Driver.findElement(By.xpath("//select[@id='1234']"));
	
	//step-I:-create object of select
	Select  S1=new   Select(Multiselectable);
	//step-II:-call method
	S1.selectByIndex(0);
	Thread.sleep(1000);
	S1.selectByIndex(1);
	Thread.sleep(1000);
	S1.selectByIndex(2);
	Thread.sleep(1000);
	S1.selectByIndex(3);
	Thread.sleep(1000);
	
	
	//to deselect option
	
	S1.deselectByVisibleText("PAK");
	
	S1.deselectByVisibleText("SRI");
	
	
	
	
	
	}	

}
