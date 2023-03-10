package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class parentframe 
{
	 //How to Handle element present in Iframe
     public static void main(String[] args) throws InterruptedException
     
     {	
    	 System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
    	 
    	 WebDriver  Driver=new  ChromeDriver();  //upcasting
    	 
    	 Driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
    	 
    	 //wait
    	 Thread.sleep(2000);
    	 
        //To switch to iframe(stringFramename)
    	WebDriver  Ac=Driver.switchTo().frame("iframeResult");
    	
    	   //Wait
	       Thread.sleep(2000);
	       
    	////click on me displayed date and time
		Driver.findElement(By.xpath("//button[@type='button']")).click();
		
		//switch tomain page
		Driver.switchTo().parentFrame();
		
		Thread.sleep(2000);
		
		Driver.findElement(By.xpath("//a[@id='tryhome']")).click();
		
    	 
		
	}
}
