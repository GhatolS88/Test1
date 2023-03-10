package POM;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass_2 
{	
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException
	{	
		//step-1
				//parameter-1:name of the browser
				//parameter-2:copy the path of chromedriver.exe file
				System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
				//create the object of chromedriver class by providing reference of webdriver interface
				WebDriver    Driver=new   ChromeDriver();
				
				//Open URL
				Driver.get("https://www.facebook.com/");
				
				Driver.manage().window().maximize();
				//wait
				Thread.sleep(2000);
				
				//to read the excelsheet
				FileInputStream  File=new FileInputStream("D:\\Automation\\selenium\\framework\\DDF\\New Microsoft Office Excel Worksheet.xlsx");
				Sheet  Sh=WorkbookFactory.create(File).getSheet("Sheet2");
				
				//To fetch Username and password
				String  Username=Sh.getRow(0).getCell(0).getStringCellValue();
				String  Pass=Sh.getRow(1).getCell(0).getStringCellValue();
				
				//create the object of POM-1
				POM_1_Logine    Logine=new  POM_1_Logine(Driver);
				
				//call method
				Logine.EnterUN(Username);
				Logine.Enterpassword(Pass);
				Logine.ClickLoginbtn();
				
		        
	}

}
