package Launch_Browser;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriver_Method8
{
  // How to open Browser
	  public static void main(String[] args)
	  {
		//Step-1
		// Parameter-1:-Name of Browser
		//Parameter-2:-Copy the path of chromedriver.exe file
		  
		  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		  
		  //To create object od Chromedriver class by providing refrence  of webdriver (interface)
		  
		  WebDriver  Driver=new ChromeDriver();
		  
		  // Enter URL
		  
		  Driver.get("https://www.facebook.com"); 
		  
		  // create object of dimention class
		  
		  Dimension D1=new Dimension(100,200);
		  
		  Driver.manage().window().setSize(D1);
		  
		  
		  
		  
		  
		  
		  
		  		
		  		

		  
	  }
}
