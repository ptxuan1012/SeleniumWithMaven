package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AlertPage extends Page {
	public AlertPage(WebDriver dr) {
		super(dr);
	}

	public By btnSeeAlert = By.id("alertButton");
	public By btnimerAlert = By.id("timerAlertButton");
	public By btnconfirmButton = By.id("confirmButton");
	public By btnProBtn = By.id("promtButton");
	public By txtConfirm =By.id("confirmResult");
	public By txtPro =By.id("promptResult");
		
	public String getTextAlert(By locator) {
		String result = "";
		List<WebElement> txtElement = driver.findElements(locator);
		for (WebElement e : txtElement) {
			result = result + e.getText() + " ";
		}
		return result.trim(); // clear space start & end
	}

}
