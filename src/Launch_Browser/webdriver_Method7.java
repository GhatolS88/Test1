package Launch_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriver_Method7
{

	public static void main(String[] args) throws InterruptedException 
        {
	       System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
	       
	       WebDriver  Driver=new ChromeDriver();
	       
	       // To enter URL
	       Driver.get("https://www.facebook.com");  //nonstatic method from webdriver
	       
	       //Wait
	       Thread.sleep(2000);    //static method from thread class
	       
	       //To get Current URL of webpage
	       
	       String  URL=Driver.getCurrentUrl();   //"https://www.facebook.com
	    
	        System.out.println(URL);
	
          }
}
