package tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.ProgressPage;
import pages.WidgetPage;

public class ProgressTest extends TestCase {
	// @Test
	public void doTC01() throws Exception {
		HomePage homePage = new HomePage(testBasic.driver);
		homePage.testBasic.maxmize();
		homePage.testBasic.scrollToEndPage();
		WidgetPage widgetPage = homePage.clickWidget();
		widgetPage.testBasic.scrollToEndPage();
		ProgressPage progressPage = widgetPage.clickProgess(widgetPage.menuProgress);
		// Cach 1
		progressPage.clickStartandStopandRest("Start");
		Thread.sleep(100);
		progressPage.clickStartandStopandRest("Stop");
		progressPage.clickStartandStopandRest("Start");

		WebDriverWait wait = new WebDriverWait(testBasic.driver, Duration.ofSeconds(10));

		boolean progressStatus = wait
				.until(ExpectedConditions.attributeToBe(progressPage.progressBar, "aria-valuenow", "100"));
		if (progressStatus == true) {
			wait.until(ExpectedConditions.presenceOfElementLocated(progressPage.btnReset)).click();
		}

	}

	// @Test >> chua chay duoc
	public void doTC02() throws Exception {
		HomePage homePage = new HomePage(testBasic.driver);
		homePage.testBasic.maxmize();
		homePage.testBasic.scrollToEndPage();
		WidgetPage widgetPage = homePage.clickWidget();
		widgetPage.testBasic.scrollToEndPage();
		ProgressPage progressPage = widgetPage.clickProgess(widgetPage.menuTabs);
		String actualTabFirst = progressPage.testBasic.getText(progressPage.textTab1);
		assertTrue(actualTabFirst.contains("Lorem Ipsum is simply dummy text of the printing"));
		Thread.sleep(1000);
		progressPage.testBasic.zoomOut();
		progressPage.testBasic.click(progressPage.tab22);
		String actualTab2 = progressPage.testBasic.getText(progressPage.textTab2);
		assertTrue(actualTab2.contains("The Extremes of Good and Evil) by Cicero, written in 45 BC"));
		Thread.sleep(1000);
//	progressPage.testBasic.click(progressPage.tab3);
//	String actualTab3 =progressPage.testBasic.getText(progressPage.textTab3);
//	assertTrue(actualTab3.contains("The point of using Lorem Ipsum is that it has a more-or-less"));
	}

	@Test
	public void doTC03() {
		HomePage homePage = new HomePage(testBasic.driver);
		homePage.testBasic.maxmize();
		homePage.testBasic.scrollToEndPage();
		WidgetPage widgetPage = homePage.clickWidget();
		widgetPage.testBasic.scrollToEndPage();
		ProgressPage progressPage = widgetPage.clickProgess(widgetPage.menuToolTips);
		// Instantiate Action Class
		Actions actions = new Actions(testBasic.driver);

		// Retrieve WebElement
		WebElement element = progressPage.testBasic.driver.findElement(progressPage.btnToolTip);

		// Using the action class to mimic mouse hover
		actions.moveToElement(element).perform();
		WebElement toolTip = progressPage.testBasic.driver.findElement(By.xpath("//*[@id='toolTipButton']"));

		// To get the tool tip text and assert
		String toolTipText = toolTip.getText();
		System.out.println("toolTipText-->" + toolTipText);
	}

}
