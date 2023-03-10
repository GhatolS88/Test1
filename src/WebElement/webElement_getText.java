package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webElement_getText
{	
	public static void main(String[] args) throws InterruptedException 
	{
		//open browser
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		
		//Create object of chromedriver class by providing reference of webdriver interface
		WebDriver Driver=new ChromeDriver();  //Upcasting
		
		//Enter URL
		Driver.get("https://www.facebook.com/");
		
		//wait
		Thread.sleep(2000);
		////To get text of  Forgotton Password Link
		WebElement  W1=Driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
		
		  String   Text1=W1.getText(); //Forgotton Password?
		  System.out.println(Text1);
		
	}

}
