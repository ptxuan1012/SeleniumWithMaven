package pages;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class NewWindowPage extends Page{
	public NewWindowPage(WebDriver dr) {
		super(dr);
		// TODO Auto-generated constructor stub
	}
	public By textNewWindow =By.id("sampleHeading");
	public BrowserWindowPage swithBroweCurren() {
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		driver.close();
		driver.switchTo().window(tabs.get(0));
		return new BrowserWindowPage(driver);
	}
}