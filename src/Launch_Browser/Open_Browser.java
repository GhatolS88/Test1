package Launch_Browser;

import org.openqa.selenium.chrome.ChromeDriver;

public class Open_Browser 
{
	//How to Launch/open Browser
	
      public static void main(String[] args)

   {

  		//Step-I:
  		//Parameter-I:-Name of the Browser
  		//parameter-II:-Path of chromeDriver.exe.file
    	  
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	
	// Step:- create the object of ChromeDriver Class
	      ChromeDriver driver=new ChromeDriver();
	
	
	
   }
}
