package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelement_displayed
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
		
		//verify "Facebook" logo is displaying or not
	    WebElement Logo=Driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
	     
	       boolean        S2=Logo.isDisplayed();    //Displayed----->true   ,//not Displayed--->Exception
	       
	       System.out.println(S2);

    }
}
