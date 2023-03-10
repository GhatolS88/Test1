package Multiple_Link;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test1
{	
	//How to handlemultiple link
	public static void main(String[] args) throws InterruptedException
	{	
		 //step-1
		//parameter-1:name of the browser
		//parameter-2:copy the path of chromedriver.exe file
		
				
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		//create object of chromedriver class by providing reference of webdriver interface
		WebDriver  Driver=new  ChromeDriver(); //upcasting
		//open URL
		Driver.get("https://www.facebook.com/");
		
		//wait
		Thread.sleep(2000);
		
		//identify link
		List<WebElement>   AllLink=Driver.findElements(By.xpath("//a"));  //46
		
		for(WebElement S1:AllLink)    
		{
			System.out.println(S1.getText());   //sign Up Login Groups
			
		}
		
	}

}
