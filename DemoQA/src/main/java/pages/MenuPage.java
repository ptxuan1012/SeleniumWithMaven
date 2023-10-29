package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MenuPage extends Page{
	public MenuPage(WebDriver dr) {
		super(dr);
	}
	public By menuM2 =By.xpath("//a[text()='Main Item 2']");
	public By menuSubM2 =By.xpath("//a[text()='SUB SUB LIST »']");
	public By menuSubofSubM2 =By.xpath("//a[text()='Sub Sub Item 2']");

}
