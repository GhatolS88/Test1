package Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class left_click
{	
	public static void main(String[] args) throws InterruptedException
	{	
		
		//step-1
		//parameter-1:name of browser
		//parameter-2:copy the path of chromedriver.exe file
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		
		//create the object
		WebDriver Driver=new ChromeDriver();
		//open UrL
		Driver.get("https://www.flipkart.com/");
		
		Driver.manage().window().maximize();
		
		//wait
		Thread.sleep(2000);
		
		Driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		//wait
		Thread.sleep(2000);
		  //step-1:identify element and store into object
		 WebElement Cart=Driver.findElement(By.xpath("//span[text()='Cart']"));
		 		 
		 //step:-2:create object of action class
		 Actions  ac=new Actions(Driver);  //action class have no power to perform action on element so it uses driver power
		 
		 //step:-3 call method (Left Click)
		 
		 ac.click(Cart).perform();
		 
		
	    
		
		
		
	}

}
