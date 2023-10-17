package pages;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Linkpages extends Page {
	public Linkpages(WebDriver dr) {
		super(dr);

	}

	public By linkHome = By.id("simpleLink");
	public By dynamicLink = By.id("dynamicLink");
	public By linkCreated = By.id("created");

	public void clickLink(By locator) {
		String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL, Keys.RETURN);
		driver.findElement(locator).sendKeys(selectLinkOpeninNewTab);
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		driver.close();
		driver.switchTo().window(tabs.get(0));
	}

	public void clickDynamicLink() {
		String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL, Keys.RETURN);
		driver.findElement(dynamicLink).sendKeys(selectLinkOpeninNewTab);
	}
	public void inputTextLinks(String text) {
		String rdXpath = "//*[text()='" + text + "']";
		By rdElement = By.xpath(rdXpath);
		driver.findElement(rdElement).click();
	}

}
