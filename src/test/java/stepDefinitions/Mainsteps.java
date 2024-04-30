package stepDefinitions;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Mainsteps {
	WebDriver driver = new ChromeDriver();

	JavascriptExecutor jse = (JavascriptExecutor) driver;

	@Given("Admin in on the login page")
	public void i_am_on_the_login_page() {
		driver.get("https://staging.aiqod.com:843//");
		driver.manage().window().maximize();
	}

	@When("Admin will enter username and password")
	public void Admin_will_enter_username_and_password() {
		driver.findElement(By.id("userId")).sendKeys("0558908908");
		driver.findElement(By.id("password")).sendKeys("Tcs@gibots11!");

	}

	@And("Admin will click the login button")
	public void Admin_will_click_the_login_button() {
		driver.findElement(By.id("signIn")).click();
	}

	@And("Admin should be logged in to the account")
	public void Admin_should_be_logged_in_to_the_account() throws InterruptedException {
		System.out.println("Admin logged in successfully");
		Thread.sleep(3000);

		jse.executeScript("window.scrollBy(0,800)");
		Thread.sleep(3000);
//		
//		WebElement frameElement = driver.findElement(By.xpath("//div[@class='features-scroll']"));
//		driver.switchTo().frame(frameElement);
//		jse.executeScript("window.scrollBy(0,700)");
//		Thread.sleep(3000);
//		

	}

	@And("delete subscriber")
	public void delete_subscriber() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"cart-admin\"]/app-tile/div/div/a")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath(
				"/html/body/app-root/ui-view/app-root/ui-view/app-web-main-layout/ui-view/app-main-admin/ui-view/app-admin-selection/div/div[2]/div[1]/app-tile/div/div/a"))
				.click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"searchElement\"]")).sendKeys("Suresh");
		Thread.sleep(5000);

		driver.findElement(By.id(
				"userDelete"))
				.click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("/html/body/modal-container/div/div/app-confirm-modal/div/div/button[1]")).click();
		Thread.sleep(2000);

	}

	@Then("Subscriber deleted successfully")
	public void Subscriber_deleted_successfully() throws InterruptedException {
		System.out.println("Subscriber deleted successfully");
		Thread.sleep(2000);
	}

	// subscriber_signup
	@Given("Subsriber is on home page")
	public void Subsriber_is_on_home_page() throws InterruptedException {

		// driver.switchTo().newWindow(WindowType.TAB);
		Thread.sleep(2000);
		driver.get("https://staging.aiqod.com:843//");
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}

	@When("Subscriber will sign up")
	public void sub_sign_up() throws InterruptedException {
		driver.findElement(By.id("signUp")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("name")).sendKeys("Suresh Bankar");
		Thread.sleep(2000);

		driver.findElement(By.id("mobileNo")).sendKeys("7875478148");
		Thread.sleep(2000);

		driver.findElement(By.id("emailId")).sendKeys("atulbankar1@gmail.com");
		Thread.sleep(2000);

		driver.findElement(By.id("loginPass")).sendKeys("Surbhi@123");
		Thread.sleep(2000);

		driver.findElement(By.id("cpassword")).sendKeys("Surbhi@123");
		Thread.sleep(2000);

		driver.findElement(By.name("trmcond")).click();
		Thread.sleep(2000);

		driver.findElement(By.className("upSignUp"))
				.click();
		Thread.sleep(30000);
	}

	@Then("Subscriber Signed up successfully")
	public void sub_sign_succ() {
		System.out.println("Subscriber signed up successfully");
	}

	// setup_wizard
	@Given("Subscriber will enter user name and password")
	public void subscriber_will_enter_user_name_and_password() throws InterruptedException {
		// driver.switchTo().newWindow(WindowType.TAB);
		Thread.sleep(2000);
		driver.get("https://staging.aiqod.com:843//");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.id("userId")).sendKeys("7875478148");
		driver.findElement(By.id("password")).sendKeys("Surbhi@123");
	}

	@When("Subscriber will log in")
	public void subscriber_will_log_in() throws InterruptedException {
		driver.findElement(By.id("signIn")).click();
		Thread.sleep(3000);

		// jse.executeScript("window.scrollBy(0,500)");
	}

	@And("Subscriber will create role")
	public void subscriber_will_create_role() throws InterruptedException {
		driver.findElement(By.id(
				"controlinp-org-name"))
				.sendKeys("Surbhi pvt ltd");
		Thread.sleep(2000);

		driver.findElement(By.xpath(
				"//*[@id=\"forScroll\"]/accordion/accordion-group/div/div[2]/div/div[2]/app-dropdown-select/div/div/div/button/span[2]/span"))
				.click();
		Thread.sleep(2000);

		driver.findElement(By.xpath(
				"//*[@id=\"forScroll\"]/accordion/accordion-group/div/div[2]/div/div[2]/app-dropdown-select/div/div/div/div/div/input"))
				.sendKeys("Maharashtra");
		Thread.sleep(2000);

		driver.findElement(By.xpath(
				"//*[@id=\"forScroll\"]/accordion/accordion-group/div/div[2]/div/div[2]/app-dropdown-select/div/div/div/div/ul/li[9]/a/span[1]"))
				.click();

		// driver.findElement(By.xpath("//li[@id='11']//a[contains(text(),'Setup
		// Wizard')]")).click();
//		Thread.sleep(2000);
//		
		driver.findElement(By.id("UpdateandNextOrg")).click();
		Thread.sleep(3000);

//		driver.findElement(By.xpath("//i[@class='icon fa fa-plus']")).click();
//		Thread.sleep(5000);

		driver.findElement(By.id("rolename0")).sendKeys("super");

		Thread.sleep(2000);

		driver.findElement(By.id("rolelevel0")).sendKeys("3");
		Thread.sleep(2000);

		driver.findElement(
				By.xpath("//tbody/tr[@class='ng-star-inserted']/td[4]/app-multidropdown-select[1]/div[1]/i[1]"))
				.click();
		Thread.sleep(2000);

		driver.findElement(
				By.xpath("//tbody/tr[@class='ng-star-inserted']/td[5]/app-multidropdown-select[1]/div[1]/i[1]"))
				.click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//i[@class='icon fa fa-save']")).click();
		Thread.sleep(2000);
		// JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,200)");

		driver.findElement(By.id("UpdateandNextRole")).click();
		Thread.sleep(2000);

		// HANDBOOK_HANDLING
		driver.findElement(By.xpath("//*[@id=\"step-6\"]/div/div/div/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"step-6\"]/div/div/div/button")).click();
		Thread.sleep(2000);

		jse.executeScript("window.scrollBy(0,200)");

	}

	@And("Subscriber will create user")
	public void subscriber_will_create_user() throws InterruptedException {

//		driver.findElement(By.xpath("//i[@class='icon fa fa-plus']")).click();
//		Thread.sleep(2000);

		driver.findElement(By.id("emailInput0")).sendKeys("automationtest647@gmail.com");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@title='Select Department*']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"box\"]/table/tbody/tr/td[3]/app-dropdown-select/div/div/div/div/input"))
				.sendKeys("IT");
		Thread.sleep(3000);

		driver.findElement(
				By.xpath("//*[@id=\"box\"]/table/tbody/tr/td[3]/app-dropdown-select/div/div/div/ul/li/button")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@title='Select Roles*']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"box\"]/table/tbody/tr/td[4]/app-dropdown-select/div/div/div/div/input"))
				.sendKeys("super");
		Thread.sleep(2000);

		driver.findElement(By.xpath(
				"/html/body/app-root/ui-view/app-root/ui-view/app-web-main-layout/ui-view/app-org/ui-view/app-add-org/div/div[2]/div[2]/div/div/app-view-contact-table/div/table/tbody/tr/td[4]/app-dropdown-select/div/div/div/ul/li/a/span[1]"))
				.click();
		Thread.sleep(2000);

		driver.findElement(
				By.xpath("//*[@id=\"box\"]/table/tbody/tr/td[5]/app-dropdown-select/div/div/button/span[2]/span"))
				.click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"box\"]/table/tbody/tr/td[5]/app-dropdown-select/div/div/div/div/input"))
				.sendKeys("atul");
		Thread.sleep(2000);

		driver.findElement(
				By.xpath("//*[@id=\"box\"]/table/tbody/tr/td[5]/app-dropdown-select/div/div/div/ul/li/a/span[1]"))
				.click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"box\"]/table/tbody/tr/td[6]/app-multidropdown-select/div/i")).click();
		Thread.sleep(6000);

		driver.findElement(By.xpath(
				"/html/body/app-root/ui-view/app-root/ui-view/app-web-main-layout/ui-view/app-org/ui-view/app-add-org/div/div[2]/div[2]/div/div/app-view-contact-table/div/table/tbody/tr/td[1]/a[1]/i"))
				.click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//*[@id=\"box\"]/div[2]/button")).click();
		Thread.sleep(5000);

	}

	@Then("Subscriber done with the setup wizard")
	public void subscriber_done_with_the_setup_wizard() {
		System.out.println("Subscriber successfully created role and user");
	}

	// Gmail_signup
	@Given("User will go on gmail page")
	public void user_will_go_on_gmail_page() throws InterruptedException {
		// GMAIL_SIGN_UP
		// driver.switchTo().newWindow(WindowType.TAB);
		// Thread.sleep(2000);
		driver.get("https://www.gmail.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}

	@When("User will sign in gmail")
	public void user_will_sign_in_gmail() throws InterruptedException {
		// Find the email input field and enter your email
		WebElement emailInput = driver.findElement(By.id("identifierId"));
		emailInput.sendKeys("automationtest647@gmail.com");
		Thread.sleep(6000);

		// Click on the Next button
		WebElement nextButton = driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span"));
		nextButton.click();
		Thread.sleep(9000);

		// Wait for the password input field to be visible
		WebElement passwordInput = driver.findElement(By.xpath(
				"/html/body/div[1]/div[1]/div[2]/c-wiz/div/div[2]/div/div/div/form/span/section[2]/div/div/div[1]/div[1]/div/div/div/div/div[1]/div/div[1]/input"));
		Thread.sleep(2000);
		// Enter your password
		passwordInput.sendKeys("Atul.b@123");
		Thread.sleep(9000);

		// Click on the Next button
		WebElement passwordNextButton = driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/span"));
		passwordNextButton.click();

		Thread.sleep(10000);

		driver.findElement(By.xpath(
				"/html/body/div[7]/div[3]/div/div[2]/div[2]/div/div/div/div[1]/div/div[1]/div[1]/div/div/div[5]/div/div"))
				.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"/html/body/div[7]/div[3]/div/div[2]/div[2]/div/div/div/div[1]/div/div[1]/div[1]/div/div/div[5]/div/div"))
				.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"/html/body/div[7]/div[3]/div/div[2]/div[2]/div/div/div/div[2]/div/div[1]/div/div/div[8]/div/div[1]/div[2]/div/table/tbody/tr[1]"))
				.click();
		Thread.sleep(9000);
