package pages;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProfilePage extends Page{
	public ProfilePage(WebDriver dr) {
		super(dr);
	}
	public By textFormProfile =By.xpath("//div[contains(@class,'main-header')]");
	public By userName =By.id("userName-value");
	public By searchBox =By.id("userName-label");
	
	public String isDiplay() {
		String value = "";
		value = driver.findElement(textFormProfile).getText();
		return value;
	}

}
