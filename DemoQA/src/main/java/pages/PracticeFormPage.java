package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;

public class PracticeFormPage extends Page {
	public By tbFistName = By.id("firstName");
	public By tbLastName = By.id("lastName");
	public By tbUserEmail = By.id("userEmail");	
	public By tbuserNumber = By.id("userNumber");		
	public By txbSubjects = By.id("subjectsInput");	
	public By uploadFilexpath =By.id("uploadPicture");
	public By txtMulti =By.id("currentAddress");	
	public By mnState = By.xpath("//input[@id='react-select-3-input']");
	public By mnCity = By.xpath("//input[@id='react-select-4-input']");
	By btnSubmit =By.id("submit");
	By txtDOB = By.id("dateOfBirthInput");
	
	String selectYear = "//option[text()='@params']";
	String selectMonth = "//option[text()='@params']";
	String selectDays = "//div[text()='@params']";
	By txtUploadPicture = By.id("uploadPicture");
	
	public void inputUploadPicture() {
		driver.findElement(txtUploadPicture)
				.sendKeys(System.getProperty("user.dir") + "/src\\main\\resources\\Image\\Xuan.jpg");
	}
	
	 public void intBOD(String year, String month, String day) {
		 driver.findElement(txtDOB).click();
		 selectYear(year);
		 selectMonth(month);
		 selectDays(day);
	 }
	
	public void selectYear(String year) {
		String xpathYear = selectYear.replace("@params", year);
		driver.findElement(By.xpath(xpathYear)).click();
	}
	
	public void selectMonth(String month) {
		String xpathMonth = selectMonth.replace("@params", month);
		driver.findElement(By.xpath(xpathMonth)).click();
	}
	
	public void selectDays(String day) {
		String xpathDay = selectDays.replace("@params", day);
		List<WebElement> dayElements = driver.findElements(By.xpath(xpathDay));		
		dayElements.get(0).click();
		}
	
	public FormResultPage clickSubmitButton() {
		driver.findElement(btnSubmit).submit();
		return new FormResultPage(driver);
	}
	public void inputDOB() {
		driver.findElement(txtDOB).click();
	}
	public PracticeFormPage(WebDriver dr) {
		super(dr);
	}	

}
