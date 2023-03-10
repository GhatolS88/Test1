package JavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_up_Down
{	
	public static void main(String[] args) throws InterruptedException
	{
		//open browser
	
	System.setProperty("Webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver  driver=new  ChromeDriver();
	
	//open URL
	driver.get("https://demo.guru99.com/test/guru99home/");
	
	driver.manage().window().maximize();
	
	//wait
	Thread.sleep(2000);
	
	//scrolldown and enter 2nd paramter +ve//downcasting bet javascriptexecutor and driver
	((JavascriptExecutor)driver).executeScript("window.scrollBy(0,1000)");
	
	//wait
	Thread.sleep(5000);
	//scrollup and enter 2nd paramter -ve
	
	((JavascriptExecutor)driver).executeScript("window.scrollBy(0,-500)");
	
	}
	

}
