package Customized_listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HOME_END
{
	public static void main(String[] args) throws InterruptedException 
	{
		//step-1
		//parameter-1:name of the browser
		//parameter-2:copy the path of chromedriver.exe file
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		//create the object of chromedriver class by providing reference of webdriver interface
	     WebDriver    Driver=new   ChromeDriver();
	     //Toopen application
	     Driver.get("https://www.facebook.com");
	     //wait
	     Thread.sleep(2000);
	     //click on create new account
	     Driver.findElement(By.xpath("//a[text()='Create new account']")).click(); 
	     
	     //wait
	     Thread.sleep(2000);
	     
	     //step-1:identify element and store it into object
	     WebElement  DOB=Driver.findElement(By.id("day"));
	     
	     //step-2:create object of action class
	     Actions  Ac=new  Actions(Driver);
	     
	     //step-3:call method
	     Ac.click(DOB).perform();
	     //wait
	     Thread.sleep(2000);
	     Ac.sendKeys(Keys.END).perform();
	     
	     //wait
	     Thread.sleep(1000);
	     for(int i=1; i<=5; i++)
	     {
	    	 Ac.sendKeys(Keys.ARROW_UP).perform();  //26
	    	 
	     }
	     
	     //wait
	     Thread.sleep(2000);
	     //To select option
	     Ac.sendKeys(Keys.ENTER).perform();
	     
	

}
}