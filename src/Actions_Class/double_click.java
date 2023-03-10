package Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class double_click
{	
	public static void main(String[] args) throws InterruptedException
	{	
		//step-1
		//parameter-1:name of the browser
		//parameter-2:copy the path of chromedriver.exe file
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		//create object of chromedriver by providing refrence of webdriver interface
		WebDriver  Driver=new  ChromeDriver();  //upcasting
		//open url
		Driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		Driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement DB=Driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
		
		//create object of actons class
		Actions  AC=new Actions(Driver);
		
		//call method(Double click)
		AC.doubleClick(DB).perform();
		
	}

}
