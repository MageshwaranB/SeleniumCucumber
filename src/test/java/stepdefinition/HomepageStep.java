package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HomepageStep {
	public static WebDriver driver;

//	@Given("User is in login page")
//	public void user_is_in_login_page() {
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		driver.get("https://opensource-demo.orangehrmlive.com/");
//		driver.manage().window().maximize();
//	}
//	@When("User enters username and password and clicks the login button")
//	public void user_enters_username_and_password() {
//		
//		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
//		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
//		
//	}
//
//	@Then("User is navigated to the homepage")
//	public void user_is_navigated_to_the_homepage() {
//		driver.findElement(By.id("btnLogin")).click();
//		try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//
//	@When("User clicks myinfo link")
//	public void user_clicks_myinfo_link() {
//		driver.findElement(By.id("menu_pim_viewMyDetails")).click();
//	}
//
//	@Then("info is displayed")
//	public void info_is_displayed() {
//		
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		driver.findElement(By.id("empPic")).isDisplayed();
//		driver.close();
//		}
	
//	@When("User clicks the welcome button")
//	public void user_clicks_the_welcome_button() {
//	   driver.findElement(By.id("welcome")).click();
//	}
//
//	@When("User clicks the logout button")
//	public void user_clicks_the_logout_button() 
//	{
//		driver.findElement(By.xpath("//*[@id=\"welcome-menu\"]/ul/li[3]/a")).click();
//	}
//
//	@Then("User is logged out from website")
//	public void user_is_logged_out_from_website() {
//	    	try {
//				Thread.sleep(3000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
	
//	@When("User clicks the welcome page and clicks the logout option")
//	public void user_clicks_the_welcome_page_and_clicks_the_logout_option() {
//	    driver.findElement(By.id("welcome")).click();
//	    WebDriverWait wait=new WebDriverWait(driver,10);
//	    WebElement logout = driver.findElement(By.xpath("//a[text()='Logout']"));
//	    wait.until(ExpectedConditions.visibilityOf(logout));
//	    logout.click();
//	}
//
//	@Then("Login page has to displayed")
//	public void login_page_has_to_displayed() {
//	    try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	    driver.findElement(By.id("logInPanelHeading")).isDisplayed();
//	    driver.close();
//	}

}