//
//        driver.findElement(By.xpath("/html/body/div[7]/div[3]/div/div[2]/div[2]/div/div/div/div[2]/div/div[1]/div/div[2]/div/div[2]/div[2]/div/div[3]/div[2]/div/div/div/div/div[1]/div[2]/div[3]/div[2]/div/img")).click();
//        Thread.sleep(3000);
//        

		// CLICK_HERE
		driver.findElement(By.linkText("Click Here")).click();
		Thread.sleep(2000);

		// User_signup

		// SWITCH TO NEW WINDOW
		// Get the window handles
		Set<String> windowHandles = driver.getWindowHandles();

		// Switch to the new window
		for (String windowHandle : windowHandles) {
			if (!windowHandle.equals(driver.getWindowHandle())) {
				driver.switchTo().window(windowHandle);
				break;
			}
		}

		// Now you are in the new window, perform actions as needed

		Thread.sleep(30000);

		// USER_SIGN_UP
//			driver.switchTo().newWindow(WindowType.TAB);
//		     Thread.sleep(2000);
		// driver.get("https://staging.aiqod.com:843/?registrationId=6620ea45ef0577325d1bd497");
//		     driver.manage().window().maximize();
		// Thread.sleep(2000);

//		     driver.findElement(By.xpath("//button[normalize-space()='Sign up']")).click();
//				Thread.sleep(2000);

