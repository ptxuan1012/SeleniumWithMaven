package tests;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AlertFramwWindowPages;
import pages.AlertPage;
import pages.AlertPageResult;
import pages.HomePage;

public class AlertTest extends TestCase {
	// TC1: Click Button to see alert
	@Test(groups = {"AlertTest"})
	public void doTC01() {
		HomePage homePage = new HomePage(testBasic.driver);
		homePage.testBasic.maxmize();
		homePage.testBasic.scrollToEndPage();
		AlertFramwWindowPages alertFramWin = homePage.clickAlertsFrWin();
		alertFramWin.testBasic.scrollToEndPage();
		AlertPage alertPage = alertFramWin.clickAlertMenu();
		alertPage.testBasic.click(alertPage.btnSeeAlert);
		Alert alert = testBasic.driver.switchTo().alert();
		String expected = "You clicked a button";
		Assert.assertEquals(alert.getText(), expected);
		alert.accept();
	}

// TC2: On button click, alert will appear after 5 seconds
	@Test(groups = {"AlertTest"})
	public void doTC02() {
		HomePage homePage = new HomePage(testBasic.driver);
		homePage.testBasic.maxmize();
		homePage.testBasic.scrollToEndPage();
		AlertFramwWindowPages alertFramWin = homePage.clickAlertsFrWin();
		alertFramWin.testBasic.scrollToEndPage();
		AlertPage alertPage = alertFramWin.clickAlertMenu();
		alertPage.testBasic.click(alertPage.btnimerAlert);
		// testBasic.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(testBasic.driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.alertIsPresent());

		Alert alert1 = testBasic.driver.switchTo().alert();
		String expectedTimerAlertText = "This alert appeared after 5 seconds";
		String actualTimerAlertText = alert1.getText();
		Assert.assertEquals(actualTimerAlertText, expectedTimerAlertText);
		alert1.accept();
	}

	// TC3: On button click, confirm box will appear
	//@Test
	public void doTC03() {
		HomePage homePage = new HomePage(testBasic.driver);
		homePage.testBasic.maxmize();
		homePage.testBasic.scrollToEndPage();
		AlertFramwWindowPages alertFramWin = homePage.clickAlertsFrWin();
		alertFramWin.testBasic.scrollToEndPage();
		AlertPage alertPage = alertFramWin.clickAlertMenu();
		alertPage.testBasic.scrollToEndPage();
		alertPage.testBasic.click(alertPage.btnconfirmButton);
		Alert alert2 = testBasic.driver.switchTo().alert();
		String expectedconfirm = "Do you confirm action?";
		String actualconfirm = alert2.getText();
		Assert.assertEquals(actualconfirm, expectedconfirm);
		alert2.dismiss();
		String expectedOkConfirmAlert = "You selected Cancel";
		//String actualOkConfirmAlert = alertPage.getConfirmAlertString();
		String actualOkConfirmAlert=alertPage.getTextAlert(alertPage.txtConfirm);
		Assert.assertEquals(actualOkConfirmAlert, expectedOkConfirmAlert);

	}
	// TC4: On button click, prompt box will appear
	//@Test
	public void doTC04() {
		HomePage homePage = new HomePage(testBasic.driver);
		homePage.testBasic.maxmize();
		homePage.testBasic.scrollToEndPage();
		AlertFramwWindowPages alertFramWin = homePage.clickAlertsFrWin();
		alertFramWin.testBasic.scrollToEndPage();
		AlertPage alertPage = alertFramWin.clickAlertMenu();
		alertPage.testBasic.click(alertPage.btnProBtn);
		Alert alert = testBasic.driver.switchTo().alert();
		String expectedprompt = "Please enter your name";
		String actualprompt = alert.getText();
		Assert.assertEquals(actualprompt, expectedprompt);
		String inputer ="Xuan Pham";
		alert.sendKeys(inputer);
		alert.accept();
		String expectedProm="You entered "+ inputer;
		String actualProm =alertPage.getTextAlert(alertPage.txtPro);
		Assert.assertEquals(actualProm, expectedProm);
	}
}