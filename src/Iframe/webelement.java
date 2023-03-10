package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelement
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver  Driver=new  ChromeDriver();
		
		Driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		//wait
		Thread.sleep(2000);
		
		//switch to iframe
		
		Driver.switchTo().frame(Driver.findElement(By.xpath("//iframe[@id='iframeResult']")));
		//wait
		Thread.sleep(2000);
		
		//click on display data and time
		Driver.findElement(By.xpath("//button[@type='button']")).click();
		
	}
	

}
