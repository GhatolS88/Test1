package Customized_listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Arrow_Up
{	
	public static void main(String[] args) throws InterruptedException
		{	
		  
		   System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		   
		   WebDriver  Driver=new  ChromeDriver();  //Upcasting
		   
		   Driver.get("https://www.facebook.com/");
		   
		   Thread.sleep(2000);
		   
		 //Click create new Account Button
		   Driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		   
		   //wait
		   
		   Thread.sleep(2000);
		   
		   WebElement DC=Driver.findElement(By.id("(month"));
		   
		   Actions  ac=new Actions(Driver);
		   //call method (left click)
		   ac.click(DC).perform();
		   
		   Thread.sleep(2000);
		   
		   //To move one step down
		   ac.sendKeys(Keys.ARROW_DOWN).perform();
		   ac.sendKeys(Keys.ARROW_DOWN).perform();
		   ac.sendKeys(Keys.ARROW_DOWN).perform();
		   ac.sendKeys(Keys.ARROW_DOWN).perform();
		   
		   //to move one step up
		   ac.sendKeys(Keys.ARROW_UP).perform();
		   ac.sendKeys(Keys.ARROW_UP).perform();
		   
		
		
	    }

}
