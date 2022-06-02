package stepdefinition;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
public class LoginStepDef 
{
	WebDriver driver;
	@Given("User is in login page")
	public void user_is_in_login_page() 
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	/*
		@When("User enters the username")
		public void user_enters_the_username() 
		{
		   	driver.findElement(By.id("txtUsername")).sendKeys("Admin");;
		}

		@When("User enter the password")
		public void user_enter_the_password() 
		{
			driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		}
	 */


	@When("User enters username as {string}")
	public void user_enters_username_as(String uname) {
		driver.findElement(By.id("txtUsername")).sendKeys(uname);
	}

	@When("User enter password as {string}")
	public void user_enter_password_as(String pword) {
		driver.findElement(By.id("txtPassword")).sendKeys(pword);
	}


	@When("User clicks the login button")
	public void user_clicks_the_login_button() 
	{
		driver.findElement(By.id("btnLogin")).click();
	}

	@Then("Homepage has to be displayed")
	public void homepage_has_to_be_displayed() 
	{
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.close();
	}
}


