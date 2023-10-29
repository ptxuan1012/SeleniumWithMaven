package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelectMenuPage extends Page {
	public SelectMenuPage(WebDriver dr) {
		super(dr);
	}

	public By txtSelectValue = By.id("withOptGroup");
	public By menuSubM2 = By.xpath("//a[text()='SUB SUB LIST »']");
	public By menuSubofSubM2 = By.xpath("//a[text()='Sub Sub Item 2']");

}
