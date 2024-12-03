package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.GithubLoginPage;
import pageObjects.Utility;


public class GithubLoginSteps {
	
	   private AppiumDriver driver;
	   private GithubLoginPage loginPage;
	   private Utility utility;
	    public GithubLoginSteps() {
	        System.out.println("Initializing LoginSteps...");
	        this.driver = Hooks.getDriver();
	        if (driver == null) {
	            System.out.println("Driver is null in GmailLoginSteps constructor!");
	            throw new RuntimeException("Driver is not initialized.");
	        }
	        this.loginPage = new GithubLoginPage(driver);
	        this.utility = new Utility(driver);
	    }

String emailID = "kingstonrathna@gmail.com";
String password = "Rkrk.55555";
String invalidEmailID = "githubrkk";
String invalidpassword = "Github23245";


@Given("User is on Github login page")
public void user_is_on_github_login_page() {
   driver.get("https://github.com/login");
}
@When("User enters valid email {string} and password {string}")
public void user_enters_valid_email_and_password(String string, String string2) {
   loginPage.enterEmail(emailID);
   loginPage.enterPassword(password);
   loginPage.clickSignin();
}
@Then("User should be able to login successfully")
public void user_should_be_able_to_login_successfully() {
	WebElement dashboard = driver.findElement(By.xpath("//span[text()='Dashboard']"));
	boolean displayed = dashboard.isDisplayed();
	if (displayed) {
		System.out.println("User is logged in successfully");
	} else {
		System.out.println("User is not logged in");
	}
}

//-------tag 2 --------//

@Given("User is on Github login page1")
public void user_is_on_github_login_page1() {
	driver.get("https://github.com/login");
}
@When("User enters invalid email1 {string} and password1 {string}")
public void user_enters_invalid_email1_and_password1(String string, String string2) {
	loginPage.enterEmail(invalidEmailID);
	   loginPage.enterPassword(invalidpassword);
	   loginPage.clickSignin();
}
@Then("User should not be able to login successfully")
public void user_should_not_be_able_to_login_successfully() {
	WebElement dashboard = driver.findElement(By.xpath("//div[@class='js-flash-alert']"));
	boolean displayed = dashboard.isDisplayed();
	if (displayed) {
		System.out.println("User is not able to log in");
	} else {
		System.out.println("User is logged in with invalid credentials");
	}
}

}
