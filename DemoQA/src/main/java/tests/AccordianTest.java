package tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AccordianPages;
import pages.AlertFramwWindowPages;
import pages.HomePage;
import pages.WidgetPage;

public class AccordianTest extends TestCase{
	@Test
	public void doTC01() throws Exception {
		HomePage homePage = new HomePage(testBasic.driver);
		homePage.testBasic.maxmize();
		homePage.testBasic.scrollToEndPage();
		WidgetPage widgetPage = homePage.clickWidget();
		widgetPage.testBasic.scrollToEndPage();
	//case1----------------------------------------------------------
		AccordianPages accordianPage= widgetPage.clickAccordian();
		
		String getAtribute1 = accordianPage.testBasic.findElementByLocator(accordianPage.accorFirst).getText();
		Thread.sleep(1000);
		Assert.assertTrue(accordianPage.isCollapseShow(accordianPage.accorFirst));
		assertTrue(getAtribute1.contains("desktop publishing software like Aldus PageMaker"));
		//-------------------------------------------------
		accordianPage.testBasic.scrollToElement(testBasic.driver.findElement(accordianPage.accorSecond2));
		accordianPage.testBasic.click(accordianPage.accorSecond2);
		String getAtribute2 = accordianPage.testBasic.findElementByLocator(accordianPage.accorSecond).getText();
		Thread.sleep(1000);
		Assert.assertTrue(accordianPage.isCollapseShow(accordianPage.accorSecond));
		assertTrue(getAtribute2.contains("1.10.33 of \"de Finibus Bonorum et Malorum"));
		//--------------------------------------------------
		accordianPage.testBasic.click(accordianPage.accorThree2);
		String getAtribute3 = accordianPage.testBasic.findElementByLocator(accordianPage.accorThree).getText();
		Thread.sleep(1000);
		Assert.assertTrue(accordianPage.isCollapseShow(accordianPage.accorThree));
		assertTrue(getAtribute3.contains("as opposed to using 'Content here"));
		
	}

}
