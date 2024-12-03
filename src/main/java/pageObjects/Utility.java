package pageObjects;

import java.time.Duration;
import java.util.NoSuchElementException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import io.appium.java_client.AppiumDriver;
import io.netty.handler.timeout.TimeoutException;

public class Utility extends BasePage{

	public Utility(AppiumDriver driver) {
		super(driver);
	}
	
	public void waitForElementToBeClickable(By byValue) {
		try {
			FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(15))
					.pollingEvery(Duration.ofMillis(200)).ignoring(NoSuchElementException.class);
			wait.until(ExpectedConditions.elementToBeClickable(byValue));
		} catch (TimeoutException e) {
			System.out.println("Timed out waiting for that element");
		}

}}
