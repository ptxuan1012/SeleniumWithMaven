package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FormResultPage extends Page {

	public FormResultPage(WebDriver dr) {
		super(dr);
		// TODO Auto-generated constructor stub
	}

	By typeForm = By.xpath("//*[text()='Thanks for submitting the form']");

	public String isDiplay() {
		String value = "";
		value = driver.findElement(typeForm).getText();
		return value;
	}

	String valueXpath = "//*[text()='{@param}']/following-sibling::td";

//cách 1
	public String getValueByLabel(String label) {
		String value = "";
		String newValueXpath = valueXpath.replace("@param", label);
		value = driver.findElement(By.xpath(newValueXpath)).getText();
		return value;
	}
//cách 2
	public String getValuebylabel1(String label) {
		String value = "";
		String xpath = "//*[text()='" + label + "']/following-sibling::td";
		value = driver.findElement(By.xpath(xpath)).getText();
		return value;

	}
}
