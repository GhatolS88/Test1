package Customized_listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ARROW_DOWN
{	
	public static void main(String[] args) throws InterruptedException 
	{
		//step-1
		//parameter-1:name of the browser
		//parameter-2:copy the path of chromedriver.exe file
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		//create the object of chromedriver class by providing reference of webdriver interface
	     WebDriver    Driver=new   ChromeDriver();
	     //Toopen application
	     Driver.get("https://www.facebook.com");
	     //wait
	     Thread.sleep(2000);
	     //click on create new account
	     Driver.findElement(By.xpath("//a[text()='Create new account']")).click(); 
	     
	     //identify listboxand store it into object
	     WebElement  Source=Driver.findElement(By.id("(month"));
	     
	     //create the object of actions class
	     Actions  ac=new Actions(Driver);
	     
	     //Call method
	     ac.click(Source).perform();
	     
	     //wait
	     Thread.sleep(2000);
	     //to move  one step down
	     ac.sendKeys(Keys.ARROW_DOWN).perform();
	     ac.sendKeys(Keys.ARROW_DOWN).perform();
	     
	
		
	}

}
