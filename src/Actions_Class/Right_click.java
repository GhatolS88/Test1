package Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Right_click 
{	
	public static void main(String[] args) throws InterruptedException
	{	
		
		//Step-1
		//parameter-1:name of the browser
		//parameter-2:copy the path of chromedriver.exe file
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		
		//To create the object of chromedriver class by providing webdriver interface
		WebDriver  Driver=new  ChromeDriver();
		
		//To open URL
		
		Driver.get("https://www.flipkart.com/");
		
		Driver.manage().window().maximize();
		
		//wait
		Thread.sleep(2000);
		
		//close the hidden-division popup
		Driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		//wait
		Thread.sleep(2000);
		
		//Step-1:identify element and store it into object
		WebElement  D1=Driver.findElement(By.xpath("//span[text()='Cart']"));
		
		//step-2:create the object of actions class
		Actions   Ac=new   Actions(Driver);
		
		//call methods(Right click)
		Ac.contextClick(D1).perform();
		
		
	
		
		
		
		
	}

}
