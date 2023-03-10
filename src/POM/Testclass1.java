package POM;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testclass1
{	
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException
	{	
		//step-1
		//parameter-1:name of the browser
		//parameter-2:copy the path of chromedriver.exe file
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		//create the object of chromedriver class by providing refrence of webdriver interface
		WebDriver    Driver=new   ChromeDriver();
		
		//Open URL
		Driver.get("https://demo.guru99.com/insurance/v1/index.php");
		
		Driver.manage().window().maximize();
		//wait
		Thread.sleep(2000);
		
		//to fetch data from excelsheet
		FileInputStream   File=new  FileInputStream("D:\\Automation\\selenium\\framework\\DDF\\New Microsoft Office Excel Worksheet.xlsx");
		
		Sheet Sh=WorkbookFactory.create(File).getSheet("Sheet1");
		
		//Object of POM-I
		Insurance_Logine  Logine=new  Insurance_Logine(Driver);
		  //Enter email
		 String  EM=Sh.getRow(0).getCell(0).getStringCellValue();
		 Logine.EnterEmail(EM);
		 
		 String  Pass=Sh.getRow(1).getCell(0).getStringCellValue();
		 Logine.EnterPassword(Pass);
		 Logine.ClickLoginbtn();
		 
	    //POM-II
		 //create the object of POM-II
		Insurance_broker_webpage  Logout=new  Insurance_broker_webpage(Driver);
		
		//fetch the data from excelsheet to get ExpectedEmail
		String    Email=Sh.getRow(2).getCell(0).getStringCellValue();
		Logout.VerifyEmailAddress(Email);
		//wait
		Thread.sleep(2000);
		
		Logout.ClickonLogoutbt();
		
		
		
		
	}

}