//				driver.findElement(By.xpath("//input[@value='Individual']")).click();
//				Thread.sleep(2000);

		driver.findElement(By.id(
				"name"))
				.sendKeys("Atul Bankar");
		Thread.sleep(2000);

		driver.findElement(By.id("mobileNo")).sendKeys("9604258894");
		Thread.sleep(2000);

//				driver.findElement(By.xpath("//input[@placeholder='Email ID']")).sendKeys("atul.b@aiqod.com");
//				Thread.sleep(2000);

		driver.findElement(By.id("loginPass")).sendKeys("Atul.b@123");
		Thread.sleep(2000);

		driver.findElement(By.id("cpassword")).sendKeys("Atul.b@123");
		Thread.sleep(2000);

		driver.findElement(By.name("trmcond")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath(
				"//div[@class='col-sm-4 col-md-4 col-lg-4 hero-text']//button[@class='upSignUp'][normalize-space()='SEND OTP']"))
				.click();
		Thread.sleep(30000);
	}

	@Then("User signed up successfuly")
	public void User_signed_up_successfuly() {
		System.out.println("user signed up successfully");
	}

	// Login_for_collabpro

	@Given("Assignee will login")
	public void Assignee_will_login() throws InterruptedException {
		// FIRST_TEST_CLASS_HERE
		// ASSIGNEE_LOGIN
		driver.get("https://staging.aiqod.com:843//");
		driver.manage().window().maximize();
		driver.findElement(By.id("userId")).sendKeys("7875478148");
		driver.findElement(By.id("password")).sendKeys("Surbhi@123");
		driver.findElement(By.id("signIn")).click();
		Thread.sleep(3000);
	}

	@When("Assignee will click on collab pro")
	public void Assignee_will_click_on_collab_pro() throws InterruptedException {
		
		driver.findElement(By.xpath("//a[@id='Collab Pro']")).click();
		Thread.sleep(2000);
	}

	@And("Assignee will assign task to created user")
	public void Assignee_will_assign_task_to_created_user() throws InterruptedException {
		// TASK
		driver.findElement(By.id("Task0")).sendKeys("New selenium task-01");
		Thread.sleep(2000);

		// DEPT
		driver.findElement(By.xpath("//button[@data-id='drpVal-Department']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath(
				"/html/body/modal-container/div/div/app-dynamic-form-builder/div/div/div[2]/div/div/app-additional-info/div/form/div[1]/div[2]/div/app-dropdown-select/div/div/div/div/input"))
				.sendKeys("IT");

		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='text'][normalize-space()='IT']")).click();
		Thread.sleep(2000);
