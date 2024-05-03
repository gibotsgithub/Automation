package stepDefinitions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.core.plugin.Options;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Headless {
	//WebDriver driver = new ChromeDriver();

	//JavascriptExecutor jse = (JavascriptExecutor) driver;

	WebDriver driver;

	JavascriptExecutor jse;

	public Headless() {
		// Set up ChromeOptions for headless browsing
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless"); // Run in headless mode

		driver = new ChromeDriver(options);
		jse = (JavascriptExecutor) driver;
	}

	@Given("fire google page")
	public void fire_google_page() {
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
	}

	@Then("successfully opened google page")
	public void successfully_opened_google_page() {
		System.out.println("successfully opened google page");
		
	}

}
