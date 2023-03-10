package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Row_Size
{	
	public static void main(String[] args) throws InterruptedException 
	{	
		//step-1
		//Parameter-1:name of the browser
		//parameter-2:copy the path of chromedriver.exe file
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		
		//create the object of chromedriver class by providing ref of webdriver interface
		WebDriver Driver=new  ChromeDriver();
		
		//open URL
		Driver.get("file:///D:/Automation/selenium/WebTable/Table1.html");
		
		Driver.manage().window().maximize();
		
		//wait
		Thread.sleep(2000);
		
		//To find row size of table and store it into object
	  List<WebElement>	AllRow=Driver.findElements(By.xpath("//table[@id='1234']//tr"));
	  
	  int          Count=AllRow.size();
	  
	      System.out.println(Count);
		
		
		
		
		
		
	}

}
