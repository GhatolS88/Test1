package Launch_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

  public class Open_Browser4_Closed
    {
	  
      public static void main(String[] args) throws InterruptedException 
      {
    	  
	    System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
	
     	//Create object of Chomedriver class by providing   refrence of webdriver
	
	       WebDriver Driver=new ChromeDriver();     //upcasting
	
	      //Enter URL
	       Driver.get("https://www.bing.com");
	       // Wait
	       
	       Thread.sleep(2000);
	       
	       //To closed the current tab of browser
	       
	       Driver.close();
	       
	       
	
	
   }

}
