package screenShot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScrnShot {

	public static void main(String[] args) throws IOException {
    
//		float a=1.5f;
		
		
		//is there any way to convert
		//TypeCasting 
		
//		int b=(int)a;
//		
//		System.out.println(a);
//		System.out.println(b);
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://practice.expandtesting.com/iframe");
		
		//WebDriver driver--> i dont have any method for SS.
		//TakesScreenshot 
		
		TakesScreenshot tk=(TakesScreenshot)driver;
		
	File scrnSht=	tk.getScreenshotAs(OutputType.FILE);
	
	FileUtils.copyFile(scrnSht, new File("./Scrn.pdf"));
		
	}

}
