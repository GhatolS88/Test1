package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class getNumeric_value_String 
{	
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{	
		//Read numeric value as string
		//To reach upto execelsheet
		FileInputStream  File=new  FileInputStream("D:\\Automation\\selenium\\parameterazation-excelshhet\\1-oct-M.xlsx");
		
		//To open status of excelsheet and store it into sh object 
		
		String  Sh=WorkbookFactory.create(File).getSheet("Sheet5").getRow(1).getCell(0).getStringCellValue();
		
		System.out.println(Sh);
		
	}

}
