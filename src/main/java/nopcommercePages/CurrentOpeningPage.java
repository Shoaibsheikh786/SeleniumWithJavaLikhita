package nopcommercePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CurrentOpeningPage {

	// 1 . WebElements
	// 2. Methods which deals with those webelements
	// 3. constructor

	public CurrentOpeningPage(WebDriver driver) {
     PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@placeholder='Search jobs...']")
	WebElement serach;

	public void sendDataInSerach(String val) {
		serach.sendKeys(val);
	}

@FindBy(xpath = "//div[@class='col-md-12 col-6']//div[1]//div[1]//div[1]//div[3]//button[1]")
	WebElement details1;

	public void clickOnDetails1() {
		details1.click();
	}

	// 1. WebElement serach =driver.findElementBy(xpath="//input[@id=':r1:']")
	// 2. serach.sendKeys("sendData");
}
