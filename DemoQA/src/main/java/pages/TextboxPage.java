package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;

public class TextboxPage extends Page {

	public TextboxPage(WebDriver dr) {
		super(dr);
	}

	public By txtFullName = By.id("userName");
	public By txtEmail = By.id("userEmail");
	public By txtCurrentAddress = By.id("currentAddress");
	public By txtPermanentAddress = By.id("permanentAddress");
	public By btnSubmit = By.id("submit");
	public By lbFullName = By.id("name");
	public By lbEmail = By.id("email");
	public By lbCurrentAddress = By.xpath("//p[@id='currentAddress']"); // Do currentAddress trùng với ở trên
	public By lbPermanentAddress = By.xpath("//p[@id='permanentAddress']");
	public By resultEmail = By.xpath("//form[@id ='userForm']/div[2]/div[2]/*[name()='input']");

	public void inputFullName(String fullName) {
		driver.findElement(txtFullName).sendKeys(fullName);
	}

	public void inputEmail(String email) {
		driver.findElement(txtEmail).sendKeys(email);
	}

	public void inputCurrentAddress(String currentAddress) {
		driver.findElement(txtCurrentAddress).sendKeys(currentAddress);
	}

	public void inputPermanentAddress(String permanentAddress) {
		driver.findElement(txtPermanentAddress).sendKeys(permanentAddress);
	}

	public void clickOnSubmit() {
		driver.findElement(btnSubmit).click();
	}

	public String getTextResult(By elements) {
		String result = "";
		String text = driver.findElement(elements).getText();
		result = text.substring(text.indexOf(":") + 1);
		return result;
	}

	public Boolean isCheckEmail(By locator) {
		boolean result = true;
		String cssClassValue = driver.findElement(locator).getAttribute("class");
		if (!cssClassValue.contains("field-error")) {
			result = false;
		}
		return result;
	}

	public void inputData() {
		WebElement fullName = driver.findElement(By.id("userName"));
		fullName.clear();
		fullName.sendKeys("Khong Nga");
		WebElement email = driver.findElement(By.id("userEmail"));
		email.clear();
		email.sendKeys("khongnga@gmail.com");
		WebElement currentAddress = driver.findElement(By.id("currentAddress"));
		currentAddress.clear();
		currentAddress.sendKeys("Hà Nội");
		WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
		permanentAddress.clear();
		permanentAddress.sendKeys("HCM");
	}

//	public TextboxPage(WebDriver dr) {
//		driver = dr;
//	}
}
