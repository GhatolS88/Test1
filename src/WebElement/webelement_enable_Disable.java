package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelement_enable_Disable 
{	
	public static void main(String[] args) throws InterruptedException
	{
		//open Browser
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		//Create object of chromedriver class by providing reference of wedriver interface
		WebDriver Driver=new ChromeDriver();
		//Enter URL
		Driver.get("https://www.facebook.com/");
		
		//Wait
		Thread.sleep(2000);
		
		//verify Login button is enabled or disabled
		WebElement  W2=Driver.findElement(By.xpath("//button[@name='login']"));
		 
		      Boolean       Var=W2.isEnabled();//isEnabled------->true   //isDisabled---->false
		      
		      System.out.println(Var);
		      
	}

}
