package synchronizationsIssues;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImpWait {

	public static void main(String[] args) {
		// 3 wait
		// 1. implicit wait
		// 2. explicit
		// 3. fluent wait

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		driver.get("https://www.google.com/");
		WebElement input = driver.findElement(By.name("q"));
		input.sendKeys("Hello World");
		input.sendKeys(Keys.ENTER);
    
		
		WebElement ele = driver.findElement(By.xpath("//h3[text()='\"Hello, World!\" program']"));
		
		ele.click();

	}

}
