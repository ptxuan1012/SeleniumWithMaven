package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AlertFramwWindowPages;
import pages.BrowserWindowPage;
import pages.ElementsPage;
import pages.HomePage;
import pages.NewTabPage;
import pages.NewWindowMessagePage;
import pages.NewWindowPage;

public class WindowTest extends TestCase{
	@Test
	public void doTC01() throws Exception { 
		HomePage homePage = new HomePage(testBasic.driver);
		homePage.testBasic.maxmize();
		homePage.testBasic.scrollToEndPage();
		AlertFramwWindowPages alertFramWin = homePage.clickAlertsFrWin();
		alertFramWin.testBasic.scrollToEndPage();
	//case1----------------------------------------------------------
		BrowserWindowPage browserWin =alertFramWin.clickBrowserWinPage();
		browserWin.testBasic.scrollToEndPage();
		NewTabPage newTabPage = browserWin.clickNewTablePage();
		String expectedNewTab ="This is a sample page";
		String actualNewTab = testBasic.getText(newTabPage.textNewTable);
		Assert.assertEquals(actualNewTab, expectedNewTab);	
		Thread.sleep(1000);
	//case2----------------------------------------------------------
		BrowserWindowPage switchBrowCurren =newTabPage.swithBroweCurren();	
		//switchBrowCurren.testBasic.scrollToEndPage();
		NewWindowPage newWinDow= switchBrowCurren.clickNewWindowPage();		
		String expectedNewWinDow ="This is a sample page";
		String actualNewWinDow = testBasic.getText(newWinDow.textNewWindow);
		Assert.assertEquals(actualNewWinDow, expectedNewWinDow);
	Thread.sleep(1000);
	//case3----------------------------------------------------------
		BrowserWindowPage switchBrowCurren2 = newWinDow.swithBroweCurren();
		NewWindowMessagePage newMessWindow = switchBrowCurren2.clickMessWinDow();
		String expectedMessWinD ="Knowledge increases by sharing but not by saving. Please share this website with your friends and in your organization.";
		String actualMessWinD = testBasic.getText(newMessWindow.textMessWinDow);
		Assert.assertEquals(actualMessWinD, expectedMessWinD);
	}
}
