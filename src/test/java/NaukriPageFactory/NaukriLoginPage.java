package NaukriPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NaukriLoginPage {
	@FindBy(xpath = "//*[@id='usernameField']")
	WebElement nau_username;
	@FindBy(xpath = "//*[@id='passwordField']")
	WebElement nau_password;
	@FindBy(xpath = "//*[@id='loginForm']/div[2]/div[3]/div/button[1]")
	WebElement nau_loginbtn;
	WebDriver d;

	public NaukriLoginPage(WebDriver driver) {
		this.d = driver;
		PageFactory.initElements(d, this);
	}

	public void naukriUserName(String username) {
		nau_username.sendKeys(username);

	}

	public void naukriPassword(String password) {
		nau_password.sendKeys(password);
	}

	public void naukriLoginButton() {
		nau_loginbtn.click();

	}

}
