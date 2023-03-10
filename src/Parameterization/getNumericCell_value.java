package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class getNumericCell_value
{	
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{	
		//To reach upto excelsheet
		FileInputStream  File=new  FileInputStream("D:\\Automation\\selenium\\parameterazation-excelshhet\\1-oct-M.xlsx");
		
		//To open excelsheet
		double  Value=WorkbookFactory.create(File).getSheet("Sheet2").getRow(1).getCell(0).getNumericCellValue();//1234
		
		System.out.println(Value);
		
		
		
	}

}
