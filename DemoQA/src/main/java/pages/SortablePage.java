package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class SortablePage extends Page{
	public SortablePage(WebDriver dr) {
		super(dr);
	}
	public By tabGirt = By.id("demo-tab-grid");

	
	public List<WebElement> elementsList  = driver.findElements(By.xpath("//*[@id='demo-tabpane-list']/div/div"));	
	public List<WebElement> elementsGirt  = driver.findElements(By.xpath("//*[@id='demo-tabpane-grid']/div/div"));
	public WebElement findLocator(String value) {
		String rdXpath = "//*[@class='create-grid']/div[text()='" + value + "']";
		By rdElement = By.xpath(rdXpath);
		WebElement element =driver.findElement(rdElement);
		return element;
	}
}
