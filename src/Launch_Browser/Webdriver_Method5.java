package Launch_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver_Method5 
{     
	  //How to open Browser
       public static void main(String[] args) throws InterruptedException
      {
		// Step-I
    	//Parameter-1:-Name of the Browser
    	//Parameter-2:-Copy the path of Chromedriver
    	   System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
    	   
    	 //Create the object of chromedrive by providing the refrence of webdriver(Interface)
    	   
    	  WebDriver    Driver=new  ChromeDriver();  //Upcasting
    	  
    	  // To enter URL/Open the application
    	  
    	  Driver.navigate().to("https://www.flipkart.com");
    	  
    	  // Wait
          Thread.sleep(2000);
                    
         // To Enter url/ open application
          Driver.navigate().to("https://www.zomato.com");   
          
          //Wait
          Thread.sleep(2000);
                
          //To move back
          Driver.navigate().back();
    
           //Wait
         Thread.sleep(2000);
    
         //To move forward            
         Driver.navigate().forward();
    
         //Wait
         Thread.sleep(2000);
    
         //To refresh the webpage
         Driver.navigate().refresh();
    
    	  
	  }
}
