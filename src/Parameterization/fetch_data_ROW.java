package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class fetch_data_ROW
{	
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		//fetch data from particular ROW
		//To reach upto execelsheet
		FileInputStream  File=new  FileInputStream("D:\\Automation\\selenium\\parameterazation-excelshhet\\1-oct-M.xlsx");
		
		//To open status of excelsheet and store it into object
		Sheet   Sh=WorkbookFactory.create(File).getSheet("Sheet6");
		
		// finf out last cell index
		int     LastCellIndex=Sh.getRow(0).getLastCellNum()-1;//4-1=3
		
		//Take for loop
		//      i=0   0<=3             1
		//            1<=3             2
		//            2<=3             3
		//            3<=3             4
		//            4<=3
		for(int i=0;  i<=LastCellIndex;   i++)
		{
			String   Value=Sh.getRow(0).getCell(i).getStringCellValue();
			
			System.out.print(Value+"  ");
			
		}
		
		
		
		
	}

}
