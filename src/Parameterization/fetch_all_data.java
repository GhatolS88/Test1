package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class fetch_all_data 
{	
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{	
		//to fetch all data
		FileInputStream  file=new  FileInputStream("D:\\Automation\\selenium\\parameterazation-excelshhet\\1-oct-M.xlsx");
		
		//TO OPEN the status of  excelsheet and store it into object 
		
		Sheet  Sh=WorkbookFactory.create(file).getSheet("Sheet7");
		
		int LastRowIndex=Sh.getLastRowNum();//3
		
		            //i=0; 0<=3;   
		            //
		for(int i=0; i<=LastRowIndex; i++)
		{
				//to find last cell index
		            int		LastCellindex=Sh.getRow(i).getLastCellNum()-1;//4-1=3
				       //a=0;   0<=3     1
		               //a=1     1<=3     2
		               //a=2     2<=3      3
		               //a=3      3<=3     4
		                //a=4        
		            for(int a=0;  a<=LastCellindex; a++)
		         {
		            	                             
			           String     Value=Sh.getRow(i).getCell(a).getStringCellValue(); //sonali QA API
			           
			           System.out.print(Value+" ");
		         
		         }
		            System.out.println(" ");
		
		}
		
		
		
	}
}


