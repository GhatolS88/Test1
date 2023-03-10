package Parameterization;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class getBooleanCellValue
{	
	//To reach upto excelsheet
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{	
		//To reach upto Excelsheet
		FileInputStream  File=new  FileInputStream("D:\\Automation\\selenium\\parameterazation-excelshhet\\1-oct-M.xlsx");
		
		boolean  Value=WorkbookFactory.create(File).getSheet("Sheet4").getRow(3).getCell(0).getBooleanCellValue(); //TRUE
		
		
		System.out.println(Value);
	}

}
