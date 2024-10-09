package nopcommerceTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class BasicSetup {
	
	WebDriver driver;  //browser , url 
	@BeforeMethod()
	public void basicSetup()
	{
		driver=new ChromeDriver();
		driver.get("https://pvpk06.github.io/RamanaSoft/#/jobs");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	}

}
