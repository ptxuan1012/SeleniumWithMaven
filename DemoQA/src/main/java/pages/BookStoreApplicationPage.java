package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BookStoreApplicationPage extends Page{
	public BookStoreApplicationPage(WebDriver dr) {
		super(dr);
		}
	public By menuLogin =By.xpath("//span[text()='Login']");
	public By menuBookstore =By.xpath("//span[text()='Book Store']");
	
	
	public LoginPage clickMenuLogin() {
		driver.findElement(menuLogin).click();
		return new LoginPage(driver);
	}
	public BookStoryPage clickMenuBookStory() {
		driver.findElement(menuBookstore).click();
		return new BookStoryPage(driver);
	}

}
