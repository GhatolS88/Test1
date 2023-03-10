package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear
{	
	  public static void main(String[] args) throws InterruptedException
	  {
		//Step-I
		//Parameter-1:-Name of the Browser
		//Parameter-2:-copy the path of chromedriver.exe file
		  
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		//create the object of chromedriver class by providing reference of webdriver interface
		
		WebDriver Driver=new ChromeDriver();  //Upcasting
		//To enter URL/open application
		Driver.get("https://www.facebook.com");
		
		//wait
		Thread.sleep(2000);
		//To enter UN
		Driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']")).sendKeys("Sonali123");
		
		//wait
		Thread.sleep(2000);
		
		//To clear UN
		 Driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']")).clear();
		 
		//wait
		Thread.sleep(2000);
		//To Enter PSW
		Driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy _9npi']")).sendKeys("12@WER");
		 
		
		
		
	  }

}
