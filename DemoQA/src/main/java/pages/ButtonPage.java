package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ButtonPage extends Page{
public ButtonPage(WebDriver dr) {
	super(dr);
}
public By btnDoubleClick = By.id("doubleClickBtn");
public By btnRightClick = By.id("rightClickBtn");
public By btnClick = By.xpath("//*[text()='Click Me']");
public By resultDouble = By.id("doubleClickMessage");
public By resultRight = By.id("rightClickMessage");
public By resultClick = By.id("dynamicClickMessage");

public void doubleClick(By locator) {
	Actions actions = new Actions(driver);
	WebElement elementLocator = driver.findElement(locator);
	actions.doubleClick(elementLocator).perform();
}
public void rightClick(By locator) {
	Actions actions = new Actions(driver);
	WebElement elementLocator = driver.findElement(locator);
	actions.contextClick(elementLocator).perform();
}
public void Click(By locator) {
	WebElement elementLocator = driver.findElement(locator);
	elementLocator.click();
}

public String Diplay(By locator) {
	String value = "";
	value = driver.findElement(locator).getText();
	return value;
}
}