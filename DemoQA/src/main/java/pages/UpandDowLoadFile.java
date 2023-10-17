package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UpandDowLoadFile extends Page{
	public UpandDowLoadFile(WebDriver dr) {
		super(dr);
	}
public By btnDow = By.id("downloadButton");
public By btnUpfile = By.id("uploadFile");
public By textResultUpdate =By.xpath("//p[text()='C:\\fakepath\\Xuan.jpg']");
public String getAtriBute(By locator, String senkey) {
	String result="";
	WebElement element =driver.findElement(locator);
	result= element.getAttribute(senkey);
	return result;
}
}
