package pageObjects;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class GithubLoginPage extends BasePage{
	
	    private By emailField = By.xpath("//input[@id='login_field']");
	    private By passwordField = By.xpath("//input[@id='password']");
	    private By signinButton = By.xpath("//input[@name='commit']");
	   
	    
	public GithubLoginPage(AppiumDriver driver) {
		super(driver);
	}
	public void enterEmail(String Username) {
        driver.findElement(emailField).sendKeys(Username);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickSignin() {
    	driver.findElement(signinButton).click();
        
    }

}

