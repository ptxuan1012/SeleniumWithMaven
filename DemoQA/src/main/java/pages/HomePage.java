package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends Page{
	//By menuFrom =By.xpath("//h5[text()='Forms']");
	public By menuElementsXpath = By.xpath("//h5[text()='Elements']");
	public By menuForm = By.xpath("//h5[text()='Forms']");
	public By menuAlertsFrameWindows =By.xpath("//*[text()='Alerts, Frame & Windows']");
	public By menuWidgets = By.xpath("//*[text()='Widgets']");
	public By menuInteraction = By.xpath("//*[text()='Interactions']");
	public By menuBookStore = By.xpath("//h5[text()='Book Store Application']");
	
	public BookStoreApplicationPage clickBookStore() {
		driver.findElement(menuBookStore).click();
		return new BookStoreApplicationPage(driver);
	}
	
	public InteractionsPage clickInteraction() {
		driver.findElement(menuInteraction).click();
		return new InteractionsPage(driver);
	}
	
	public WidgetPage clickWidget() {
		driver.findElement(menuWidgets).click();
		return new WidgetPage(driver);
	}
	public AlertFramwWindowPages clickAlertsFrWin() {
		driver.findElement(menuAlertsFrameWindows).click();
		return new AlertFramwWindowPages(driver);
	}
	public ElementsPage clickElements() {
		driver.findElement(menuElementsXpath).click();
		return new ElementsPage(driver);
	}
	public FormsPage clickForm() {
		//Click vào Element Item
		//driver.manage().window().maximize(); 
		driver.findElement(menuForm).click();		
		return new FormsPage(driver);
	}
	

	//Dùng hàm khởi tạo (constructor) để truyền driver
	public HomePage(WebDriver dr) {
		super(dr);
	}
	}
