package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getText1
{	
	public static void main(String[] args) throws InterruptedException
	{	
		System.setProperty("webdriver.chrome.driver",  "C:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver  Driver=new  ChromeDriver();  //upcasting
		
		Driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		//click on create new account
		Driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(2000);
		
		////Step-I: Identify listbox and Store it into an object
		
		WebElement   Month=Driver.findElement(By.xpath("//select[@id='month']"));
		
		//create object of select class
		
		Select  S1=new  Select(Month);
		
		//call methods
		S1.selectByVisibleText("May");
		
		//to get text
		
		WebElement   S2=S1.getFirstSelectedOption();
		
		String text=S2.getText();  //may
		
		System.out.println(text);
	
		
	
	}
	

}
