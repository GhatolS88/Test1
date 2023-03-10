package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class getLastRowNum 
{	
	//to get the last row index
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{	
		//To reach upto excelsheet
		FileInputStream  File=new  FileInputStream("D:\\Automation\\selenium\\parameterazation-excelshhet\\1-oct-M.xlsx");
		
		int  RowIndex=WorkbookFactory.create(File).getSheet("Sheet3").getLastRowNum();  //6
		
		System.out.println(RowIndex);
		
	}

}
