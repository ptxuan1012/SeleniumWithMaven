package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ReziseablePage extends Page {
	public ReziseablePage(WebDriver dr) {
		super(dr);
	}
	
	public By resizeable1 = By.xpath("id('resizableBoxWithRestriction')/span");
	public By resizeable2 = By.xpath("id('resizable')/span");
	public By findRese = By.id("resizableBoxWithRestriction");
	public By findRese2 = By.id("resizable");
	
}
