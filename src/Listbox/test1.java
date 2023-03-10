package Listbox;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class test1
{	
	public static void main(String[] args) throws InterruptedException,IOException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver    Driver=new  ChromeDriver();
		
		Driver.get("https://www.facebook.com/");

		Thread.sleep(2000);
		
		Driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		Thread.sleep(2000);
		
		WebElement      Month=Driver.findElement(By.xpath("//select[@id='month']"));
		
		Select  S1=new  Select(Month);
		
		S1.selectByIndex(3);
		
		
		
		
	}

}
