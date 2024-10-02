package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindID {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		WebElement user=driver.findElement(By.id("email"));
		
		user.sendKeys("myemail@gmail.com");
	String clas=	user.getAttribute("class");
	
	System.out.println(clas);
	
String btn=	driver.findElement(By.xpath("//button[starts-with(@name,'log')]")).getText();
	
		System.out.println(btn);
		
		//1.
//		WebElement user=driver.findElement(By.id("email"));
//		
//		user.sendKeys("myemail@gmail.com");
//		
//		//  findElement
//		WebElement pass=driver.findElement(By.id("pass"));
//		
//		pass.sendKeys("Admin@123");
		
	//	driver.findElement(By.id("email")).sendKeys("Hello@gmil.in");
		
		

	}

}
