package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class getLastCellValue
{	
	    // To get cell  size
	   public static void main(String[] args) throws EncryptedDocumentException, IOException
	   {	
		//To reach upto excelsheet
		FileInputStream   File=new   FileInputStream("D:\\Automation\\selenium\\parameterazation-excelshhet\\1-oct-M.xlsx");
		//to open sheet and status
		int    CellSize=WorkbookFactory.create(File).getSheet("Sheet4").getRow(0).getLastCellNum(); //5
		
		System.out.println(CellSize);
		
		
		
		
	}

}
