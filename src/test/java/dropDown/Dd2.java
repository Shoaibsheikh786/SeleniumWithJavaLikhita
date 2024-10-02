package dropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dd2 {

	public static void main(String[] args) {
   
		WebDriver driver=new ChromeDriver();
		driver.get("https://practice.expandtesting.com/dropdown");
		
	WebElement ele=	driver.findElement(By.xpath("//a[text()='Demos']"));
	
	ele.click();
	
	// Thread.sleep(3000);
	driver.findElement(By.xpath("//a[text()='APIs']")).click();
	
	
	}

}
