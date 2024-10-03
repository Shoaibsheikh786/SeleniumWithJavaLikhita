package synchronizationsIssues;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/"); 
		
		//7
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		//WebElement input = driver.findElement(By.name("q"));
		
	WebElement input=	wait.until(ExpectedConditions.presenceOfElementLocated(By.name("q")));
		input.sendKeys("Hello World");
		input.sendKeys(Keys.ENTER);
    
		
		WebElement ele = driver.findElement(By.xpath("//h3[text()='\"Hello, World!\" program']"));
		
		ele.click();

	}
	
	

}
