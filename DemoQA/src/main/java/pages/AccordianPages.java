package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccordianPages extends Page{
	public AccordianPages(WebDriver dr) {
		super(dr);
	}
	public By accorFirst=By.xpath("//div[@class='card'][1]/div[2]");
	public By accorSecond=By.xpath("//div[@class='card'][2]/div[2]");
	public By accorSecond2 = By.id("section2Heading");
	public By accorThree=By.xpath("//div[@class='card'][3]/div[2]");
	public By accorThree2 = By.id("section3Heading");
	public By textFirst = By.xpath("//p[contains(text(),'text of the printing and typesetting industry')]");
	
	public Boolean isCollapseShow(By locator) {
		boolean result = true;
		String cssClassValue = driver.findElement(locator).getAttribute("class");
		if (!cssClassValue.contains("show")) {
			result = false;
		}
		return result;
	}
}
