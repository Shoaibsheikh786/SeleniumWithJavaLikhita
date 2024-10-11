package tryCatch;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

public class ExceptionEr {
	
	@Test
    public void test1() throws InterruptedException
    {
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://practice.expandtesting.com/");
		
		FluentWait<WebDriver> wait=new FluentWait<>(driver);
				//withtimeout means giving maximum time
				//.withTimeout(Duration.ofSeconds(5))
				//This sets how often the condition should be checked.

				//.pollingEvery(Duration.ofSeconds(2));
		
	WebElement ele=	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@type='text']")));
		
		ele.sendKeys("radio");
		try {
			WebElement path=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()='Radio Buttons']")));
		   System.out.println("Try block executed");
		   //Scroll the webpage 
		   JavascriptExecutor js=(JavascriptExecutor)driver;
		   js.executeScript("window.scrollTo(0,500);");
		   Thread.sleep(3000);
		   path.click();
		}
		catch(StaleElementReferenceException a) {
			
			
			WebElement path=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()='Radio Buttons']")));
			path.click();
		}
		//WebElement path=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@class='my-link stretched-link']")));
		//path.click();
		//WebElement home =wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()='Home']")));
	    //home.click();
			
		
	}
    }


