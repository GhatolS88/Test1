package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;




public class Multi_Browser_Testing 
{	
	              
	@Parameters("browserName")   //chrome   firefox
	@Test                    
	public void TC1(String browserName) throws InterruptedException
	{
		
		WebDriver  Driver=null;   
		   //chrome            chrome
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
			
		    Driver=new  ChromeDriver();
		}
		else if(browserName.equals("firefox")) 
		{
			System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.32.2-win64\\geckodriver.exe");
			
			Driver=new      FirefoxDriver();
		}
		
		   //to enter url
		
		 Driver.get("https://demo.guru99.com/insurance/v1/index.php");
		 
		 //wait
		 Thread.sleep(2000);
		 
		 //enter email
		 
		 Driver.findElement(By.xpath("//input[@id='email']")).sendKeys("saradeg41@gmail.com");
		 
		 //enter password
		 
		 Driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Sai@1117");
		 
		 //wait
		 Thread.sleep(1000);
		 
		 //click on logine
		 Driver.findElement(By.xpath("//input[@type='submit']")).click();
		 
		 //wait
		 Thread.sleep(2000);
		 
		 //Testcase: verify email
		  
		 String          ExpectedEmail="saradeg41@gmail.com";
		 WebElement      Email=Driver.findElement(By.xpath("//h4[text()='saradeg41@gmail.com']"));
		 String          ActualEmailAddress =Email.getText();
		 
		 if(ExpectedEmail.equals(ActualEmailAddress))
		 {
			 System.out.println("Pass");
		 }
		 else
		 {
			 System.out.println("Fail");
		 }
		 
		 //wait
		 Thread.sleep(1000);
		 
		 Driver.quit();
		 
		 
		 
		
		 
	}
	

}
