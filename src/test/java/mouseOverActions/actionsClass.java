package mouseOverActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	//	Actions Class  mousehover, keyboard actions (right lick)
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		
WebElement ele=		driver.findElement(By.xpath("//a[text()='Components']"));

     Actions act=new Actions(driver);
     
     act.moveToElement(ele).perform();
	
	}

}
