package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webElement_isSelected 
{
	 public static void main(String[] args) throws InterruptedException
	 {
		//Step-I
		//Parameter-1:-Name of the Browser
		//Parameter-2:-Copy the path of chromedriver.exe file
		 System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		 
		 //Create the object of chromedriver class by providing reference of webdriver interface
		 WebDriver Driver=new ChromeDriver();
		 
		 //Enter URL
		 Driver.get("https://www.facebook.com");
		 
		 //wait
		 Thread.sleep(2000);
		 
		 //  //click Create New Account Button
		 Driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		//wait
		 Thread.sleep(2000);
		 
		 //Verify Male Radio Button
         WebElement    Radio=Driver.findElement(By.xpath("(//input[@class='_8esa'])[2]"));
         
         boolean   Button=Radio.isSelected();        //selected---->true  ,  notSelected---------->false
         
         System.out.println(Button);
		 
	}

}
