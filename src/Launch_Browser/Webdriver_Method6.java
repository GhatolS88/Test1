package Launch_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver_Method6
{
	      //How to Open the Browser
         public static void main(String[] args) throws InterruptedException
         {
			//Step-I
            //Parameter-1:-Name of the Browser
        	// Parameter-2:-Copy the path of Chromedriver.exe file
        	 
        	 System.setProperty("webdriver.Chromedriver.driver", "C:\\chromedriver_win32\\chromedriver.exe");
        	 
        	 //Create the object of Chromedriver by providing refrence of webdriver
        	 
        	 WebDriver   Driver=new  ChromeDriver();
        	 
        	 //To Enter URL/Open the browser
        	 Driver.get("https://www.myntra.com");
        	 
        	 //wait
        	 Thread.sleep(2000);
        	 
        	 //To get the title of webpage
        	    String    Title=Driver.getTitle();   //Online shopping for women,Men,kids fashion and lifestyle-Myantra
        	    
        	    System.out.println(Title);
        	 
        	 
		 }
}
