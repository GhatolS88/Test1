package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getfirstselectedoption_method_2
{	
	public static void main(String[] args) throws InterruptedException
	{	
	   //step-1
	   //parameter-1:name of the browser
	   //parameter-2:copy the path of chromedriver.exe file
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		//create the object of chromedriver by providing reference of webdriver interface
		WebDriver  Driver=new   ChromeDriver();
		//open application
		Driver.get("https://www.facebook.com");
		//wait
		Thread.sleep(2000);
		//click on create new account
		Driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		//wait
		Thread.sleep(2000);
		//identify the listbox and store it into object
		WebElement  Month=Driver.findElement(By.xpath("//select[@id='month']"));
		//create the object of selec class
		Select  S1=new Select(Month);
		//call methods
		
		S1.selectByVisibleText("MAY");
		
		//to get the text
		WebElement   S2=S1.getFirstSelectedOption();  //address----->May
		
		String   Text=S2.getText();   //May
		
		System.out.println(Text);
		
		
		
		
		
	}

}
