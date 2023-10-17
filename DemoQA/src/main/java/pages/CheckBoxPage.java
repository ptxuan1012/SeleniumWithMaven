package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckBoxPage extends Page {

	public By cbHomeCheckBox = By.xpath("//label[@for='tree-node-home']/span[1]/*[name()='svg']");
	public By lbHomes = By.xpath("//div[@id='result']/span");
	public By btnIconExpand = By.xpath("//button[@class='rct-collapse rct-collapse-btn']");
	public By listCB = By.xpath("//li[@class='rct-node rct-node-parent rct-node-collapsed']/span/label/span[1]/*[name()='svg']");
	public By listItemCB = By.xpath("//li[@class='rct-node rct-node-parent rct-node-collapsed']/span/label/span[3]");

	
	public CheckBoxPage(WebDriver dr) {
		super(dr);
	}

	public Boolean isCheckBoxUnchecked(By locator) {
		boolean result = true;
		String cssClassValue = driver.findElement(locator).getAttribute("class");
		if (!cssClassValue.contains("uncheck")) {
			result = false;
		}
		return result;
	}

	public void clickOnHomeCheckBox() {
		driver.findElement(cbHomeCheckBox).click();
	}

	public String getHomeStr() {
		String result = "";
		List<WebElement> lbHomeElements = driver.findElements(lbHomes);
		for (WebElement e : lbHomeElements) {
			result = result + e.getText() + " "; // Nối các result lại
		}
		return result.trim(); // Cắt space ở 2 đầu
	}

	public void clickOnIconExpand() {
		driver.findElement(btnIconExpand).click();
	}

	public String displayListCB() {
		String result = "";
		List<WebElement> listItemcb = driver.findElements(listItemCB);
		for (WebElement e : listItemcb) {
			result = result +e.getText() + " ";
			}
		return result.trim();
	}
	public boolean isCheckAll() {
		boolean result = true;
		List<WebElement> listCB1 = driver.findElements(listCB);
		for (WebElement e : listCB1) {
				
			
		}
		return result;
	}
}
