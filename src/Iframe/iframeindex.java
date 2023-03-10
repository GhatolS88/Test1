package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframeindex
{	
	public static void main(String[] args) throws InterruptedException
		
	{	
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver Driver=new  ChromeDriver();  //upcasting
		
		Driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		//wait
		Thread.sleep(2000);
		
		//To switch to iframe(iframeindex)
		Driver.switchTo().frame(0);  //developer provide the frame index
		
		//wait
		Thread.sleep(2000);
		
		//click on me displayed date and time
		Driver.findElement(By.xpath("//button[@type='button']")).click();
		
	}

}
	