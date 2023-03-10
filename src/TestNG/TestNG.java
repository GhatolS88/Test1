package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNG
{	
	//Testcase
	@Test                      //test case//method
	
	public void OpenfaceBook() throws InterruptedException
	{	
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe" );
		
		WebDriver  driver=new   ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		//wait
		Thread.sleep(2000);
		
	}

}
