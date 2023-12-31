package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WidgetPage extends Page{
	public WidgetPage(WebDriver dr) {
		super(dr);
	}
	By menuAccordian =By.xpath("//span[text()='Accordian']");
	public By menuComplete =By.xpath("//span[text()='Auto Complete']");
	public By menuDatePicker =By.xpath("//span[text()='Date Picker']");
	public By menuSlider =By.xpath("//span[text()='Slider']");
	public By menuProgress =By.xpath("//span[text()='Progress Bar']");
	public By menuTabs =By.xpath("//span[text()='Tabs']");
	public By menuToolTips =By.xpath("//span[text()='Tool Tips']");
	public By menuMenu =By.xpath("//span[text()='Menu']");
	public By menuSelectMenu =By.xpath("//span[text()='Select Menu']");

	public SelectMenuPage clickSelectMenuPage() {
		driver.findElement(menuSelectMenu).click();
		return new SelectMenuPage(driver);
	}
	
	public MenuPage clickMenuPage(By locator) {
		driver.findElement(locator).click();
		return new MenuPage(driver);
	}
	
	public ProgressTabTooltipPage clickProgess(By locator) {
		driver.findElement(locator).click();
		return new ProgressTabTooltipPage(driver);
	}
	
	public AccordianPages clickAccordian() {
		driver.findElement(menuAccordian).click();
		return new AccordianPages(driver);
	}
	
	public AutoCompleteAndDatePickerPage clickCompleteanDate(By loctor) {
		driver.findElement(loctor).click();
		return new AutoCompleteAndDatePickerPage(driver);
	}
	public SliderPage clickSliderPage(By loctor) {
		driver.findElement(loctor).click();
		return new SliderPage(driver);
	}
}
