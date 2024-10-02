package mouseOverActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) {
    
		WebDriver driver = new ChromeDriver();
		driver.get("https://practice.expandtesting.com/context-menu");
		WebElement box=driver.findElement(By.xpath("//div[@id='hot-spot']"));
		
		// mouse over actions ---> rightClick(ContexClick());
		
		Actions act=new Actions(driver);
		act.contextClick(box).perform();
		
		
	}

}
