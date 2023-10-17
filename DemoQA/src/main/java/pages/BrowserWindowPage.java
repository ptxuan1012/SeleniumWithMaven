package pages;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BrowserWindowPage extends Page{
	public BrowserWindowPage(WebDriver dr) {
		super(dr);
		// TODO Auto-generated constructor stub
	}
	By btnNewTab = By.id("tabButton");
	By btnNewWinDow = By.id("windowButton");
	By btnMessWindow = By.id("messageWindowButton");
	public NewWindowMessagePage clickMessWinDow() {
		String currenWindow =driver.getWindowHandle();
		testBasic.click(btnMessWindow);
		Set<String> windows = driver.getWindowHandles();
		for (String s : windows) {
			System.out.println("s la:" + s);
			if(!s.equals(currenWindow)){
				driver.switchTo().window(s);
			}
			
		}
		return new NewWindowMessagePage(driver);
	}
	

public NewTabPage clickNewTablePage() {
	String currenWindow =driver.getWindowHandle();
	testBasic.click(btnNewTab);
	Set<String> windows = driver.getWindowHandles();
	for (String s : windows) {
		System.out.println("s la:" + s);
		if(!s.equals(currenWindow)){
			driver.switchTo().window(s);
		}
		
	}
	return new NewTabPage(driver);
}

public NewWindowPage clickNewWindowPage() {
	String currenWindow =driver.getWindowHandle();
	testBasic.click(btnNewWinDow);
	Set<String> windows = driver.getWindowHandles();
	for (String s : windows) {
		System.out.println("s la:" + s);
		if(!s.equals(currenWindow)){
			driver.switchTo().window(s);
		}
		
	}
	return new NewWindowPage(driver);
}

//public NewWindowMessagePage clickNewWindowMessagePagePage() {
//	testBasic.click(btnNewWindowMess);
//	return new NewWindowMessagePage(driver);
//}
}
