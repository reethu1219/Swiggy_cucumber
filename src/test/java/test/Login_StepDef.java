package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
//import io.cucumber.java.en.And;import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class Login_StepDef {
	
	WebDriver driver;
	
	@Before		//hooks
	public void setup() {
		System.setProperty("webdriver.chrome.driver","/home/reethacmtecnotr/Downloads/chromedriver");
		System.setProperty("webdriver.gecko.driver","/home/reethacmtecnotr/Downloads/geckodriver");
		
		driver = new ChromeDriver();
		
	}
	
	@After
	public void teardown() {
		
		//driver.quit();
		
	}
	
	
		
	
	

	  @Given("^user has opened swiggy website on chrome browser$")
	    public void user_has_opened_swiggy_website_on_chrome_browser() throws Throwable {
		  
		  driver.get("https://www.swiggy.com/");
	       
	        driver.manage().window().maximize();
	       
	        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		  
		 
	        
	    }

	    @When("^User enters correct \"([^\"]*)\"$")
	    public void user_enters_correct_something(String phonenumber) throws Throwable {
	    	WebElement lnkLogin = driver.findElement(By.linkText("Login"));
	        lnkLogin.click();
	       
	        WebElement mobileno = driver.findElement(By.xpath("//*[@id=\"mobile\"]"));
	        mobileno.sendKeys(phonenumber);
	       
	        WebElement login_btn = driver.findElement(By.xpath("//input[@type=\'submit\']"));
	        login_btn.click();
	        
	    }

	    @Then("^user should be able to login successfully$")
	    public void user_should_be_able_to_login_successfully() throws Throwable {
	        
	    }

}
