package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertFramwWindowPages extends Page{
	public AlertFramwWindowPages(WebDriver dr ) {
		super(dr);
		// TODO Auto-generated constructor stub
	}
	By menuBrowserWin= By.xpath("//span[text()='Browser Windows']");
	By menuAlert = By.xpath("//span[text()='Alerts']");
	By menuFrame= By.xpath("//span[text()='Frames']");
	By menuFrameNested= By.xpath("//span[text()='Nested Frames']");
	By menuModalDialogs= By.xpath("//span[text()='Modal Dialogs']");
	public ModalDialogPage clickModalDialog() {
		driver.findElement(menuModalDialogs).click();
		return new ModalDialogPage(driver);
	}
	
	public BrowserWindowPage clickBrowserWinPage() {
		driver.findElement(menuBrowserWin).click();
		return new BrowserWindowPage(driver);
	}

	public AlertPage clickAlertMenu() {
		driver.findElement(menuAlert).click();
		return new AlertPage(driver);
	}
	public FramePage clickFrameMenu() {
		driver.findElement(menuFrame).click();
		return new FramePage(driver);
	}
	public FrameNestedPage clickFrameNestedMenu() {
		driver.findElement(menuFrameNested).click();
		return new FrameNestedPage(driver);
	}
}
