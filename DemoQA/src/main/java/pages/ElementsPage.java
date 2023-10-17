package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementsPage extends Page {
	
	public ElementsPage(WebDriver dr) {
		super(dr);	}
	By menuTextBox = By.xpath("//span[text()='Text Box']");
	By menuCheckBox = By.xpath("//span[text()='Check Box']");
	By menuWebTable =By.xpath("//span[text()='Web Tables']");
	By menuButton =By.xpath("//span[text()='Buttons']");
	By menuRadioButton =By.xpath("//span[text()='Radio Button']");
	By menuLink =By.xpath("//span[text()='Links']");
	public By menuUpandDow = By.xpath("//span[text()='Upload and Download']");
	public By menuForm = By.xpath("//div[text()='Forms']");
	

	public Linkpages clickLinkMenu() {
		driver.findElement(menuLink).click();
		return new Linkpages(driver);
	}
	
	public TextboxPage clickTextBoxMenu() {
		driver.findElement(menuTextBox).click();
		return new TextboxPage(driver);
	}
	
	public CheckBoxPage clickCheckBoxMenu () {
		driver.findElement(menuCheckBox).click();
		return new CheckBoxPage(driver);
	}
	public WebTable clickCheckWebTable () {
		driver.findElement(menuWebTable).click();
		return new WebTable(driver);
	}
	public ButtonPage clickButtonPage () {
		driver.findElement(menuButton).click();
		return new ButtonPage(driver);
	}
	public RadioButtonPage clickMenuRadioBTN() {
			driver.findElement(menuRadioButton).click();		
		return new RadioButtonPage(driver);
	}
	public UpandDowLoadFile clickMenuUpandDow() {
		WebElement element =driver.findElement(menuUpandDow);
		element.click();		
	return new UpandDowLoadFile(driver);
}
	public void scrollToElement(By locator) {
		WebElement element =driver.findElement(locator);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
	}
	}