//							  List<WebElement>dynamicList=driver.findElements(By.xpath("//div[@class='btn-group bootstrap-select custom-drop-down custom-picker-Department -Department show-menu-arrow ng-untouched ng-pristine ng-valid open']//li"));
//							
//							for(int i=0;i<dynamicList.size();i++)
//							{
//								String text=dynamicList.get(i).getText();
//								
//								System.out.println("Text is"+text);
//								if(text.contains("ÏT"))
//								{
//									
//									dynamicList.get(i).click();
//									break;
//									
//									
//								}
//								
//								
//								
//								
//								
//							}
//							
		// PROJECT
		// driver.findElement(By.xpath("//input[@name='Project']")).sendKeys("Project1");
		// Thread.sleep(2000);

		// START_DATE
		// WebElement dateTimeInput =
		// driver.findElement(By.cssSelector("input[name='Start Date']"));
		// dateTimeInput.clear();
//							 Actions actions = new Actions(driver);
//							 actions.sendKeys(dateTimeInput, "29032024");
//							 
//							 actions.perform();
		// Thread.sleep(5000);
		// dateTimeInput.sendKeys("28032024");
		// Thread.sleep(2000);
		// dateTimeInput.sendKeys("01042024");
		// Thread.sleep(5000);
		// dateTimeInput.sendKeys(Keys.TAB);
		// Thread.sleep(2000);
		// dateTimeInput.sendKeys("0731PM");

		Thread.sleep(2000);

		// PROJECT
		driver.findElement(By.id("Project3")).sendKeys("new project-01");
		Thread.sleep(2000);

		// PRIORITY
		driver.findElement(By.xpath("//button[@title='Urgent']//span[@class='caret']")).click();
		Thread.sleep(2000);
//							driver.findElement(By.xpath("//button[@title='Urgent']//span[@class='caret']")).click();
//							Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html/body/modal-container/div/div/app-dynamic-form-builder/div/div/div[2]/div/div/app-additional-info/div/form/div[1]/div[5]/div/app-dropdown-select/div/div/div/div/input"))
				.sendKeys("Urgent");

		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@class='selected active']//a[@role='option']")).click();
		Thread.sleep(2000);

		// DUE_DATE
		// WebElement dateTimeInput2 = driver.findElement(By.xpath("//input[@name='Due
		// Date']"));
