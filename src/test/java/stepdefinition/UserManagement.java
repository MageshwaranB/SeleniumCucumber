package stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import myHooks.HooksMethods;

public class UserManagement 
{
	public WebDriver driver;
//	@Before
//	public void setup() {
//		WebDriverManager.chromedriver().setup();
//		driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		
//	}
//	@Given("User is in the login page")
//	public void user_is_in_the_login_page() 
//	{
//		driver.get("https://opensource-demo.orangehrmlive.com/");
//		WebElement heading = driver.findElement(By.id("logInPanelHeading"));
//		System.out.println(heading.getText());
//		heading.isDisplayed();
//	}
//
//	@When("user enter the username and password")
//	public void user_enter_the_username_and_password() {
//		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
//		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
//	}
//
//	@When("user clicks the login button to login")
//	public void user_clicks_the_login_button_to_login() {
//		driver.findElement(By.id("btnLogin")).click();
//		try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//
//	@When("user will be in the dashboard page")
//	public void user_will_be_in_the_dashboard_page() 
//	{
//		driver.findElement(By.id("menu_dashboard_index")).isDisplayed();
//	}
//	@When("User clicks the Admin link and also clicks the add user button")
//	public void user_clicks_the_admin_link_and_also_clicks_the_add_user_button() {
//	  driver.findElement(By.xpath("//div[@id='mainMenu']/ul/li[1]")).click();
//	  driver.findElement(By.id("btnAdd")).click();
//	  	try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	@Then("User must be in User Management Page")
//	public void user_must_be_in_user_management_page() {
//	   System.out.println("HI");
//	}
//	
//	@Given("User present in the User Management page")
//	public void user_present_in_the_user_management_page() {
//	    driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
//	}
//
//	@When("User gets the employee name from the dropdown")
//	public void user_gets_the_employee_name_from_the_dropdown() {
//	    driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys("a");
//	    try {
//			Thread.sleep(4000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	    driver.findElement(By.xpath("//div[@class='ac_results']/ul/li[5]")).click();
//	}
//
//	@When("User enters the username and password")
//	public void user_enters_the_username_and_password() {
//		driver.findElement(By.id("systemUser_userName")).sendKeys("Tendulkar@123");
//		driver.findElement(By.id("systemUser_password")).sendKeys("SpdEmer&&2005");	
//	}
//
//	@When("user enters the confirm password and clicks save button")
//	public void user_enters_the_confirm_password_and_clicks_save_button() {
//	   driver.findElement(By.id("systemUser_confirmPassword")).sendKeys("SpdEmer&&2005");
//	   driver.findElement(By.id("btnSave")).click();
//	}
//
//	@Then("User's account will be added")
//	public void user_s_account_will_be_added() throws InterruptedException 
//	{
//		Thread.sleep(4000);
//	}
//	
//	@After
//	public void tearDown() {
//		driver.close();
//	}

}
