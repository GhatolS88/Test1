package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_up_down_by_scrollintoView
{	
	public static void main(String[] args) throws InterruptedException
	{	
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver  driver=new  ChromeDriver();
		
		//open URL
		driver.get("https://demo.guru99.com/test/guru99home/");
		
		driver.manage().window().maximize();
		
		//wait
		Thread.sleep(2000);
		
		//identify element we have to scroll
		WebElement  Ele=driver.findElement(By.xpath("//a[text()='Facebook']"));
		
		//To perform scrollintoView//downcasting
		((JavascriptExecutor)driver).executeScript("arguments[0].ScrollIntoView();",Ele);
		
		
		
		
		
		
		
		
	}

}
