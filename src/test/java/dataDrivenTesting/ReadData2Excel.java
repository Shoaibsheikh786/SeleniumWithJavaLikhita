package dataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadData2Excel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
    
		File file = new File("./UserFile.xlsx"); // location of file
		FileInputStream fis = new FileInputStream(file); // connection
		Workbook wb = WorkbookFactory.create(fis); // workbook
		// tell me the sheet name/index
		// 0 ,1

		Sheet sheet = wb.getSheetAt(0);
		
		for(int i=0;i<4;i++) 
		{
		   Row row=	sheet.getRow(i);
		   
		   for(int j=0;j<row.getLastCellNum();j++)
		   {
			      Cell cell= row.getCell(j);
			      
			      String str=cell.toString();
			      System.out.print(cell+"   ");
		   }
		   System.out.println();
		}
		
	}

}
