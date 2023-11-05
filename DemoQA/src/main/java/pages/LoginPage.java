package pages;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends Page {
	public LoginPage(WebDriver dr) {
		super(dr);
	}
	public By txtuserName = By.id("userName");
	public By txtPass = By.id("password");
	public By btnLogin = By.id("login");
	
	public ProfilePage clickProfilePage() {
		String currenWindow =driver.getWindowHandle();
		testBasic.click(btnLogin);
		Set<String> windows = driver.getWindowHandles();
		for (String s : windows) {
			System.out.println("s la:" + s);
			if(!s.equals(currenWindow)){
				driver.switchTo().window(s);
			}
			
		}
		return new ProfilePage(driver);
	}
}
