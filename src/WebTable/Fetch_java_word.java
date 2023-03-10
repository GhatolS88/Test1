package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fetch_java_word
{	
	public static void main(String[] args) throws InterruptedException
	{	
		//step-1
		//parameter-1:name of the browser
		//parameter-2:copy the path of chromedriver.exe file
		System.setProperty("Webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe"); 
		//Create the object of chromedriver class by providing reference of webdriver interface
		WebDriver     Driver=new   ChromeDriver();
		//Open URL
		Driver.get("file:///D:/Automation/selenium/WebTable/Table1.html");
		
		Driver.manage().window().maximize();
				
		//wait
		Thread.sleep(2000);
		
		//fetch java
		WebElement  
		S1=Driver.findElement(By.xpath("//table[@id='1234']//tr[3]//td[2]"));
		
		
		String  S2=S1.getText();
			
			System.out.println(S2);
		
		
	}

}
