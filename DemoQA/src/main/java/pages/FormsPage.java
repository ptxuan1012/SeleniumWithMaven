package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class FormsPage extends Page {
	By menuPracticeForm = By.xpath("//*[text()='Practice Form']");
	
	public PracticeFormPage clickPracticeFormMenu() {
		driver.manage().window().maximize(); 
		//Scroll down to endpage
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
		//Click vào Element Item
		driver.findElement(menuPracticeForm).click();		
		return new PracticeFormPage(driver);
	}
	public FormsPage(WebDriver dr) {
		super(dr);
	}

}
