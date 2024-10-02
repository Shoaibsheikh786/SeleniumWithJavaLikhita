package alertsPopUp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert1 {

	public static void main(String[] args) {
    
		WebDriver driver=new ChromeDriver();
		driver.get("https://practice.expandtesting.com/js-dialogs");
		
		driver.findElement(By.xpath("//button[@id='js-alert']")).click();
		
	Alert al=	driver.switchTo().alert();
	al.accept();
	
//	al.dismiss();
	
	}

}
