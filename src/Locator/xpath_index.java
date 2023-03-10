package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_index 
{
	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	//Create object of chromedriver by providing refrence of webdriver interface
	WebDriver  Driver=new  ChromeDriver();  //Upcasting
	// Enter URL
	Driver.get("https://www.facebook.com");
	
	//Wait
	Thread.sleep(2000);
	
	//Click "Create New Account Button"
	
	Driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
	
	//Wait
    Thread.sleep(2000);
    
    // Enter Firstname
    
    Driver.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-']")).sendKeys("Dhiraj");
    //Wait
    // Facebook login
    
    Driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[2]")).sendKeys("Rajput");
    
    Driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("8788441983");
    
    Driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[5]")).sendKeys("ABC@123");
    
    
    //Driver.findElement(By.xpath("//select[@name='birthday_day']")).click(); 
    
    //Wait
    Thread.sleep(1000);
        
    Driver.findElement(By.xpath("//option[text()='17']")).click();
    
    Driver.findElement(By.xpath("//option[text()='Apr']")).click();
    
    Driver.findElement(By.xpath("//option[text()='1999']")).click();
    
    Driver.findElement(By.xpath("//label[text()='Male']")).click();
    
    Driver.findElement(By.xpath("//button[@name='websubmit']")).click();
    
    
    
	

	
    }
}
