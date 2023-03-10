package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class getStringcellvalue
{	
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{	
        //to reach the upto Excelsheet
		FileInputStream  file=new  FileInputStream("D:\\Automation\\selenium\\parameterazation-excelshhet\\1-oct-M.xlsx") ;
		
		//to open excelsheet we have create method of workbookFactory class
		Workbook  S1=WorkbookFactory.create(file);
		
		//To ensure a particular excelsheet and status of sheet store into sh object having return type sheet
		Sheet  Sh=S1.getSheet("Sheet1");
		
		//To highlight Row
		Row S2=Sh.getRow(0);
		
	    //to highlight cell/coloumn
		Cell  S3=S2.getCell(0);
		//To fetch information
		String info=S3.getStringCellValue();   //abc
		
		System.out.println(info);
		
		
	}
			
					
		
		
	

}
