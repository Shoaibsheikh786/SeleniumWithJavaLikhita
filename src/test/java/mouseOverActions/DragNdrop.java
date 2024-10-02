package mouseOverActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragNdrop {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://practice.expandtesting.com/drag-and-drop-circles");
		WebElement red = driver.findElement(By.xpath("//div[@class='red']"));
		WebElement drop = driver.findElement(By.xpath("//div[@id='target']"));

//drag n drop ---> mousehover action---> Actions ac.

		Actions act=new Actions(driver);
		  
		act.dragAndDrop(red, drop).build().perform();   //build().perform();
	}

}
