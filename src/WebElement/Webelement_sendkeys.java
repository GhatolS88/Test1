package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelement_sendkeys
{
	public static void main(String[] args) throws InterruptedException
	{
	//Step-I
	//Parameter-1:-Name of the browser
	//Parameter-2:-Copy the path of the chromedriver.exe file
		System.setProperty("Webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		
		// Create the object of chromedriver class by providing refrence of webdriver (interface)
		WebDriver  Driver=new  ChromeDriver();  //Upcasting
		
		//Enter URL
		Driver.get("https://www.facebook.com");
		
		//wait
		Thread.sleep(2000);
		
		//Enter UN
		Driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']")).sendKeys("ABC@123");
		
		
		    }

}
