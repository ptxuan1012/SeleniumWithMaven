package common;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//tất các các hàm common cho selenium
public class TestBasic {
	public WebDriver driver;

	public void openWebsite(String url) {
		// Lay vi tri 1 folder
		String localDir = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", localDir + "\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/");
	}
	public String getTextAlertFrame(By locator) {
		String result = "";
		List<WebElement> txtElement = driver.findElements(locator);
		for (WebElement e : txtElement) {
			result = result + e.getText() + " ";
		}
		return result.trim(); // clear space start & end
	}
	public void closeBrowser() {
		driver.quit();
		// tab(window).close()
	}
	public String getTextByLocator(By locator) {
		String text = driver.findElement(locator).getText();
		return text;
	}

	public void closeCurrwnWindows() {
		driver.close();
	}

	public void zoomOut() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.body.style.zoom = '70%'");
	}

	public void maxmize() {
		driver.manage().window().maximize();
	}

	public void scrollToElement(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
	}

	public void scrollToEndPage() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");

	}

	public WebElement findElementByLocator(By locator) {
		return driver.findElement(locator);
	}

	// input common
	public void inputText(By locator, String text) {
		driver.findElement(locator).sendKeys(text);

	}


	public void keysEnter(By locator) {
		driver.findElement(locator).sendKeys(Keys.ENTER);
	}

	public WebElement findLocator(String value) {
		String rdXpath = "//*[text()='" + value + "']";
		By rdElement = By.xpath(rdXpath);
		WebElement element =driver.findElement(rdElement);
		return element;
	}
	public void clickRadioButtonByLabel(String radioLabel) {
		String rdXpath = "//*[text()='" + radioLabel + "']";
		By rdElement = By.xpath(rdXpath);
		driver.findElement(rdElement).click();

	}

	public void upLoadFile(By locator) {
		String localDir = System.getProperty("user.dir");
		driver.findElement(locator).sendKeys(localDir + "\\src\\main\\resources\\Image\\Xuan.jpg");
	}

	// cach 1: option ngay thang nam >> cach 2 theo practceFormPage
	public void selectYear(String numYear) {
		String numXpathYear = "//option[text()='" + numYear + "']";
		By dropYear = By.xpath(numXpathYear);
		driver.findElement(dropYear).click();
	}

	public void selectMonth(String numMonth) {
		String numXpathMonth = "//option[text()='" + numMonth + "']";
		By dropMonth = By.xpath(numXpathMonth);
		driver.findElement(dropMonth).click();
	}

	public void selectDay(String numDay) {
		String numXpathYear = "//div[text()='" + numDay + "']";
		By day = By.xpath(numXpathYear);
		driver.findElement(day).click();
	}

	public void clickCheckBoxMulti(String cbValue) {
		String cbXpath = "//*[text()='" + cbValue + "']";
		By cbElement = By.xpath(cbXpath);
		driver.findElement(cbElement).click();
	}

	public void click(By locator) {
		driver.findElement(locator).click();

	}
	


	public String getText(By locator) {
		return driver.findElement(locator).getText();

	}
	
}
