package Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Without_DDF
{	
	/*
	 * 		Without data driven framework
	 *      step
	 *      1.Open Browser
	 *      2.Hit URL
	 *      3.Enter  UN and Password
	 *      4.Click on Login Button
	 *      5.Verify Email
	 *      
	 */


	public static void main(String[] args) throws InterruptedException
	{	
		//step-1
		//parameter-1:-name of the browser
		//parameter-2:-copy the path of chromedriver.exe file
		System.setProperty("Webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		//create the object of chromedriver class by providing webdriver reference
		
		WebDriver   Driver=new   ChromeDriver();
		//open URL
		Driver.get("https://demo.guru99.com/insurance/v1/index.php");
		
		//wait
		Thread.sleep(2000);
		//Enter Un
		Driver.findElement(By.xpath("//input[@id='email']")).sendKeys("saradeg41@gmail.com");
		//wait
		Thread.sleep(2000);
		//Enter Password
		Driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Sai@1117");
		//wait
		Thread.sleep(2000);
		//Click on login button
		Driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		            String  Expected_Result="saradeg41@gmail.com";
		 WebElement S4=Driver.findElement(By.xpath("//h4[text()='saradeg41@gmail.com']"))  ;
		 
		      String    ActualResult=S4.getText();
		      if(Expected_Result.equals(ActualResult))
		      {
		    	  System.out.println("Result pass");
		      }
		      else
		      {
		    	  System.out.println("Result fail");
		      }
		 
		 
		  
		
		
	}
	

}
