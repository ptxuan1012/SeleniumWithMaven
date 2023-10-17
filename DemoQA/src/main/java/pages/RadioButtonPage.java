package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonPage extends Page {
	public RadioButtonPage(WebDriver dr) {
		super(dr);
	}

	public By titleRadioBTN = By.xpath("//div[text()='Do you like the site?']");
	public By titleResultRDO = By.xpath("//p[@class='mt-3']");

	public String isDiplay(By locator) {
		String value = "";
		value = driver.findElement(locator).getText();
		return value;
	}

//	public boolean clickDisplayRDO(String rdoValue) {
//		boolean result = false;
//		String value = "//*[text()='" + rdoValue + "']";
//		WebElement finElenmentRDO = driver.findElement(By.xpath(value));
//		if (finElenmentRDO.isSelected() == true) {
//			finElenmentRDO.click();
//			result = true;
//		} else {
//			System.out.println("Disable");
//			result = true;
//		}
//		return result;
//	}

//	public String clickRadioButtonByLabel(String radioLabel) {
//		String rdXpath = "//*[text()='" + radioLabel + "']";
//		WebElement finElenmentRDO = driver.findElement(By.xpath(rdXpath));
//		if (finElenmentRDO.isSelected() == true) {
//			finElenmentRDO.click();
//		}
//	}
}
