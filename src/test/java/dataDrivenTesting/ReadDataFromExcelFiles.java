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

public class ReadDataFromExcelFiles {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		File file = new File("./UserFile.xlsx"); // location of file
		FileInputStream fis = new FileInputStream(file); // connection
		Workbook wb = WorkbookFactory.create(fis); // workbook
		// tell me the sheet name/index
		// 0 ,1

		Sheet sheet = wb.getSheetAt(0);

		// ask to sheet. ? give us row ? which row
		Row row = sheet.getRow(0);

		// ask row to give us a cell

		Cell cell = row.getCell(0);
		Cell cell2 = row.getCell(1);

		System.out.println(cell);
		System.out.println(cell2);

		Row row2 = sheet.getRow(1);
		Cell cell11 = row2.getCell(0);
		Cell cell12 = row2.getCell(1);
		
		System.out.println(cell11);
		System.out.println(cell12);

	}

}
