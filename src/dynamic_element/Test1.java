package dynamic_element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1
{	
	public static void main(String[] args) throws InterruptedException
	{	
		//step-1
		//parameter-1:name of the browser
		//parameter-2:copy the path of chromedriver
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		
		//create the object of chromedriver class by providing reference of webdriver interface
		
		WebDriver  Driver=new  ChromeDriver();
		
		//open URL
		Driver.get("https://www.flipkart.com/");
		
		Driver.manage().window().maximize();
		//wait
		Thread.sleep(2000);
		
		//close the hidden pop
		Driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		//wait
		Thread.sleep(2000);
		
		 //Enter "redmi note 10s" 
		Driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("redmi note 10s");
		
		//wait
		Thread.sleep(2000);
		
		////Click search Button
		Driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		
		//wait
		Thread.sleep(2000);
		
		//to handle dynamic element first find child code in html script then from child code goes to parrent code find relative xpath
		//identify rating element
	  WebElement	SD=Driver.findElement(By.xpath("((//div[@class='_2kHMtA'])[1]//span)[6]"));
	  //wait
	  Thread.sleep(2000);
	  
	  //to get the text of webelement
	  String   Rating=SD.getText();
	  
	  System.out.println(Rating);
	  
	   
	  
		
	}

}



