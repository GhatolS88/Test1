package WebTable;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fect_data1
{	
	public static void main(String[] args) throws InterruptedException 
	{	
		//step-1
		//parameter-1:name of the browser
		//parameter-2:copy the path of chromedriver.exe file
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		//create the object of chromedriver class by providing reference of webdriver interface 
		WebDriver Driver=new  ChromeDriver();
		//open URL
		Driver.get("D:/Automation/selenium/WebTable/Table1.html");
		
		Driver.manage().window().maximize();
		
		//wait
		Thread.sleep(2000);
		
		//Fetch  "300"
		
		WebElement  Fetch=Driver.findElement(By.xpath("//table[@id='1234']//tr[4]/td[3]"));
		
		String   S1=Fetch.getText();
		
		System.out.println(S1);
		
		
	}

}
