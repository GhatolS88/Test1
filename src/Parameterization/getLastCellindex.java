package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class getLastCellindex
{	
	   //to find last cell index
	   public static void main(String[] args) throws EncryptedDocumentException, IOException
	    {	
		   FileInputStream   File=new   FileInputStream("D:\\Automation\\selenium\\parameterazation-excelshhet\\1-oct-M.xlsx");
		   //to open status of sheet
		   int  CellIndex=WorkbookFactory.create(File).getSheet("Sheet4").getRow(0).getLastCellNum()-1;  //4
		   
		   System.out.println(CellIndex);
		
	    }

}