//							 dateTimeInput2.clear();
//							 Actions actions2 = new Actions(driver);
//							 actions2.sendKeys(dateTimeInput2, "31032024");
//							 actions2.perform();
		// Thread.sleep(2000);
		// dateTimeInput2.sendKeys("03042024");
		// Thread.sleep(2000);
		// dateTimeInput2.sendKeys(Keys.TAB);
		// Thread.sleep(2000);
		// dateTimeInput2.sendKeys("0245PM");

		// ASSIGN_TO
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@data-id='drpVal-Assign_To']//span[@class='caret']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html/body/modal-container/div/div/app-dynamic-form-builder/div/div/div[2]/div/div/app-additional-info/div/form/div[1]/div[7]/div/app-dropdown-select/div/div/div/div/input"))
				.sendKeys("Atul Bankar");
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html/body/modal-container/div/div/app-dynamic-form-builder/div/div/div[2]/div/div/app-additional-info/div/form/div[1]/div[7]/div/app-dropdown-select/div/div/div/ul/li[2]/a/span[1]"))
				.click();
		Thread.sleep(3000);

		// TASK_DESCRIPTION
		driver.findElement(By.xpath("//textarea[@placeholder='Add Description']"))
				.sendKeys("this is project description");
		Thread.sleep(2000);
		driver.findElement(By.id("add_new_id")).click();
		Thread.sleep(3000);

//		driver.findElement(By.xpath("//*[@id=\"Home_id\"]")).click();
//		Thread.sleep(3000);

//		driver.findElement(By.xpath("//*[@id=\"fav-process-1\"]/div/a")).click();
//		Thread.sleep(2000);

		// TASK
		driver.findElement(By.id("Task0")).sendKeys("New selenium task-02");
		Thread.sleep(2000);

		// DEPT
		driver.findElement(By.xpath("//button[@data-id='drpVal-Department']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath(
				"/html/body/modal-container/div/div/app-dynamic-form-builder/div/div/div[2]/div/div/app-additional-info/div/form/div[1]/div[2]/div/app-dropdown-select/div/div/div/div/input"))
				.sendKeys("IT");

		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='text'][normalize-space()='IT']")).click();
		Thread.sleep(2000);
//									List<WebElement>dynamicList=driver.findElements(By.xpath("//div[@class='btn-group bootstrap-select custom-drop-down custom-picker-Department -Department show-menu-arrow ng-untouched ng-pristine ng-valid open']//li"));
//									
//									for(int i=0;i<dynamicList.size();i++)
//									{
//										String text=dynamicList.get(i).getText();
//										
//										System.out.println("Text is"+text);
//										if(text.contains("ÏT"))
//										{
//											
//											dynamicList.get(i).click();
//											break;
//											
//											
//										}
//										
//										
//										
//										
//										
//									}
//									

		Thread.sleep(2000);

		// START_DATE
		// WebElement dateTimeInput3 =
		// driver.findElement(By.cssSelector("input[name='Start Date']"));
		// dateTimeInput3.clear();
//									 Actions actions = new Actions(driver);
//									 actions.sendKeys(dateTimeInput, "29032024");
//									 
//									 actions.perform();
		// Thread.sleep(5000);
		// dateTimeInput.sendKeys("28032024");
		// Thread.sleep(2000);
		// dateTimeInput3.sendKeys("01042024");
		// Thread.sleep(5000);
		// dateTimeInput3.sendKeys(Keys.TAB);
		// Thread.sleep(2000);
		// dateTimeInput3.sendKeys("0731PM");

		Thread.sleep(2000);

		// PROJECT
		driver.findElement(By.id("Project3")).sendKeys("new project-02");
		Thread.sleep(2000);

		// PRIORITY
		driver.findElement(By.xpath("//button[@title='Urgent']//span[@class='caret']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html/body/modal-container/div/div/app-dynamic-form-builder/div/div/div[2]/div/div/app-additional-info/div/form/div[1]/div[5]/div/app-dropdown-select/div/div/div/div/input"))
				.sendKeys("Urgent");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@class='selected active']//a[@role='option']")).click();
		Thread.sleep(2000);

		// DUE_DATE
		// WebElement dateTimeInput4 = driver.findElement(By.xpath("//input[@name='Due
		// Date']"));
		// dateTimeInput4.clear();
