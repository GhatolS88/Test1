package Pop_up;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hidden_division_Pop_up
{	
	public static void main(String[] args) throws InterruptedException
	{	
		//step-1
		//parameter-I:name of the browser
		//parameter-II:copy the path of chromedriver.exe file
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		
		//create the object of chromedriver class by providing reference of webdriver interface
		WebDriver  Driver=new  ChromeDriver(); //upcasting
		
		//open application
		Driver.get("https://www.flipkart.com");
		//wait
		Thread.sleep(2000);
		//Enter Email/mob no
		Driver.findElement(By.xpath("//inpu[@class='_2IX_2- VJZDxU']")).sendKeys("123@abc.com");
		
		//wait
		Thread.sleep(2000);
		
		//click on Request OTP Button
		Driver.findElement(By.xpath("//button[text()='Request OTP']")).click();
		
		

		
		
		
	}

}
