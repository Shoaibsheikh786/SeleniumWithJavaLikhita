package tryCatch;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatch {

	public static void main(String[] args) {

		// Checked , unchecked ;

		File file = new File("./UerFile.xlsx");

		// try ---> inside
     
		try
		{
			FileInputStream fis = new FileInputStream(file);
		}
		catch(FileNotFoundException e)
		{   
			
			//System.out.println("promblem in the code ");
			e.printStackTrace();
			
			//close the file 
		}
		

		System.out.println("hello world ");

	}

}
