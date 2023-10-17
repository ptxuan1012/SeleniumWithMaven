package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.ButtonPage;
import pages.ElementsPage;
import pages.HomePage;

public class ButtonTest extends TestCase{
	@Test
	public void doTC1() {
		HomePage homePage = new HomePage(testBasic.driver);
		homePage.testBasic.maxmize();
		homePage.testBasic.scrollToEndPage();
		ElementsPage elementsPage = homePage.clickElements();
		elementsPage.testBasic.scrollToEndPage();
		ButtonPage btnTest = elementsPage.clickButtonPage();
		btnTest.testBasic.scrollToEndPage();
		btnTest.doubleClick(btnTest.btnDoubleClick);
		Assert.assertEquals(btnTest.Diplay(btnTest.resultDouble), "You have done a double click");
		btnTest.rightClick(btnTest.btnRightClick);
		btnTest.testBasic.scrollToEndPage();
		Assert.assertEquals(btnTest.Diplay(btnTest.resultRight), "You have done a right click");		
		btnTest.Click(btnTest.btnClick);
		Assert.assertEquals(btnTest.Diplay(btnTest.resultClick),"You have done a dynamic click");
	}

}
