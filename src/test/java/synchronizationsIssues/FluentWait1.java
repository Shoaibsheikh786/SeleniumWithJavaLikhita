package synchronizationsIssues;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class FluentWait1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		driver.get("https://www.google.com/");
		
		FluentWait<WebDriver> fwait=new FluentWait<>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(5));
		
	WebElement ele=	    fwait.until(ExpectedConditions.presenceOfElementLocated(By.name("q")));
	 
	ele.sendKeys("hello");
	ele.sendKeys(Keys.ENTER);
	}

	
}
