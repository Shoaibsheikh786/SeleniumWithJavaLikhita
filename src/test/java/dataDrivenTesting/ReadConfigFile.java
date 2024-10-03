package dataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadConfigFile {

	public static void main(String[] args) throws IOException {
    
		File file=new File("./config.properties");
		FileInputStream fis=new FileInputStream(file);
		
		Properties pr=new Properties();
		pr.load(fis);
		
	String bvalue=	pr.getProperty("browser");
	System.out.println(bvalue);
	String url=pr.getProperty("url");
	System.out.println(url);
	
	   if(bvalue.equals("chrome"))
	   {
		   WebDriver driver=new ChromeDriver();
		   driver.get(url);
	   }
	   else if(bvalue.equals("firefox"))
	   {
		   WebDriver driver=new FirefoxDriver();
		   driver.get(url);
	   }
	   else
	   {
		   System.out.println("Browser not found");
	   }
		
	}

}
