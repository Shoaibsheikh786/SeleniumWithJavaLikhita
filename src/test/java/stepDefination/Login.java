package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	
	WebDriver driver;
	
	@Given("open chrome")
	public void open_chrome() {
		driver=new ChromeDriver();
	}

	@When("user enters url {string}")
	public void user_enters_url(String url) {
		driver.get(url);
		}

	@When("user enters username as {string}")
	public void user_enters_username_as(String user) {
		driver.findElement(By.id("username")).sendKeys(user);
	}

	@When("user enters password as {string}")
	public void user_enters_password_as(String pass) {
		driver.findElement(By.id("password")).sendKeys(pass);
		
	}

	@When("user clicks on login")
	public void user_clicks_on_login() {
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Then("user is redirected to logout page {string}")
	public void user_is_redirected_to_logout_page(String string) {
	}



}
