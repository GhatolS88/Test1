package Framework;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class With_DDF
{	
	/*With_DDF
	 * Step:-
	 * 1.Open Browser
	 * 2.Open URl
	 * 3.To read the data from excelsheet
	 * 4.Enter Email and Password
	 * 5.Click on login button
	 * 6.verify email
	  
	 */
	
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException
	{	
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver   Driver=new   ChromeDriver();
		
		Driver.get("https://demo.guru99.com/insurance/v1/index.php");
		
		//wait
		Thread.sleep(2000);
		
		
		//To read  data from  execelsheet
		FileInputStream   File=new  FileInputStream("D:\\Automation\\selenium\\framework\\New Microsoft Office Excel Worksheet.xlsx");
		
		Sheet Sh=WorkbookFactory.create(File).getSheet("Sheet1");
		//enter Email
		String   EmailID=Sh.getRow(0).getCell(0).getStringCellValue();
		Driver.findElement(By.xpath("//input[@id='email']")).sendKeys(EmailID);
		
		//wait
		Thread.sleep(2000);
		//Enter password
		String    Password=Sh.getRow(1).getCell(0).getStringCellValue();
		Driver.findElement(By.xpath("//input[@id='password']")).sendKeys(Password);
		
		//w
		Thread.sleep(2000);
		Driver.findElement(By.xpath("//input[@type='submit']")).click();
		//wait
		Thread.sleep(2000);
		
		//Test case:verify the EmailAddress
		 String  ExpectedEmailID=Sh.getRow(2).getCell(0).getStringCellValue();
	     WebElement S1=Driver.findElement(By.xpath("//h4[text()='saradeg41@gmail.com']"));
	     
	                   String  ActualEmailID=S1.getText();
	                   
	                  if( ExpectedEmailID.equals(ActualEmailID))
	                  {
	                	  System.out.println("Pass");
	                	  
	                  }
	                  else
	                  {
	                	  System.out.println("fail");
	                  }
	                  
	        //wait
	        Thread.sleep(3000);
	        //close the current tab
	        Driver.close();
	                   
	                   
	     
	     
	
	        
		
	}

}
