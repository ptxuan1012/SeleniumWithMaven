package tests;

import org.testng.annotations.Test;

import pages.ElementsPage;
import pages.HomePage;
import pages.Linkpages;

public class LinkTest extends TestCase{
	@Test
	public void doTC1() throws Exception {
		HomePage homePage = new HomePage(testBasic.driver);	
		homePage.testBasic.maxmize();
		homePage.testBasic.scrollToEndPage();
		ElementsPage elementsPage = homePage.clickElements();
		elementsPage.testBasic.scrollToEndPage();
		Linkpages linkPage =elementsPage.clickLinkMenu();
		//Following links will open new tab
//		linkPage.clickLink(linkPage.linkHome);
//		Thread.sleep(1000);
//		linkPage.clickLink(linkPage.dynamicLink);
//		Thread.sleep(1000);
		//Following links will send an api call
		linkPage.testBasic.scrollToEndPage();
		linkPage.inputTextLinks("Created");
		// Assert chua biet lam
		//String expected ="Link has responded with staus 301 and status text Moved Permanently";
		
	}

}
