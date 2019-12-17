package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class CRMstepDefination {
	WebDriver driver;
	
	@Given("^user is already on Login Page$")
	public void user_is_already_on_Login_Page() throws Throwable {
		System.setProperty("webdriver.chrome.driver","D:\\Testing_Material\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://www.freecrm.com/index.html");
	  
	}

	@When("^title of login page is Free CRM$")
	public void title_of_login_page_is_Free_CRM() throws Throwable {
		String title = driver.getTitle();
		 System.out.println(title);
		 Assert.assertEquals("#1 Free CRM software in the Cloud FreeCRM", title);
	   
	}

	@Then("^user enters username and password$")
	public void user_enters_username_and_password() throws Throwable {
		driver.findElement(By.xpath("//a[@class='btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left']")).click();
	   driver.findElement(By.name("email")).sendKeys("mithunkr0123@gmail.com");
	   driver.findElement(By.name("password")).sendKeys("9620@shruthi");
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable {
		WebElement loginBtn =
				 driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']"));
				 JavascriptExecutor js = (JavascriptExecutor)driver;
				 js.executeScript("arguments[0].click();", loginBtn);
	   
	}

	@Then("^user is on home page$")
	public void user_is_on_home_page() throws Throwable {
		String title = driver.getTitle();
		 System.out.println("Home Page title ::"+ title);
		 Assert.assertEquals("CRM", title);
	    
	}

	@Then("^Close the browser$")
	public void Close_the_browser() throws Throwable {
		driver.quit();
	    
	}

}
