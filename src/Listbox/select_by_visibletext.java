package Listbox;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class select_by_visibletext 
{	
	public static void main(String[] args) throws InterruptedException,IOException
	{	
		//Step-1
		//Parameter-1:name of the browser
		//parameter-2:copy the path of chromedriver.exe file
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		
		//create the object of chromedriverclass by providing reference of webdriver interface
		
		WebDriver   Driver=new ChromeDriver();  //upcasting
		
		//open url
		Driver.get("https://www.facebook.com");
		
		//wait
		Thread.sleep(2000);
		
		//click on create new account button
		
		Driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		//wait
		Thread.sleep(2000);
		
		//Step-I: Identify Listbox and Store it into an object
		
		 WebElement     Month=Driver.findElement(By.xpath("//select[@id='month']"));
		 
		 //step-II:Create object of select class
		 Select  S1=new   Select(Month);
		 
		 //step-III:call method
		 S1.selectByVisibleText("Sep");
		 
		
		
		
	}

}