//									 Actions actions2 = new Actions(driver);
//									 actions2.sendKeys(dateTimeInput2, "31032024");
//									 actions2.perform();
		// Thread.sleep(2000);
		// dateTimeInput4.sendKeys("03042024");
		// Thread.sleep(2000);
		// dateTimeInput4.sendKeys(Keys.TAB);
		// Thread.sleep(2000);
		// dateTimeInput4.sendKeys("0245PM");

		// ASSIGN_TO
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@data-id='drpVal-Assign_To']//span[@class='caret']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html/body/modal-container/div/div/app-dynamic-form-builder/div/div/div[2]/div/div/app-additional-info/div/form/div[1]/div[7]/div/app-dropdown-select/div/div/div/div/input"))
				.sendKeys("Atul Bankar");
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html/body/modal-container/div/div/app-dynamic-form-builder/div/div/div[2]/div/div/app-additional-info/div/form/div[1]/div[7]/div/app-dropdown-select/div/div/div/ul/li[2]/a/span[1]"))
				.click();
		Thread.sleep(3000);

		// TASK_DESCRIPTION
		driver.findElement(By.xpath("//textarea[@placeholder='Add Description']"))
				.sendKeys("this is project description");
		Thread.sleep(3000);
		driver.findElement(By.id("proceedcp_id")).click();
		Thread.sleep(2000);

		// checking_task
//							driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();
//							Thread.sleep(5000);
//							
//							
//							
//							driver.findElement(By.xpath("//div[@id='cart-mytasks']//div[@class='tile-view']")).click();
//							Thread.sleep(5000);
//							
//							
//							driver.findElement(By.xpath("//span[@class='fa fa-caret-down']")).click();
//							Thread.sleep(3000);
//							
//							driver.findElement(By.xpath("//span[normalize-space()='Task created by me']")).click();
//							Thread.sleep(2000);
//							
//							driver.findElement(By.xpath("//div[@id='drpTask']//div[1]//div[1]")).click();
//							Thread.sleep(2000);
//							
//							driver.findElement(By.xpath("//button[normalize-space()='Fetch task']")).click();
//							Thread.sleep(2000);
//							
//							driver.findElement(By.xpath("//body[1]/app-root[1]/ui-view[1]/app-root[1]/ui-view[1]/app-web-main-layout[1]/ui-view[1]/app-process-container[1]/ui-view[1]/app-new-task-list[1]/div[2]/div[2]/tabset[1]/div[1]/tab[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/label[1]/div[1]/span[1]/i[1]")).click();
//							Thread.sleep(5000);
//							
//							

		// driver.findElement(By.xpath("//button[@type='submit']")).click();
		// Thread.sleep(2000);
		// driver.findElement(By.xpath("//button[normalize-space()='Save and
		// Continue']")).click();

		// Thread.sleep(2000);

