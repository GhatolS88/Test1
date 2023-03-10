package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dhiraj_instagrame_openprofile
{
	    public static void main(String[] args) throws InterruptedException
	    {
		    System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
  
             WebDriver  Driver=new  ChromeDriver();
             
             //Enter URL
             Driver.get("https://www.instagram.com");
             
             //Wait
             Thread.sleep(2000);
             Driver.findElement(By.xpath("//input[@name='username']")).sendKeys("8600008559");
             
             Driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Sonali@1688");
             
             //Login
             Driver.findElement(By.xpath("//div[@class='_ab8w  _ab94 _ab99 _ab9f _ab9m _ab9p  _abak _abb8 _abbq _abb- _abcm']")).click();
           //Wait
             Thread.sleep(2000);
             
                         
             Driver.findElement(By.xpath("//button[text()='Not Now']")).click();
             //wait
             Thread.sleep(2000);
             // select notification
             Driver.findElement(By.xpath("//html[@class='_9dls js-focus-visible _aa4c']")).click();
             
            
             
       }
}
