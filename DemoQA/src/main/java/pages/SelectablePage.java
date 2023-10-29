package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelectablePage extends Page{
	public SelectablePage(WebDriver dr) {
		super(dr);
	}
	public By tabGirt = By.id("demo-tab-grid");
	public List<WebElement> elementsList  = driver.findElements(By.xpath("//*[@id='verticalListContainer']/li"));
	public WebElement findLocator(String value) {
		String rdXpath = "//*[@id='gridContainer']/div/li[text()='"+value+"']";
		By rdElement = By.xpath(rdXpath);
		WebElement element =driver.findElement(rdElement);
		return element;
	}

}
