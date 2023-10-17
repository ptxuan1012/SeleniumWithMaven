package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import common.TestBasic;

public class Page {
	public WebDriver driver;
	public TestBasic testBasic =new TestBasic();
	
	public Page(WebDriver dr) {
		testBasic.driver = dr;
		driver=testBasic.driver;
	}	
	public void scrollToEndPage() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
		
	}

	public WebElement findElementByLocator(By locator) {
		return driver.findElement(locator);
	}

}
