package dropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion {

	public static void main(String[] args) throws InterruptedException {
     
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/flights/");
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//label[@for='fromCity']")).click();
		Thread.sleep(2000);
	WebElement input=	driver.findElement(By.xpath("//input[@placeholder='From']"));
	input.sendKeys("Srina");	
	Thread.sleep(2000);
	input.sendKeys(Keys.ARROW_DOWN);
	
	input.sendKeys(Keys.ENTER);
	
		
		
	}

}
