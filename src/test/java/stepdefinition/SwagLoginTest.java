package stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SwagLoginTest 
{
	public WebDriver driver;
	@Before
	public void setup() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	}
	@Given("User is in the login Page")
	public void user_is_in_the_login_page() 
	{
		driver.get("https://www.saucedemo.com/");
	}

	@When("^User enters the (.+) and (.+)$")
	public void user_enters_the_standard_user_and_secret_sauce(String uname,String pword) {
	    driver.findElement(By.id("user-name")).sendKeys(uname);
	    driver.findElement(By.id("password")).sendKeys(pword);
	}

	@When("User clicks the login buttons")
	public void user_clicks_the_login_button() {
		driver.findElement(By.id("login-button")).click();
	}

	@Then("Homepage should be displayed")
	public void homepage_should_be_displayed() {
		WebDriverWait wait=new WebDriverWait(driver,5);
		boolean actual = driver.findElement(By.id("shopping_cart_container")).isDisplayed();
		if (actual==true) {
			System.out.println("You're in the homepage");
		}
		else
			System.out.println("You must have entered some wrong credentials");
	}
	
	@After
	public void tearDown() {
		driver.close();
	}
}
