package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends Page {
	public LoginPage(WebDriver dr) {
		super(dr);
	}
	public By txtuserName = By.id("userName");
	public By txtPass = By.id("password");
	public By btnLogin = By.id("login");
}
