package POM_DDF_TestNG_BaseClass_UtilityClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class TestNG_UtilityClass
{
	
	
	 @Test                            //EM   //PSW
	 public static String getDataFromPF(String key) throws IOException
	 {
	 
	 //To reach upto property file
	 
	 FileInputStream   File=new  FileInputStream("C:\\Users\\Shree\\eclipse-workspace\\1_oct_selenium\\propertyFile.properties");
	 
	 //create the object of properties class file
	 Properties  prop=new  Properties();
	 
	 //To open property file
	 
	 prop.load(File);    // load is nonstatic method of propertiesclass is to open propertyfile	
	 
	 //to fetch data from Property file
	 
	 String  Value1=prop.getProperty(key);   //EM  //saradeg41@gmail.com  ,//passwprd  Sai@1117
	 return Value1;                          //saradeg41@gmail.com ,Sai@1117
	 	 	 
     } 
	 @Test
	 public static String getDataFromExcelsheet(int RowIndex,int CellIndex) throws EncryptedDocumentException, IOException
	 {
		 //to reach upto excelsheet
		 FileInputStream   File=new  FileInputStream("D:\\Automation\\selenium\\framework\\DDF\\New Microsoft Office Excel Worksheet.xlsx");
		 
		 //to open sheet
		 Sheet    Sh=WorkbookFactory.create(File).getSheet("Sheet1");
		                          //3               //0
		 String   Value2=Sh.getRow(RowIndex).getCell(CellIndex).getStringCellValue();  //Insurance Broker System
		 
		 return Value2 ;//Insurance_broker_signout
					 
	 }
	 
	 @Test
	 public static void CaptureScreenshot(WebDriver Driver,int testCaseID) throws IOException
	 {	
	   File 	Source=((TakesScreenshot)Driver).getScreenshotAs(OutputType.FILE);
	   
	   System.out.println(Source);
	   File   Destination=new   File("D:\\Automation\\selenium\\Pom-DDf-TestNG-\\screenshot");
	   
	   FileHandler.copy(Source,Destination);
		 
	 }
	 
	 
}  
