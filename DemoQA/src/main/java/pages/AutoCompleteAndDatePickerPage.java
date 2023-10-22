package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AutoCompleteAndDatePickerPage extends Page{
	public AutoCompleteAndDatePickerPage(WebDriver dr) {
		super(dr);
		// TODO Auto-generated constructor stub
	}
	public By txtMulti= By.id("autoCompleteMultipleInput");
	public By txtSing= By.id("autoCompleteSingleInput");
    By txtDatePicker = By.id("datePickerMonthYearInput");
    public By txtDateandTime = By.id("dateAndTimePickerInput");
    
	String selectYear = "//option[text()='@params']";
	String selectMonth = "//option[text()='@params']";
	String selectDays = "//div[text()='@params']";
	
	String selectYearDOT ="//div[text()='2020']";
	String selectMonthDOT ="";
	String selectDaysDOT ="";
	String selectTime="//li[text()='@params']";
	
 
	 public void ClickDOT(String value) {
			String rdXpath = "//span[text()='" + value + "']";
			By rdElement = By.xpath(rdXpath);
			driver.findElement(rdElement).click();

		}
	 public void selectTime(String time) {
			String xpathtime = selectTime.replace("@params", time);
			WebElement element = driver.findElement(By.xpath(xpathtime));
//			JavascriptExecutor js = (JavascriptExecutor) driver;
//			js.executeScript("arguments[0].scrollIntoView(true)", element);
			element.click();
		}
	//---------------------------------------------------------------------
	 public void intBOD(String year, String month, String day) {
		 driver.findElement(txtDatePicker).click();
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

}
