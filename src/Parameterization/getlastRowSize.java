package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class getlastRowSize
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{	
		//To find out last RowSize
		
		//To reach upto excelsheet
		FileInputStream  File=new  FileInputStream("D:\\Automation\\selenium\\parameterazation-excelshhet\\1-oct-M.xlsx");
		
		int  RowSize=WorkbookFactory.create(File).getSheet("Sheet3").getLastRowNum()+1;
		
		System.out.println(RowSize);
		
		
	}

}
