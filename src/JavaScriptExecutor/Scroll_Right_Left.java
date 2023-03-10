package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_Right_Left
{
	public static void main(String[] args) throws InterruptedException
	{
		//open Browser	
	System.setProperty("Webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver    driver=new   ChromeDriver();
	
	//open URL
	
	driver.get("https://demo.guru99.com/test/guru99home/");
	
	driver.manage().window().maximize();
		
	//wait
	Thread.sleep(2000);
	
	//identify element upto we have to scroll
	WebElement Element=driver.findElement(By.xpath("//a[@class='item']"));
	
	//To perform scroll Horizontally//downcasting
	((JavascriptExecutor)driver).executeScript("argument[0].scrollintoView();",Element);

	
			
	}
}