//							
//							Thread.sleep(2000);
//							
//							driver.findElement(By.xpath("//button[normalize-space()='Save and Continue']")).click();
//				

	}

	@Then("Assignee has successfully assigned task to the user")
	public void Assignee_has_successfully_assigned_task_to_the_user() {

		System.out.println("Assignee has successfully assigned task to the user");
	}

	@Given("User will go on home page")
	public void User_will_go_on_home_page() throws InterruptedException {

//				          MERGING_HERE
		// driver.switchTo().newWindow(WindowType.TAB);
		Thread.sleep(2000);
		driver.get("https://staging.aiqod.com:843/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}

	@When("User will sign in")
	public void User_will_sign_in() throws InterruptedException {
		// ATUL_LOGIN
		driver.findElement(By.id("userId")).sendKeys("9604258894");
		driver.findElement(By.id("password")).sendKeys("Atul.b@123");
		driver.findElement(By.id("signIn")).click();
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,300)");
		Thread.sleep(3000);

	}

	@And("User will send task for review")
	public void User_will_send_task_for_review() throws InterruptedException {

		driver.findElement(By.xpath(
				"//div[@id='cart-mytasks']//app-tile//div[@class='tile-view']//div//a[@class='align-center default tile tile-padding']"))
				.click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[@class='fa fa-caret-down']")).click();
		Thread.sleep(2000);

//		driver.findElement(By.xpath("//div[@id='drpTask']//div[1]//div[1]")).click();
//		Thread.sleep(2000);

		driver.findElement(By.id("FetchTask_id")).click();
		Thread.sleep(5000);

		// JavascriptExecutor jse=(JavascriptExecutor) driver;
		// jse.executeScript("window.scrollBy(0,200)");

		driver.findElement(By.xpath("//tbody/tr[1]/td[1]/div[1]/label[1]/div[1]/span[1]/i[1]")).click();
		Thread.sleep(5000);
		jse.executeScript("window.scrollBy(0,200)");
		Thread.sleep(2000);
		driver.findElement(By.id("completep_id")).click();
		Thread.sleep(2000);

//						driver.findElement(By.xpath("//*[@id=\"Home_id\"]")).click();
//						Thread.sleep(2000);
//						

		//
//						driver.findElement(By.xpath("//div[@id='cart-mytasks']//div[@class='tile-view']")).click();
//						Thread.sleep(2000);
//						
//						
//						driver.findElement(By.xpath("//span[@class='fa fa-caret-down']")).click();
//						Thread.sleep(2000);
//						
//						driver.findElement(By.xpath("//div[@id='drpTask']//div[1]//div[1]")).click();
//						Thread.sleep(2000);
//						
//						driver.findElement(By.xpath("//button[normalize-space()='Fetch task']")).click();
//						Thread.sleep(5000);
//						

		// JavascriptExecutor jse=(JavascriptExecutor) driver;
		// jse.executeScript("window.scrollBy(0,200)");

		driver.findElement(By.xpath("//tbody/tr[1]/td[1]/div[1]/label[1]/div[1]/span[1]/i[1]")).click();
		Thread.sleep(5000);

		jse.executeScript("window.scrollBy(0,200)");
		driver.findElement(By.id("completep_id")).click();
		Thread.sleep(2000);

	}

	@Given("Assignee will login for task check")
	public void Assignee_will_login_for_task_check() throws InterruptedException {

		// driver.switchTo().newWindow(WindowType.TAB);
		Thread.sleep(2000);
		driver.get("https://staging.aiqod.com:843/");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		// LOGIN
		driver.findElement(By.id("userId")).sendKeys("7875478148");
		driver.findElement(By.id("password")).sendKeys("Surbhi@123");
		driver.findElement(By.id("signIn")).click();
		Thread.sleep(2000);

	}

	@When("Assignee will approve the task")
	public void Assignee_will_approve_the_task() throws InterruptedException {

		JavascriptExecutor jse1 = (JavascriptExecutor) driver;
		jse1.executeScript("window.scrollBy(0,200)");
		Thread.sleep(5000);

		// MY_TASK
		driver.findElement(By.xpath("//div[@id='cart-mytasks']//div[@class='tile-view']")).click();
		Thread.sleep(5000);

		// JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse1.executeScript("window.scrollBy(0,100)");
		Thread.sleep(5000);

		driver.findElement(By.xpath(
				"//body[1]/app-root[1]/ui-view[1]/app-root[1]/ui-view[1]/app-web-main-layout[1]/ui-view[1]/app-process-container[1]/ui-view[1]/app-new-task-list[1]/div[2]/div[2]/tabset[1]/div[1]/tab[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/table[1]/thead[1]/tr[2]/td[5]/div[1]/input[1]"))
				.sendKeys("Atul Bankar");
		Thread.sleep(2000);

		driver.findElement(By.xpath(
				"//body[1]/app-root[1]/ui-view[1]/app-root[1]/ui-view[1]/app-web-main-layout[1]/ui-view[1]/app-process-container[1]/ui-view[1]/app-new-task-list[1]/div[2]/div[2]/tabset[1]/div[1]/tab[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/label[1]/div[1]/span[1]/i[1]"))
				.click();
		Thread.sleep(5000);

		jse1.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id='IsApproved']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[normalize-space()='Complete']")).click();
		Thread.sleep(4000);

	}

	@And("Assignee will reject the task")
	public void Assignee_will_reject_the_task() throws InterruptedException {
		JavascriptExecutor jse11 = (JavascriptExecutor) driver;
		jse11.executeScript("window.scrollBy(0,200)");
		Thread.sleep(5000);

		// MY_TASK
//								driver.findElement(By.xpath("//div[@id='cart-mytasks']//app-tile//div[@class='tile-view']//div//a[@class='align-center default tile tile-padding']")).click();
//								Thread.sleep(5000);
//								

//								jse11.executeScript("window.scrollBy(0,200)");
//								Thread.sleep(2000);

		driver.findElement(By.xpath(
				"//body[1]/app-root[1]/ui-view[1]/app-root[1]/ui-view[1]/app-web-main-layout[1]/ui-view[1]/app-process-container[1]/ui-view[1]/app-new-task-list[1]/div[2]/div[2]/tabset[1]/div[1]/tab[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/table[1]/thead[1]/tr[2]/td[5]/div[1]/input[1]"))
				.sendKeys("Atul Bankar");
		Thread.sleep(2000);

		driver.findElement(By.xpath(
				"//body[1]/app-root[1]/ui-view[1]/app-root[1]/ui-view[1]/app-web-main-layout[1]/ui-view[1]/app-process-container[1]/ui-view[1]/app-new-task-list[1]/div[2]/div[2]/tabset[1]/div[1]/tab[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/label[1]/div[1]/span[1]/i[1]"))
				.click();
		Thread.sleep(2000);

		jse11.executeScript("window.scrollBy(0,300)");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//textarea[@placeholder='Add Reason']")).sendKeys("This task is rejected");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[normalize-space()='Complete']")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("Home_id")).click();
		Thread.sleep(2000);
	}

	// Report_download
	@Given("download reports")
	public void download_reports() throws InterruptedException {
		// Report_Test_merging
//						driver.switchTo().newWindow(WindowType.TAB);
//					     Thread.sleep(2000);
		driver.get("https://staging.aiqod.com:843//");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//
//					   //ASSIGNEE_LOGIN
		driver.findElement(By.id("userId")).sendKeys("7875478148");
		driver.findElement(By.id("password")).sendKeys("Surbhi@123");
		driver.findElement(By.id("signIn")).click();
		Thread.sleep(2000);

		// JavascriptExecutor jse=(JavascriptExecutor) driver;
		// jse.executeScript("window.scrollBy(0,300)");

		driver.findElement(By.xpath(
				"/html/body/app-root/ui-view/app-root/ui-view/app-web-main-layout/ui-view/app-taxpayer-dashboard/div/div/div[2]/div[1]/div/div[1]/ul/li[2]"))
				.click();
		Thread.sleep(2000);

		driver.findElement(By.xpath(
				"/html/body/app-root/ui-view/app-root/ui-view/app-web-main-layout/ui-view/app-taxpayer-dashboard/div/div/div[2]/div[1]/div/div[1]/ul/li[2]/div/a/i"))
				.click();
		Thread.sleep(2000);

		driver.findElement(By.xpath(
				"/html/body/app-root/ui-view/app-root/ui-view/app-web-main-layout/ui-view/app-taxpayer-dashboard/div/div/div[2]/div[1]/div/div[1]/ul/li[2]/div/a/i"))
				.click();
		Thread.sleep(2000);

		driver.findElement(By.xpath(
				"/html/body/app-root/ui-view/app-root/ui-view/app-web-main-layout/ui-view/app-taxpayer-dashboard/div/div/div[2]/div[1]/div/div[2]/div/app-reports-dashboard/div/div[1]/div/div[1]/div/app-counter-tile/div/div"))
				.click();
		Thread.sleep(2000);

		driver.findElement(By.xpath(
				"/html/body/app-root/ui-view/app-root/ui-view/app-web-main-layout/ui-view/app-taxpayer-dashboard/div/div/div[2]/div[1]/div/div[2]/div/app-reports-dashboard/div/div[1]/div/div[1]/div/app-counter-tile/div[2]/div/div/div/div[1]/h4/a/i"))
				.click();
		Thread.sleep(2000);

		driver.findElement(By.xpath(
				"/html/body/app-root/ui-view/app-root/ui-view/app-web-main-layout/ui-view/app-taxpayer-dashboard/div/div/div[2]/div[1]/div/div[2]/div/app-reports-dashboard/div/div[1]/div/div[1]/div/app-counter-tile/div[2]/div/div/div/div[2]/div/table-chart/div/table/tbody/tr[1]/th[4]/button"))
				.click();
		Thread.sleep(2000);

		driver.findElement(By.xpath(
				"/html/body/app-root/ui-view/app-root/ui-view/app-web-main-layout/ui-view/app-taxpayer-dashboard/div/div/div[2]/div[1]/div/div[2]/div/app-reports-dashboard/div/div[1]/div/div[1]/div/app-counter-tile/div[2]/div/div/div/div[1]/button"))
				.click();
		Thread.sleep(2000);

	}

}
