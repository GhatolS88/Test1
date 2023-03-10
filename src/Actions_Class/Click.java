package Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Click
{	
	public static void main(String[] args) throws InterruptedException
	{	
		//Step-1
		//parameter-1:name of the browser
		//parameter-2:copy the path of chromedriver.exe file
		System.setProperty("Webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		
		//To create the object of chromedriver class by providing reference of webdriver interface
		WebDriver   Driver=new  ChromeDriver();
		
		//To open application
		Driver.get("https://demo.automationtesting.in/Frames.html");
		
		//wait
		Thread.sleep(2000);
		
		 //Step-I: Identify element and Store it into an object 
		WebElement  Dropdown=Driver.findElement(By.xpath("//a[text()='SwitchTo']"));
		
		//Step-II:Create object of Actions Class
		Actions   Ac=new  Actions(Driver);
		
		//Call method to move cursor
		
		Ac.moveToElement(Dropdown).perform();
		
		//wait
		Thread.sleep(2000);
		
		//click on window
		Driver.findElement(By.xpath("//a[text()='Windows']")).click();
		
		
	}

}
