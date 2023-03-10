package Listbox;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class demo_getallselected 
{	
	public static void main(String[] args) throws InterruptedException
	{	
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver  driver=new  ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		//to identify list box and store it into object
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("sonali1234");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("XY@123");
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		WebElement   You=driver.findElement(By.xpath("(//select[@class='_9407 _5dba _9hk6 _8esg'])[1]"));
		
		Select   S1=new  Select(You);
		S1.selectByIndex(1);		
		
	}

}
