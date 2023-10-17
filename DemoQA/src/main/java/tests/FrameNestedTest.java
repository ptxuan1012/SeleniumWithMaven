package tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import pages.AlertFramwWindowPages;
import pages.FrameNestedPage;
import pages.HomePage;

public class FrameNestedTest extends TestCase {
	@Test
	public void doTC1() {
		HomePage homePage = new HomePage(testBasic.driver);
		homePage.testBasic.maxmize();
		homePage.testBasic.scrollToEndPage();
		AlertFramwWindowPages alertFramWin = homePage.clickAlertsFrWin();
		alertFramWin.testBasic.scrollToEndPage();
		FrameNestedPage frameNested = alertFramWin.clickFrameNestedMenu();
		//frame cha con
		frameNested.testBasic.driver.switchTo().frame("frame1").switchTo().frame(0);
		String expected ="Child Iframe";
		String actualchildText = testBasic.getText(frameNested.childFrame);
		assertEquals(actualchildText, expected);
		frameNested.testBasic.driver.switchTo().parentFrame();
		String expectParen ="Parent frame";
		String actualParenText = testBasic.getText(frameNested.parenFrame);
		assertEquals(actualParenText, expectParen);
		testBasic.driver.switchTo().defaultContent();
		testBasic.driver.close();
	}
}