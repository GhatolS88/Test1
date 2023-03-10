package Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drag_and_drop 
{	
	public static void main(String[] args) throws InterruptedException
	{
		
	//step:-1 open browser
	//parameter-1:name of the browser
	//parameter-2:copy the of chromedriver.exe file
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	
	 //create the object of chromedriver by providing reference of webdriver interface
	 WebDriver  Driver=new  ChromeDriver();
	 // Open application
	 Driver.get("https://demo.guru99.com/test/drag_drop.html");
	 
	 Driver.manage().window().maximize();
	 
	 //wait
	 Thread.sleep(2000);
	 //identify element and store it into object
	  WebElement  Source=Driver.findElement(By.xpath("//a[text()=' 5000']"));
	 
	 
	  WebElement   destination=Driver.findElement(By.xpath("(//h3[@class='ui-widget-header'])[6]"));
	  //create the object of actions class
	  Actions   Ac=new  Actions(Driver);
	  //call method
	  Ac.dragAndDrop(Source, destination).perform();
	
	}
	

}