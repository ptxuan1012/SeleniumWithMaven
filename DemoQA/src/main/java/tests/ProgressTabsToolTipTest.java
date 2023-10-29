package tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.ProgressTabTooltipPage;
import pages.WidgetPage;

public class ProgressTabsToolTipTest extends TestCase {
	// @Test
	public void doTC01() throws Exception {
		HomePage homePage = new HomePage(testBasic.driver);
		homePage.testBasic.maxmize();
		homePage.testBasic.scrollToEndPage();
		WidgetPage widgetPage = homePage.clickWidget();
		widgetPage.testBasic.scrollToEndPage();
		ProgressTabTooltipPage progressPage = widgetPage.clickProgess(widgetPage.menuProgress);
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
//Tabs
	//@Test
	public void doTC02() throws Exception {
		HomePage homePage = new HomePage(testBasic.driver);
		homePage.testBasic.maxmize();
		homePage.testBasic.scrollToEndPage();
		WidgetPage widgetPage = homePage.clickWidget();
		widgetPage.testBasic.scrollToEndPage();
		ProgressTabTooltipPage progressPage = widgetPage.clickProgess(widgetPage.menuTabs);
		String actualTabFirst = progressPage.testBasic.getText(progressPage.textTab1);
		assertTrue(actualTabFirst.contains("Lorem Ipsum is simply dummy text of the printing"));
		Thread.sleep(1000);
		progressPage.testBasic.click(progressPage.tab2);
		String actualTab2 = progressPage.testBasic.getText(progressPage.textTab2);
		assertTrue(actualTab2.contains("The Extremes of Good and Evil) by Cicero, written in 45 BC"));
		Thread.sleep(1000);
		progressPage.testBasic.click(progressPage.tab3);
		String actualTab3 = progressPage.testBasic.getText(progressPage.textTab3);
		assertTrue(actualTab3.contains("The point of using Lorem Ipsum is that it"));
	}
//Tooltip
	@Test
	public void doTC03() {
		HomePage homePage = new HomePage(testBasic.driver);
		homePage.testBasic.maxmize();
		homePage.testBasic.scrollToEndPage();
		WidgetPage widgetPage = homePage.clickWidget();
		widgetPage.testBasic.scrollToEndPage();
		ProgressTabTooltipPage progressPage = widgetPage.clickProgess(widgetPage.menuToolTips);
		// Instantiate Action Class
		Actions actions = new Actions(testBasic.driver);
		// Retrieve WebElement
		WebElement element = progressPage.testBasic.driver.findElement(progressPage.btnToolTip);

		// Using the action class to mimic mouse hover
		actions.moveToElement(element).perform();
		actions.pause(5000).perform();
		
		WebDriverWait wait = new WebDriverWait(testBasic.driver, Duration.ofSeconds(3));
		wait.until(ExpectedConditions.visibilityOfElementLocated(progressPage.hvToolTip));

		String actualTooltip = testBasic.getTextByLocator(progressPage.hvToolTip);
		String expectedTooltip = "You hovered over the Button";

		Assert.assertEquals(actualTooltip, expectedTooltip);

	}

}
