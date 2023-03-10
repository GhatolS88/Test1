package Listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getOption_method_2 
{
     public static void main(String[] args) throws InterruptedException
     {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver  Driver=new  ChromeDriver();
		
		Driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		Driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		Thread.sleep(2000);
		
		WebElement  Month=Driver.findElement(By.xpath("//select[@id='month']"));
		
		Select   S1=new  Select(Month);
		
		List<WebElement>     S2=S1.getOptions();   //Address----->12
		
		for(WebElement  S3:S2)
		{
			String  Text=S3.getText();  //jan feb march---dec
			
			System.out.println(Text);//jan
			
		}
		
		
	}
}
