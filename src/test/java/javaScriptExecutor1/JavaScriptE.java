package javaScriptExecutor1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptE {

	public static void main(String[] args) {
     
		WebDriver driver=new ChromeDriver();
		driver.get("https://practice.expandtesting.com/login");
//	WebElement e=	driver.findElement(By.id("username"));
//	
//	WebElement btn= driver.findElement(By.xpath("//button[text()='Login']"));
//	  
//	// driver to JavaScriptExecutor
//	
	JavascriptExecutor js=(JavascriptExecutor)driver;
//	
//	js.executeScript("arguments[0].value='Likhita'", e);
//	js.executeScript("arguments[0].click()",btn);
	
	js.executeScript("window.scrollTo(0,1000);");
	
	}

}
