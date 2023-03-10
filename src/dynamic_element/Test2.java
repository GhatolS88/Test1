package dynamic_element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2
{
	public static void main(String[] args) throws InterruptedException
	{
		
	//open browser
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	WebDriver  driver=new  ChromeDriver();
	//open URL
	driver.get("https://www.flipkart.com/");
	
	driver.manage().window().maximize();
	//wait
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	
	//wait
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("redmi note 10s");
	
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	//wait
	Thread.sleep(2000);
	
	// identify review and store it into object
	WebElement  S1=driver.findElement(By.xpath("((//div[@class='_2kHMtA'])[2]//span)[9]"));
	
    String	Review=S1.getText();
    
    System.out.println(Review);
	
	

    }
} 
