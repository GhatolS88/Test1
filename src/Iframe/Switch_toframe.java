package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switch_toframe
{	
	      //How to Handle element present in Iframe
	  public static void main(String[] args) throws InterruptedException
	   {	
		  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		  
		  WebDriver  Driver=new ChromeDriver();  //upcasting
		  
		  Driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		  
		  //wait
		  Thread.sleep(2000);
		  
		//to switch to Iframe (String Framename)
		  Driver.switchTo().frame("iframeResult");
		  
		  //wait
		  Thread.sleep(2000);
		  //click on display date and time
		  Driver.findElement(By.xpath("//button[@type='button']")).click();
		  
		  
		
	   }
	  

}
