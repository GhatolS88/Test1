package Pop_up;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class window_pop_up
{	
	public static void main(String[] args) throws InterruptedException
	{	
		//step-1
		//parameter-I:name of the browser
		//parameter-II:copy the path ofchromedriver.exe file
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		
		//create thecobject of chromedriver class by providing reference of webdriver interface
				WebDriver  Driver=new  ChromeDriver();
		//Enter open
		Driver.get("https://skpatro.github.io/demo/links");
		//wait
		Thread.sleep(2000);
		//click on new button
		Driver.findElement(By.xpath("//input[@value='New Tab']")).click();
		//wait
		
		Thread.sleep(2000);
		//To get the ID
		Set<String>    IDs=Driver.getWindowHandles();  //mainpageID,childwindowID
		System.out.println(IDs);
		
		ArrayList<String>  al=new  ArrayList<String>(IDs);
		
		//To get main pageID
		String  MPID=al.get(0);   //main page id
		System.out.println(MPID);
		
		//to get child page ID
		String CHID=al.get(1);   //child page id
		System.out.println(CHID);
		
		//switch to window popup
		Driver.switchTo().window(CHID);
		
		//click Traning link
		Driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
		//wait
		Thread.sleep(2000);
		//to swtch main page
		Driver.switchTo().window(MPID);
		//wait
		Thread.sleep(2000);
		//click new window button
		Driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
		
		
		
		
		
		
	}
	

}
