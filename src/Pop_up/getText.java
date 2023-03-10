package Pop_up;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getText 
{	
	public static void main(String[] args) throws InterruptedException 
	{	
		//step-1
		//paramter-I:name of the browser
		//Parameter-II:copy the path of chromedriver.exe file
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		//create the object of chromedriver class by providing reference of webdriver interface
		WebDriver     Driver=new  ChromeDriver();//upcasting
		//open application
		Driver.get("https://demo.guru99.com/test/delete_customer.php");
		//wait
		Thread.sleep(2000);
		//enter customer ID
		Driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("1232adc");
		//wait
		Thread.sleep(2000);
		//click on submit button
		Driver.findElement(By.xpath("//input[@name='submit']")).click();
		//wait
		Thread.sleep(2000);
		//To switch to alert
		Alert  alt=Driver.switchTo().alert();
		//wait
		Thread.sleep(1000);
		//To get Text present on Alert Pop-up
		String   Text=alt.getText();
		System.out.println(Text);
		
	}
	
}