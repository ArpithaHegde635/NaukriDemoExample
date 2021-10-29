package NaukriStepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import NaukriPageFactory.NaukriLoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NaukriWebsite {
	WebDriver driver = null;
	NaukriLoginPage l;

	@Given("Browser is open")
	public void browser_is_open() {
		System.setProperty("webdriver.chrome.driver",
				"C:/workspace/NaukriDemoExample/src/test/resources/chromedriver.exe");
		driver = new ChromeDriver();
	}

	@When("Enter the url of naukri")
	public void enter_the_url_of_naukri() throws InterruptedException {
		driver.navigate().to("https://www.naukri.com/nlogin/login");
		Thread.sleep(2000);
	}

	@Then("Login page of naukri website is opened")
	public void login_page_of_naukri_website_is_opened() {
		if (driver.getPageSource().contains("New to Naukri?")) {
			System.out.println("Text is present in login page");
		} else {
			System.out.println("Text is not present in login page");
		}
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username, String password) throws InterruptedException {
		l = new NaukriLoginPage(driver);
		l.naukriUserName(username);
		l.naukriPassword(password);
		Thread.sleep(2000);
	}

	@And("user clicks on login button")
	public void user_clicks_on_login_button() {
		l.naukriLoginButton();
	}

	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() {
		if (driver.getPageSource().contains("Search Jobs")) {
			System.out.println("Text is present in home page");
		} else {
			System.out.println("Text is not present in home page");
		}
	}

}
