package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class default_content
{
	public static void main(String[] args) throws InterruptedException 
	{	
		//step-1
		//paramter-1:name of browser 
		//paramter-2:copy the path of chromedriver.exe file
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		
		//crete object of chromedriver class by providing the ref of webdriver interface
		
		WebDriver Driver=new  ChromeDriver();
		
		//open URL
		
		Driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		//wait
		Thread.sleep(2000);
		
		//To switch to iframe and store it into object
		WebDriver   Ac=Driver.switchTo().frame("iframeResult");

		//wait
		Driver.findElement(By.xpath("//button[@type='button']")).click();
		
		//wait
		Thread.sleep(2000);
		//switch to frame to main page
		Driver.switchTo().defaultContent();
		
		Thread.sleep(2000);
		//select home
		Driver.findElement(By.xpath("//a[@id='tryhome']")).click();
		
	
		
	}
	

}
