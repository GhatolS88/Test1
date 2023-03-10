package Customized_listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Enter_Keys 
{	
	public static void main(String[] args) throws InterruptedException
	{	
		//step-1
		//parameter-1:name of the browser
		//parameter-2:copy the path of chromedriver.exe file
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		//create object
		WebDriver  Driver=new ChromeDriver();
		//open URL
		Driver.get("https://www.facebook.com");
		//wait
		Thread.sleep(2000);
		//Click create new Account Button
		Driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		//wait
		Thread.sleep(2000);
		//step-1:identify element and store it into object
		WebElement  DOB=Driver.findElement(By.id("day"));
		
		//step-2:create the object of 
		Actions Ac=new   Actions(Driver);
		
		//call method (Enter key)
		Ac.click(DOB).perform();
		//wait
		Thread.sleep(2000);
		
		//To reach bottom
		for(int i=1; i<=25; i++)
		{
			Ac.sendKeys(Keys.ARROW_DOWN).perform();
		}
		
		//wait
		Thread.sleep(1000);
		
		//to select option
		Ac.sendKeys(Keys.ENTER).perform();
		
		
		
	}

}
