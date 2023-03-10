package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class optimazation_getstringcell_value
{	
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{	
		//To reach upto Excelsheet
		FileInputStream  File=new  FileInputStream("D:\\Automation\\selenium\\parameterazation-excelshhet\\1-oct-M.xlsx");
		
		String   Value=WorkbookFactory.create(File).getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();  //abc
		
		
		System.out.println(Value);
		
	}

}
