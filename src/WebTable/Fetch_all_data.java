package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fetch_all_data
{	
	public static void main(String[] args) throws InterruptedException
	{    
		//step-1
		//parameter-1:name of the browser
		//parameter-2:copy the path of chromedriver.exe file
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		//create the object of the chromedriver class by providing reference of webdriver interface
		WebDriver  Driver=new   ChromeDriver();
		
		//open URL
		Driver.get("file:///D:/Automation/selenium/WebTable/Table1.html");
		
		Driver.manage().window().maximize();
		//wait
		Thread.sleep(2000);
		
		//fetch all data from table
		for(int i=1; i<=3; i++)
		{
		 WebElement	S1=Driver.findElement(By.xpath("//table[@id='1234']//tr[2]/td["+i+"]"));
			
			                                        //LHSString  +i+   RHSString
		    String    S3=S1.getText();
		    System.out.println(S3);
			
		}
			
			
			
			
			
			
			
		
		
		
	}

}
