package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import tests.TestCase;

public class RegistrationFormPage extends Page{
	public RegistrationFormPage(WebDriver dr) {
		super(dr);
		// TODO Auto-generated constructor stub
	}
	By tilteForm = By.xpath("//*[text()='Registration Form']");
	public By txtFirsNameResPage= By.id("firstName");
	public By txtLastNameResPage= By.id("lastName");
	public By txtUserEmailResPage= By.id("userEmail");
	public By txtAgeResPage= By.id("age");
	public By txtSalaryResPage= By.id("salary");
	public By txtDepartmentResPage= By.id("department");
	By btnSummitResPage= By.id("submit");
	public WebTable clickSubmitButton() {
		driver.findElement(btnSummitResPage).submit();
		return new WebTable(driver);
	}
	
	

	public String isDiplay() {
		String value = "";
		value = driver.findElement(tilteForm).getText();
		return value;
	}

}
