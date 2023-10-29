package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class InteractionsPage extends Page{
	public InteractionsPage(WebDriver dr) {
		super(dr);
	}
	By menuInteraction = By.xpath("//span[text()='Sortable']");
	By menuSelectAble = By.xpath("//span[text()='Selectable']");
	By menuResizable = By.xpath("//span[text()='Resizable']");
	
	public SelectablePage clickSelectable() {
		driver.findElement(menuSelectAble).click();
		return new SelectablePage(driver);
	}
	public SortablePage clickSortable() {
		driver.findElement(menuInteraction).click();
		return new SortablePage(driver);
	}
	public ReziseablePage clickReziseable() {
		driver.findElement(menuResizable).click();
		return new ReziseablePage(driver);
	}
}
