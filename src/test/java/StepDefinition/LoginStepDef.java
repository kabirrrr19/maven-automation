package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStepDef extends LoginPage{

//	WebDriver driver;

	@Given(": User is on login page")
	public void user_is_on_login_page() {
		setup();
	}

//	@When(": User enters username")
//	public void user_enters_username() {
//		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
//
//	}
//	
//	//example of data driver directly in feature
//	@When(": User enters {string}")
//	public void user_enters(String password) {
//		driver.findElement(By.id("txtPassword")).sendKeys(password);
//	}

	@When("^: User enters (.+) and (.+)$")
    public void _user_enters_and(String username, String password) {
		login(username, password);
    }
	
	@When(": clicks on Login button")
	public void clicks_on_login_button() {
		loginClick();
	}

	@Then(": User should be able to login successfuly")
	public void user_should_be_able_to_login_successfuly() throws InterruptedException {
		System.out.println("Login Successful");
		Thread.sleep(3000);
		setupClose();
	}

}
