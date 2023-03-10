package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelement_link
{
	 public static void main(String[] args) throws InterruptedException
	 {
			
       // Open Browser
	   System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	   
	   //Create object
	   WebDriver Driver=new ChromeDriver();
	   
	   //enter URL/Open application
	   Driver.get("https://www.facebook.com");
	   
	   //wait
	   Thread.sleep(2000);
	   
	 //Click Forgotton Password Link
	   Driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
			   
	
	
      }
}
