package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckRadioButtonPage extends Page{
	public By rdbElement =By.xpath("//li[@class='btn btn-light active']/*[name()='svg']");
	public By textTile =By.xpath("//* [contains(text(),'Do you like the site?')]");
	public CheckRadioButtonPage(WebDriver dr) {
		super(dr);
	}
	WebElement isDiplay = driver.findElement(rdbElement);
	public Boolean isDisplay() {
		boolean result = true;
		 driver.findElement(textTile).isDisplayed();
	
		return result;
	}
}
