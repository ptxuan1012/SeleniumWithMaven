package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccordianPages extends Page{
	public AccordianPages(WebDriver dr) {
		super(dr);
	}
	public By accorFirst=By.id("section1Heading");
	public By accorSecond=By.id("section2Heading");
	public By accorThree=By.id("section3Heading");
	public By textFirst = By.id("section1Content");
	
	public Boolean isCollapseShow(By locator) {
		boolean result = true;
		String cssClassValue = driver.findElement(locator).getAttribute("class");
		if (!cssClassValue.contains("collapse show")) {
			result = false;
		}
		return result;
	}
}
