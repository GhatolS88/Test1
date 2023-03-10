package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cell_size 
{	
	public static void main(String[] args) throws InterruptedException
	{	
		//step-1
		//parameter-1:name of the browser
		//parameter-2:copy the path of chromedriver.exe file
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		
		//create object of chromedriver class by providing reference of webdriver interface
		
		WebDriver    Driver=new   ChromeDriver();
		//Open URL
		Driver.get("file:///D:/Automation/selenium/WebTable/Table1.html");
		
		//wait
		Thread.sleep(2000);
		
		//Find Column size of Row 4
		 List<WebElement> AllCell=Driver.findElements(By.xpath("//table[@id='1234']//tr[4]/td"));
		 
		 int Count=AllCell.size();
		 
		 System.out.println(Count);
		
		
		
	}

}
