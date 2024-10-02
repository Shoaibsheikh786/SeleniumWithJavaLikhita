package alertsPopUp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertWithKeys {

	public static void main(String[] args) {
    
	  //button[@id='js-confirm']
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://practice.expandtesting.com/js-dialogs");
		
		driver.findElement(By.xpath("//*[@id=\"js-prompt\"]")).click();
		
	Alert al=	driver.switchTo().alert();
	
	al.sendKeys("Likhita");
	
	al.accept();
	}

}
