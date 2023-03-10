package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement_Button_click
{	
	 // open Browser
	 public static void main(String[] args) throws InterruptedException
	 {
		//step-I
		//Parameter-1:-Name of the Browser
		//Parameter-2:-copy the path of chromedriver.exe file
		 
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		
		//Create object of chromedriver clss by providing refrence of webdriver interface
		WebDriver  Driver=new ChromeDriver();
		
		//Enter URL
		Driver.get("https://www.facebook.com");
		
		//wait
		Thread.sleep(2000);
		//Click on login button
		Driver.findElement(By.xpath("//button[text()='Log in']")).click();
		
	 }

}
