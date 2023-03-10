package Pop_up;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_popup_dismiss 
{	
	public static void main(String[] args) throws InterruptedException
	{	
		//step-1
		//parameter-I:nameof the browser
		//parameter-II:copy the path of chromedriver.exe file
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		
		//create the object of chromedriver class by providing refrence of webdriver interface 
		WebDriver  Driver=new   ChromeDriver();
		//open application
		Driver.get("https://demo.guru99.com/test/delete_customer.php");
		//wait
		Thread.sleep(2000);
		//enter customer ID
		Driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("123@4AD");
		//wait
		Thread.sleep(2000);
		//clickon submitbutton
		Driver.findElement(By.xpath("//input[@name='submit']")).click();
		//wait
		Thread.sleep(2000);
		//To switch to Alert 
		Alert Alt=Driver.switchTo().alert();
		
		//click on ok
		Thread.sleep(1000);
		
		Alt.dismiss();
		
		
		
		
		
	}

}
