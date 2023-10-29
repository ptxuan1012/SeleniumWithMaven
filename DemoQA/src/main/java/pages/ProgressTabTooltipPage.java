package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProgressTabTooltipPage extends Page{
	public ProgressTabTooltipPage(WebDriver dr) {
		super(dr);
	}
	public By btnStart =By.id("startStopButton");
	public By progressBar =By.xpath("//div[@role='progressbar']");
	public By btnReset = By.xpath("//button[text()='Reset']");
	public By btnStop = By.xpath("//button[text()='Stop']");
	public By btnStart1 = By.xpath("//button[text()='Start']");
	
	public By tab1 = By.id("demo-tab-what");
	public By tab2 = By.id("demo-tab-origin");
	public By tab3 = By.id("demo-tab-use");
	public By textTab1 = By.id("demo-tabpane-what");
	public By textTab2 = By.id("demo-tabpane-origin");
	public By textTab3 = By.id("demo-tabpane-use");
	
	public By btnToolTip = By.id("toolTipButton");
	public By hvToolTip = By.xpath("//div[@id='buttonToolTip']//following::div");
	
	
	public void clickStartandStopandRest(String radioLabel) {
		String rdXpath = "//button[text()='" + radioLabel + "']";
		By rdElement = By.xpath(rdXpath);
		driver.findElement(rdElement).click();
		}
}
