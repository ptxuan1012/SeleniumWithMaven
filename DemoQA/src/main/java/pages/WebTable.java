package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebTable extends Page{
	public WebTable(WebDriver dr) {
		super(dr);
	}
	public By firstName = By.xpath("//div[@role='grid']/div[2]//div[@role='row']/div[1]");
	 By txtSearchBox = By.id("searchBox");
	 By btnAdd =By.id("addNewRecordButton");
	public boolean isCheckSearchResult(By locator, String searchKey) {
		boolean result =false; 
		driver.findElement(txtSearchBox).sendKeys(searchKey);
		List<WebElement> resultElement = driver.findElements(locator);
		for(WebElement e: resultElement) {
			String text =e.getText();
			if(text.contains(searchKey)) {
				return true;
			}else 
			{ return false;}
		}
		return result;
	}
	public RegistrationFormPage clickButton() {
		driver.findElement(btnAdd).click();
		return new RegistrationFormPage(driver);
	}
}
