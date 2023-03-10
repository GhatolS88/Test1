package Pop_up;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_pop_up
{	
	public static void main(String[] args) throws InterruptedException
	{	
		//step-1
		//parameter-I:name of the browser
		//parameter-II:copy the path of chromedriver.exe file
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		//create the object of chromedriver class by providing reference of webdriver interface
		
		WebDriver  Driver=new  ChromeDriver();
		
		//open application
		Driver.get("https://demo.guru99.com/test/delete_customer.php");
		//wait
		Thread.sleep(2000);
		
		//Enter customer ID
		Driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("abc@123");
		//wiat
		Thread.sleep(2000);
		//click on submit button
		Driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		//wait
		Thread.sleep(2000);
		//To switch to Alert we use method and store it into object
		Alert  Alt=Driver.switchTo().alert();
		
		//wait
		Thread.sleep(1000);
		//click on OK
		
		Alt.accept();
		
		
		
		
	}

}
