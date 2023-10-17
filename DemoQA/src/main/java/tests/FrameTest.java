package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AlertFramwWindowPages;
import pages.FramePage;
import pages.HomePage;

public class FrameTest extends TestCase{
	@Test
	public void doTC1() {
		HomePage homePage = new HomePage(testBasic.driver);
		homePage.testBasic.maxmize();
		homePage.testBasic.scrollToEndPage();
		AlertFramwWindowPages alertFramWin = homePage.clickAlertsFrWin();
		alertFramWin.testBasic.scrollToEndPage();
		FramePage framePage = alertFramWin.clickFrameMenu();
		framePage.testBasic.driver.switchTo().frame("frame1");
		String actualFrame = framePage.testBasic.getTextAlertFrame(framePage.txtIframe);
		String expectedFrame = "This is a sample page";
		Assert.assertEquals(actualFrame, expectedFrame);
		testBasic.driver.switchTo().defaultContent();
		//lam viec voi frame 2
		framePage.testBasic.driver.switchTo().frame("frame2");
		String actualFrame2 = framePage.testBasic.getTextAlertFrame(framePage.txtIframe);
		String expectedFrame2 = "This is a sample page";
		Assert.assertEquals(actualFrame, expectedFrame);
		testBasic.driver.switchTo().defaultContent();
		//lam viec voi frame 2
	}
	
}
