package POM_DDF_TestNG_BaseClass_UtilityClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestNg_BaseClass
{	       
	      public WebDriver Driver;       //declare  global variable to use another class
	      
	      public void InitializedBrowser()
	      { 
	    	  
	      System.setProperty("webdriver.chrome.driver","C:\\Users\\Shree\\eclipse-workspace\\Maven\\Browser\\chromedriver.exe");
	
	      Driver=new  ChromeDriver();
	      
	      Driver.get("https://demo.guru99.com/insurance/v1/index.php");  //EX OF Override method
	      	      
	      Driver.manage().window().maximize();
	      
	      Driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);  //timeout is method of option interface
	      
	      
	      
	      } 

}

