package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WidgetPage extends Page{
	public WidgetPage(WebDriver dr) {
		super(dr);
	}
	By menuAccordian =By.xpath("//span[text()='Accordian']");
	public AccordianPages clickAccordian() {
		driver.findElement(menuAccordian).click();
		return new AccordianPages(driver);
	}
}
